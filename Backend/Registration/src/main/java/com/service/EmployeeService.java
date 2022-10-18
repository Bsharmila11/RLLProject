package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository EmployeeRepository;
	
	public String storeEmployee(Employee employee) {
		EmployeeRepository.save(employee);
		return "Employee details stored";
	}
	
	public List<Employee> getAllEmployees() {
		return EmployeeRepository.findAll();
	}
	
	public Optional<Employee> findEmployeeId(int id) {
		return EmployeeRepository.findById(id);
	}
	
	
	public String deleteEmployee(int id) {
		Optional<Employee> result  = EmployeeRepository.findById(id);
		if(result.isPresent()) {
			Employee e = result.get();
			EmployeeRepository.delete(e);
			return "Employee deleted successfully";
		}else {
			return "Employee not present";
		}
	}
	
	public String updateEmployee(Employee employee) {
		Optional<Employee> result  = EmployeeRepository.findById(employee.getId());
		if(result.isPresent()) {
			Employee e = result.get();
			e.setFirstname(employee.getFirstname());
			e.setLastname(employee.getLastname());
			e.setRole(employee.getRole());
			e.setEmailid(employee.getEmailid());
			EmployeeRepository.saveAndFlush(e);
			return "Employee details has been updated successfully";
		}else {
			return "Employee not present";
		}
	}
	
	public String updateEmployeebyuser(Employee employee) {
		Optional<Employee> result  = EmployeeRepository.findById(employee.getId());
		if(result.isPresent()) {
			Employee e = result.get();
			e.setFirstname(employee.getFirstname());
			e.setLastname(employee.getLastname());
			e.setEmailid(employee.getEmailid());
			e.setGender(employee.getGender());
			e.setDob(employee.getDob());
			EmployeeRepository.saveAndFlush(e);
			return "Employee details has been updated successfully";
		}else {
			return "Employee not present";
		}
	}

}
