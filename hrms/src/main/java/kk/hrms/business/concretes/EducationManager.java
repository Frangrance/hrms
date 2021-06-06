package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.EducationService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.dataAccess.abstracts.EducationDao;
import kk.hrms.entities.concretes.Education;

@Service
public class EducationManager implements EducationService{

	private EducationDao educationDao;
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("education added");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(),"educations listed");
	}

	@Override
	public DataResult<List<Education>> getByJobhunterOrderByGraduationDateDesc(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Education>>(this.educationDao.getByJobhunter_userIdOrderByGraduationDateDesc(jobHunterId));
	}

}
