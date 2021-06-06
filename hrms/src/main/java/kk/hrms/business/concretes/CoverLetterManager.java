package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.CoverLetterService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.dataAccess.abstracts.CoverLetterDao;
import kk.hrms.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService {

	private CoverLetterDao coverLetterDao;

	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public Result add(CoverLetter letter) {
		this.coverLetterDao.save(letter);
		return new SuccessResult("letter added");
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
	
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAll(),"letters listed");
	}

	@Override
	public DataResult<List<CoverLetter>> getByJobhunter(int jobHunterId) {
		
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.getByJobhunter_userId(jobHunterId));
	}
	
}