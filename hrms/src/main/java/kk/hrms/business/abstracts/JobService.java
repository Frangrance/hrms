package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.DataResult;
import kk.hrms.core.utilities.Result;
import kk.hrms.entities.concretes.Job;

public interface JobService {

	Result add(Job job);
	
	DataResult<List<Job>> getAll();
	
}
