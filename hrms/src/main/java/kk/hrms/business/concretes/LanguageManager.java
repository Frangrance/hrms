package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.LanguageService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.dataAccess.abstracts.LanguageDao;
import kk.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;
	@Autowired
	public LanguageManager(LanguageDao languagedao) {
		super();
		this.languageDao = languagedao;
	}

	@Override
	public Result add(Language lang) {
		this.languageDao.save(lang);
		return new SuccessResult("Language added");
	}

	@Override
	public DataResult<List<Language>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll(),"languages listed");
	}

	@Override
	public DataResult<List<Language>> getByJobhunter(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Language>>(this.languageDao.getByJobhunter_userId(jobHunterId));
	}
}