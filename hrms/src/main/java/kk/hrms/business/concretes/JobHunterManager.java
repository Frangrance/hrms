package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.AbilityService;
import kk.hrms.business.abstracts.CoverLetterService;
import kk.hrms.business.abstracts.EducationService;
import kk.hrms.business.abstracts.ExperienceService;
import kk.hrms.business.abstracts.ImageService;
import kk.hrms.business.abstracts.JobHunterService;
import kk.hrms.business.abstracts.LanguageService;
import kk.hrms.business.abstracts.LinkService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.dataAccess.abstracts.JobHunterDao;
import kk.hrms.entities.concretes.JobHunter;
import kk.hrms.entities.dto.CvDto;

@Service
public class JobHunterManager implements JobHunterService {
	
	private JobHunterDao jobHunterDao;
	private AbilityService abilityService;
	private CoverLetterService coverLetterService;
	private EducationService educationService;
	private ExperienceService experienceService;
	private ImageService imageService;
	private LanguageService languageService;
	private LinkService linkService;

	@Autowired
	public JobHunterManager(JobHunterDao jobHunterDao, AbilityService abilityService, CoverLetterService coverLetterService,
			EducationService educationService, ExperienceService experienceService, ImageService imageService,
			LanguageService languageService, LinkService linkService) {
		super();
		this.jobHunterDao = jobHunterDao;
		this.abilityService = abilityService;
		this.coverLetterService = coverLetterService;
		this.educationService = educationService;
		this.experienceService = experienceService;
		this.imageService = imageService;
		this.languageService = languageService;
		this.linkService = linkService;
	}

	@Override
	public Result add(JobHunter jobHunter) {	
        this.jobHunterDao.save(jobHunter);
              return new SuccessResult("Candidate Added");
		
	}

	@Override
	public DataResult<List<JobHunter>> getAll() {
		
		return new SuccessDataResult<List<JobHunter>>( this.jobHunterDao.findAll(),"Candidates Listed");
	}

	@Override
	public DataResult<CvDto> getCv(int jobHunterId) {
		CvDto cv=new CvDto();
		cv.setJobhunter(this.get(jobHunterId).getData());
		cv.setAbilities(this.abilityService.getByJobhunter(jobHunterId).getData());
		cv.setCoverLetters(this.coverLetterService.getByJobhunter(jobHunterId).getData());
		cv.setEducations(this.educationService.getByJobhunterOrderByGraduationDateDesc(jobHunterId).getData());
		cv.setExperiences(this.experienceService.getByJobhunterOrderByLeaveDateDesc(jobHunterId).getData());
		cv.setImage(this.imageService.getByJobhunter(jobHunterId).getData());
		cv.setLanguages(this.languageService.getByJobhunter(jobHunterId).getData());
		cv.setLinks(this.linkService.getByJobhunter(jobHunterId).getData());
		
		return new SuccessDataResult<CvDto>(cv);
	}

	@Override
	public DataResult<JobHunter> get(int id) {
		
		return new SuccessDataResult<JobHunter>(this.jobHunterDao.findById(id).get());
	}

}