package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Sort;

import kk.hrms.business.abstracts.JobAdvertisementService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kk.hrms.entities.concretes.JobAdvertisement;
import kk.hrms.entities.dto.AdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao advertisement;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao advertisement) {
		super();
		this.advertisement = advertisement;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.advertisement.findAll());
	}

	@Override
	public Result add(JobAdvertisement advertisements) {
		this.advertisement.save(advertisements);
		return new SuccessResult("Job advertisements added!");
	}

	@Override
	public DataResult<List<AdvertisementDto>> getAllByActive() {
		
		return new SuccessDataResult<List<AdvertisementDto>>(this.advertisement.getAdvertisementDetailByActive());
	}
	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByDate() {
		Sort sort = Sort.by(Sort.Direction.ASC,"appDeadline");
		return new SuccessDataResult<List<JobAdvertisement>>(this.advertisement.findAll(sort));
	}

	@Override
	public DataResult<List<AdvertisementDto>> getAllDetail() {
	
		return new SuccessDataResult<List<AdvertisementDto>>(this.advertisement.getByAdvertisementDetail());
	}

	@Override
	public Result update(JobAdvertisement advertisement) {
		
		return null;
	}

}
