package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer>{

}