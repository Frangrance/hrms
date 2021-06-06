package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.entities.concretes.Employee;


public interface EmployeeService {

	Result add(Employee employee);

	DataResult<List<Employee>> getAll();

}
