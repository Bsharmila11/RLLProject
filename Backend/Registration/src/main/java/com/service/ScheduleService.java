package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Schedule;
import com.repository.ScheduleRepository;

@Service
public class ScheduleService {
	@Autowired
	ScheduleRepository schedulerepository;
	
	public String storeSchedule(Schedule schedule) {
		schedulerepository.save(schedule);
		return "Schedule has been stored";
	}
	
	public String findScheduleById(int eid) {
		return schedulerepository.findScheduleById(eid);
		
		}

}
