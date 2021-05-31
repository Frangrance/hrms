package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kk.hrms.business.abstracts.JobPositionService;
import kk.hrms.dataAccess.abstracts.JobPositionDao;
import kk.hrms.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService {

private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

}
