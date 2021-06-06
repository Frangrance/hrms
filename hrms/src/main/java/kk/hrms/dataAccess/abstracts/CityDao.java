package kk.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kk.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City,Integer> {

}
