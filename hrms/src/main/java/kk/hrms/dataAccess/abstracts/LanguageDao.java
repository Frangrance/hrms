package kk.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kk.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language,Integer> {

	List<Language> getByJobhunter_userId(int jobHunterId);
}