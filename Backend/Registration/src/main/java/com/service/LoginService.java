package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepository;
	public String signIn(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
					Login ll = result.get();
					if(ll.getPassword().equals(login.getPassword())) {		
						
				if(login.getTypeOfUser().equals(ll.getTypeOfUser()) && login.getTypeOfUser().equals("admin")) {
							return "Admin sucessfully login";
				}else if(login.getTypeOfUser().equals(ll.getTypeOfUser()) && login.getTypeOfUser().equals("user")){
							return "User successfully login";
						}else {
							return "Invalid details";
						}					
					}else {
						return "InValid password";
					}
		}else {
			return "InValid emailId";
		}		
	}
	public String signUp(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
					return "Email Id alreay exists";
		}else {
			if(login.getTypeOfUser().equals("admin")) {
				return "You can't create admin account";
			}else {
				loginRepository.save(login);
				return "Account created successfully";
			}
			
		}	
	}
	
	public String changePassword(Login login) 
	{
		Optional<Login> op=loginRepository.findById(login.getEmailid());
		if(op.isPresent()) 
		{
			Login l=op.get();
			if(l.getPassword().equals(login.getPassword())) 
			{
				return "record updation failure";
			}
			else 
			{
			l.setPassword(login.getPassword());
			loginRepository.saveAndFlush(l);    //update existing records
			return "Record updated successfully";
			}
		}
		else 
		{
			 //employeeRepository.save(emp);
			 return "Record not present";
		}
	}


}