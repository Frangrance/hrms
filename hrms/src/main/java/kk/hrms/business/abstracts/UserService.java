package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}
