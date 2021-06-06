package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.entities.concretes.CoverLetter;

public interface CoverLetterService {
	Result add(CoverLetter letter);
    DataResult<List<CoverLetter>> getByJobhunter(int jobHunterId);
	DataResult<List<CoverLetter>> getAll();
}
