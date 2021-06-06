package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.entities.concretes.Link;

public interface LinkService {
	
	Result add(Link link);
	DataResult<List<Link>> getAll();
	DataResult<List<Link>>getByJobhunter(int jobHunterId);
	
}
