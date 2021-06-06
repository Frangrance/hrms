package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.entities.concretes.JobAdvertisement;
import kk.hrms.entities.dto.AdvertisementDto;

public interface JobAdvertisementService {
	
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<AdvertisementDto>> getAllDetail();
	DataResult<List<AdvertisementDto>> getAllByActive();
	DataResult<List<JobAdvertisement>> getAllSortedByDate();
	Result add(JobAdvertisement advertisement);
	
}
