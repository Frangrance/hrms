package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.DataResult;
import kk.hrms.core.utilities.Result;
import kk.hrms.entities.concretes.Language;

public interface LanguageService {
	
	Result add(Language lang);
	DataResult<List<Language>> getAll();
	DataResult<List<Language>>getByJobhunter(int jobHunterId);
	
}
