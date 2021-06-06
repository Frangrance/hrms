package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.JobService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.ErrorResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.dataAccess.abstracts.JobDao;
import kk.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public Result add(Job job) {
		
		if(this.jobPositionExist(job.getName()).getData() != null) {
			
			return new ErrorResult( "Job Title exist");
		}
		
		this.jobDao.save(job);
		return new SuccessResult("Job Titles Added!");
	}
	
	private DataResult<Job> jobPositionExist(String jobName) {
		
		return new SuccessDataResult<Job>(this.jobDao.findByName(jobName));
		
	}

	@Override
	public DataResult<List<Job>> getAll() {
		
		return new SuccessDataResult<List<Job>>( this.jobDao.findAll(),"Job titles listed");
	}

}