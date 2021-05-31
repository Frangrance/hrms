package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kk.hrms.business.abstracts.SystemUserService;
import kk.hrms.dataAccess.abstracts.SystemUserDao;
import kk.hrms.entities.concretes.SystemUser;

public class SystemUserManager implements SystemUserService{

	private SystemUserDao systemUserDao;
	
	@Autowired
	public SystemUserManager(SystemUserDao systemUserDao) {
		super();
		this.systemUserDao = systemUserDao;
	}

	@Override
	public List<SystemUser> getAll() {
		return this.systemUserDao.findAll();
	}

}
