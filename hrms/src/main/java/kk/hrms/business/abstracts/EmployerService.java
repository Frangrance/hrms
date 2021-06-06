package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.DataResult;
import kk.hrms.core.utilities.Result;
import kk.hrms.entities.concretes.Employer;

public interface EmployerService {
	
	Result add(Employer employer);
	
	DataResult<List<Employer>> getAll();
}
