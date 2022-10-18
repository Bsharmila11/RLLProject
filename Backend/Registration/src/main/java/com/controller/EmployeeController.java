package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("employee")
@CrossOrigin

public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	@PostMapping(value = "storeEmployee",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployee(@RequestBody Employee employee) {
		return employeeservice.storeEmployee(employee);
	}
	
	@PatchMapping(value = "updateEmployee",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateEmployee(@RequestBody Employee employee) {
		return employeeservice.updateEmployee(employee);
	}
	
	@GetMapping(value="findEmployeeId/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Employee> getEmployeebyId(@PathVariable("id")int id) {
		return employeeservice.findEmployeeId(id);
	}
	
	@GetMapping(value="findAllEmployee",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees() {
		return employeeservice.getAllEmployees();
	}
	
	
	@DeleteMapping(value="deleteEmployee/{id}")
	public String deleteEmployeeUsingId(@PathVariable("id") int id) {
		return employeeservice.deleteEmployee(id);
	}
	
	@PatchMapping(value = "updateEmployeebyuser",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateEmployeebyuser(@RequestBody Employee employee) {
		return employeeservice.updateEmployeebyuser(employee);
	}

}
