package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.ExperienceService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.dataAccess.abstracts.ExperienceDao;
import kk.hrms.entities.concretes.Experience;

@Service
public class ExperienceManager implements ExperienceService {

	private ExperienceDao experienceDao;
	
	@Autowired
	public ExperienceManager(ExperienceDao experienceDao) {
		super();
		this.experienceDao = experienceDao;
	}

	@Override
	public Result add(Experience experience) {
		this.experienceDao.save(experience);
		return new SuccessResult("exp added!");
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		
		return new SuccessDataResult<List<Experience>>(this.experienceDao.findAll(),"exps listed");
	}

	@Override
	public DataResult<List<Experience>> getByJobhunterOrderByLeaveDateDesc(int jobHunterId) {
		
		return new SuccessDataResult<List<Experience>>(this.experienceDao.getByJobhunter_userIdOrderByLeaveDateDesc(jobHunterId));
	}

}
