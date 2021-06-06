package kk.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kk.hrms.entities.concretes.Ability;

public interface AbilityDao extends JpaRepository<Ability, Integer> {

	List<Ability> getByJobhunter_userId(int jobHunterId);
}
