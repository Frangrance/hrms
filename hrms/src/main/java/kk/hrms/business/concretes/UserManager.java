package kk.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.UserService;
import kk.hrms.core.entities.concretes.User;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.dataAccess.abstracts.UserDao;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public DataResult<User> checkEmail(String email) {
		
	return new SuccessDataResult<User>(this.userDao.findByEmail(email));
	}
}