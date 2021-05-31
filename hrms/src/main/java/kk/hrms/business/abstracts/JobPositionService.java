package kk.hrms.business.abstracts;

import java.util.List;

import kk.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
