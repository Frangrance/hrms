package kk.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kk.hrms.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education,Integer> {
	
	List<Education>getByJobhunter_userIdOrderByGraduationDateDesc(int jobHunterId);
}
