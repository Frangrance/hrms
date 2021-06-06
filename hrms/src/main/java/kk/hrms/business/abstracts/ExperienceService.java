package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.entities.concretes.Experience;

public interface ExperienceService {
	
	Result add(Experience exp);
	DataResult<List<Experience>>getByJobhunterOrderByLeaveDateDesc(int jobHunterId);
	DataResult<List<Experience>> getAll();
	
}
