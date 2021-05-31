package kk.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kk.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
