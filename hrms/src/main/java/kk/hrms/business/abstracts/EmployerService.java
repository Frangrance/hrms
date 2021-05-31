package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
}
