package kk.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.AuthService;
import kk.hrms.business.abstracts.EmployerService;
import kk.hrms.business.abstracts.JobHunterService;
import kk.hrms.business.abstracts.VerifyCodeService;
import kk.hrms.core.utilities.adapters.MernisService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.ErrorDataResult;
import kk.hrms.core.utilities.results.ErrorResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.core.utilities.verification.VerificationService;
import kk.hrms.entities.concretes.Employer;
import kk.hrms.entities.concretes.JobHunter;

@Service
public class AuthManager implements AuthService {

	private JobHunterService jobHunterService;
	private EmployerService employerService;
	private MernisService mernisService;
	private VerificationService verificationService;
	private VerifyCodeService verifyCodeService;

	@Autowired
	public AuthManager(JobHunterService jobHunterService, VerifyCodeService veriCode, EmployerService employerService,
			MernisService mernisService, VerificationService veri) {
		super();
		this.jobHunterService = jobHunterService;
		this.employerService = employerService;
		this.mernisService = mernisService;
		this.verificationService = veri;
		this.verifyCodeService = veriCode;
	}

	@Override
	public DataResult<JobHunter> registerJobHunter(JobHunter jobHunter, String confirmPassword) {

		if (!this.mernisControl(jobHunter)) {
			return new ErrorDataResult<JobHunter>("Not Real Person!");
		}

		if (this.confirmPass(jobHunter.getPassword(), confirmPassword).isSuccess()) {

			var register = this.jobHunterService.add(jobHunter);
			this.verifyCodeService.add(jobHunter.getUserId());
			this.verificationService.verifyByCode(this.verifyCodeService.generateCode(), jobHunter.getEmail());
			return new SuccessDataResult<JobHunter>(register.getMessage());
		}
		return new ErrorDataResult<JobHunter>("register failed");

	}

	@Override
	public DataResult<Employer> registerEmployer(Employer employer, String confirmPassword) {

		if (!this.confirmPass(employer.getPassword(), confirmPassword).isSuccess()) {
			if (this.checkEmailDomain(employer.getEmail(), employer.getWebsite()).isSuccess()) {

				this.employerService.add(employer);
				this.verificationService.verifyByEmployee(employer.getUserId());
				return new SuccessDataResult<Employer>(employer, "Register Success");
			}
			return new ErrorDataResult<Employer>(employer, "Domain not match");

		}
		return new ErrorDataResult<Employer>("register failed");
	}

	private Result confirmPass(String password, String confirmPassword) {

		if (password.equals(confirmPassword)) {

			return new SuccessResult("Password Match!");
		}
		return new ErrorResult("Password not match!");

	}

	private Result checkEmailDomain(String email, String website) {

		String[] mail = email.split("@", 2);
		String web = website.substring(4);
		if (mail[1].equals(web)) {
			return new SuccessResult("Domain Match");
		}
		return new ErrorResult("Domain not match");
	}

	private boolean mernisControl(JobHunter jobHunter) {

		var result = this.mernisService.validatePerson(jobHunter.getNationalIdentity(), jobHunter.getFirstName(),
				jobHunter.getLastName(), jobHunter.getBirthDate());

		return result;
	}

}