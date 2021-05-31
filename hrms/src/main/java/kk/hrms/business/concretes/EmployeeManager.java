package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kk.hrms.business.abstracts.EmployeeService;
import kk.hrms.dataAccess.abstracts.EmployeeDao;
import kk.hrms.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.findAll();
	}

}
