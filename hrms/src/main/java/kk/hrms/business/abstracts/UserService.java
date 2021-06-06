package kk.hrms.business.abstracts;

import kk.hrms.core.entities.concretes.User;
import kk.hrms.core.utilities.DataResult;

public interface UserService {
	
	DataResult<User> checkEmail(String email);
	
}
