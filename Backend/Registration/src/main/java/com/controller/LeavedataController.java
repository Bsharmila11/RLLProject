package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Leavedata;
import com.bean.Salary;
import com.service.LeavedataService;

@RestController
@RequestMapping("leavedata")
@CrossOrigin
public class LeavedataController {
	@Autowired
	LeavedataService leavedataservice;
	@PostMapping(value = "storeLeavedata",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeLeavedata(@RequestBody Leavedata leavedata) {
		return leavedataservice.storeLeavedata(leavedata);
	}
	

}
