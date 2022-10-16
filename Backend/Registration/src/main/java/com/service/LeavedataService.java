package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Leavedata;

import com.repository.LeavedataRepository;

@Service
public class LeavedataService {
	@Autowired
	LeavedataRepository leavedatarepository;
	public String storeLeavedata(Leavedata leavedata) {
		leavedatarepository.save(leavedata);
		return "leave details stored";
	}

}