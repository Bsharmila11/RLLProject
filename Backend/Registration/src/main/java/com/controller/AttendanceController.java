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

import com.bean.Attendance;
import com.service.AttendanceService;

@RestController
@RequestMapping("attendance")
@CrossOrigin
public class AttendanceController {
	@Autowired
	AttendanceService attendanceservice;
	@PostMapping(value = "storeAttendance",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeAttendance(@RequestBody Attendance attendance) {
		return attendanceservice.storeAttendance(attendance);
	}
	
	@GetMapping(value="findattendance/{eid}")
	public String findAttendanceById(@PathVariable("eid") int eid) {
		return attendanceservice.findAttendanceById(eid);
	}


}
