package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.entities.concretes.SystemUser;

public interface SystemUserService {
	List<SystemUser> getAll();
}
