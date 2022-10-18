package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Attendance;
import com.bean.Salary;
import com.repository.AttendanceRepository;

@Service
public class AttendanceService {
	@Autowired
	AttendanceRepository attendancerepository;
	public String storeAttendance(Attendance attendance) {
		attendancerepository.save(attendance);
		return "Attendance details stored";
	}
	
	public String findAttendanceById(int eid) {
		return attendancerepository.findAttendanceById(eid);
		
		}
}
