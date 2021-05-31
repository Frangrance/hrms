package kk.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kk.hrms.entities.concretes.SystemUser;

public interface SystemUserDao extends JpaRepository<SystemUser, Integer>{

}
