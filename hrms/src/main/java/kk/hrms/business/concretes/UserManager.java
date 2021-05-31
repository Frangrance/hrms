package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kk.hrms.business.abstracts.UserService;
import kk.hrms.dataAccess.abstracts.UserDao;
import kk.hrms.entities.concretes.User;

public class UserManager implements UserService {

private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

}
