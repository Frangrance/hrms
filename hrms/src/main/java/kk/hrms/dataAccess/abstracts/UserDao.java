package kk.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kk.hrms.core.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer> {
	
	User findByEmail(String email);
	
}
