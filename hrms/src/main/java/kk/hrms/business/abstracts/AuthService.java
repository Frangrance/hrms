package kk.hrms.business.abstracts;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.entities.concretes.Employer;
import kk.hrms.entities.concretes.JobHunter;

public interface AuthService {
	
	DataResult<JobHunter> registerJobHunter(JobHunter jobHunter,String confirmPassword);
	DataResult<Employer> registerEmployer(Employer employer,String confirmPassword);
	
}
