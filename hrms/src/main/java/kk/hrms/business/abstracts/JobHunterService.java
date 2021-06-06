package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.DataResult;
import kk.hrms.core.utilities.Result;
import kk.hrms.entities.concretes.JobHunter;
import kk.hrms.entities.dto.CvDto;

public interface JobHunterService {

	Result add(JobHunter jobHunter);
	
	DataResult<List<JobHunter>> getAll();
	DataResult<JobHunter> get(int id);
	DataResult<CvDto> getCv(int jobHunterId);
}
