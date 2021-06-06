package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.DataResult;
import kk.hrms.core.utilities.Result;
import kk.hrms.entities.concretes.JobAdvertisement;
import kk.hrms.entities.dto.AdvertisementDto;

public interface JobAdvertisementService {
	
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<AdvertisementDto>> getAllDetail();
	DataResult<List<AdvertisementDto>> getAllByActive();
	DataResult<List<JobAdvertisement>> getAllSortedByDate();
	Result add(JobAdvertisement advertisement);
	Result update(JobAdvertisement advertisement);
	
}
