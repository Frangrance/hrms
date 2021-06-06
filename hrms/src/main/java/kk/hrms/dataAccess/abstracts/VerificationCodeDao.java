package kk.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kk.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeDao extends JpaRepository<VerificationCode,Integer>  {

}