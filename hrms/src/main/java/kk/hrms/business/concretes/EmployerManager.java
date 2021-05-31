package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kk.hrms.business.abstracts.EmployerService;
import kk.hrms.dataAccess.abstracts.EmployerDao;
import kk.hrms.entities.concretes.Employer;

public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

}
