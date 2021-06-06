package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();
}
