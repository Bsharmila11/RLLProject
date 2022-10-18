package com.repository;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bean.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer>{
	@Query("select s.salary from Salary s where eid=:eid")
	 public String findSalaryById(int eid);

}
