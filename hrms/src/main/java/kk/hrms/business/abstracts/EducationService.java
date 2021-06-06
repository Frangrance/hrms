package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.entities.concretes.Education;

public interface EducationService {

	Result add(Education education);

	DataResult<List<Education>> getAll();

	DataResult<List<Education>> getByJobhunterOrderByGraduationDateDesc(int jobHunterId);

}
