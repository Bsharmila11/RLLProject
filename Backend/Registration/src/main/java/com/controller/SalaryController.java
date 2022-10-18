package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.bean.Salary;
import com.service.SalaryService;

@RestController
@RequestMapping("salary")
@CrossOrigin
public class SalaryController {
	@Autowired
	SalaryService salaryservice;
	@PostMapping(value = "storeSalary",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeSalary(@RequestBody Salary salary) {
		return salaryservice.storeSalary(salary);
	}
	
	
	
	@GetMapping(value="findsalary/{eid}")
	public String findSalaryById(@PathVariable("eid") int eid) {
		return salaryservice.findSalaryById(eid);
	}

}
