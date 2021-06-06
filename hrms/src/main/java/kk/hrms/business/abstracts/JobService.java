package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.entities.concretes.Job;

public interface JobService {

	Result add(Job job);
	
	DataResult<List<Job>> getAll();
	
}
