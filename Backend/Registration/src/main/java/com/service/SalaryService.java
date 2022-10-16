package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.Employee;
import com.bean.Salary;
import com.repository.SalaryRepository;

@Service
public class SalaryService {
	@Autowired
	SalaryRepository salaryrepository;
	public String storeSalary(Salary salary) {
		salaryrepository.save(salary);
		return "Salary details stored";
	}
	
	public String findSalaryById(int salaryid) {
		Optional<Salary> result  = salaryrepository.findById(salaryid);
		if(result.isPresent()) {
			Salary s = result.get();
			return s.toString();
		}else {
			return "Salary not present";
		}
	}
	
	

}
