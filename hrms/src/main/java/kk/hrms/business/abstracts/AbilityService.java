package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.entities.concretes.Ability;

public interface AbilityService {
	
	Result add(Ability ability);
	
	DataResult<List<Ability>> getAll();
	DataResult<List<Ability>> getByJobhunter(int JobHunterId);
	
}
