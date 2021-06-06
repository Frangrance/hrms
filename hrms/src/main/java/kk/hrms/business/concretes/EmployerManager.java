package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.EmployerService;
import kk.hrms.business.abstracts.UserService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.ErrorResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.dataAccess.abstracts.EmployerDao;
import kk.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	private UserService userService;

	@Autowired
	public EmployerManager(EmployerDao employerDao,UserService userService) {
		super();
		this.employerDao = employerDao;
		this.userService = userService;
	}

	@Override
	public Result add(Employer employer) {
		
		if(this.userService.checkEmail(employer.getEmail()).getData() !=null) {
			
			return new ErrorResult("Email zaten var");
		}
		
		this.employerDao.save(employer);
		return new SuccessResult("İşveren eklendi.");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Employer Listed");
	}
}
