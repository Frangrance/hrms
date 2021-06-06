package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.EmployeeService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.dataAccess.abstracts.EmployeeDao;
import kk.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeedao;

	@Autowired
	public EmployeeManager(EmployeeDao employeedao) {
		super();
		this.employeedao = employeedao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(this.employeedao.findAll());
	}

	@Override
	public Result add(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
}
