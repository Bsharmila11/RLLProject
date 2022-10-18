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


import com.bean.Schedule;
import com.service.ScheduleService;

@RestController
@RequestMapping("schedule")
@CrossOrigin
public class ScheduleController {
	@Autowired
	ScheduleService scheduleservice;
	@PostMapping(value = "storeSchedule",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeSchedule(@RequestBody Schedule schedule) {
		return scheduleservice.storeSchedule(schedule);
	}
	
	@GetMapping(value="findschedule/{eid}")
	public String findScheduleById(@PathVariable("eid") int eid) {
		return scheduleservice.findScheduleById(eid);
	}
}
