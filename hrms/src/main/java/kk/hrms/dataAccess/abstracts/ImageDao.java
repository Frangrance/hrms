package kk.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kk.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image,Integer> {

	Image getByJobhunter_userId(int jobHunterId);
}