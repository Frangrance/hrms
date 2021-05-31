package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> getAll();
}
