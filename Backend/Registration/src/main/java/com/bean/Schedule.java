package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Schedule {
	@Id
	private int sid;
	private Integer eid;
	private String date;
	private int time;
	private String task;
	
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Schedule(int sid, Integer eid, String date, int time, String task) {
		super();
		this.sid = sid;
		this.eid = eid;
		this.date = date;
		this.time = time;
		this.task = task;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	@Override
	public String toString() {
		return "Schedule [sid=" + sid + ", eid=" + eid + ", date=" + date + ", time=" + time + ", task=" + task + "]";
	}
	
	

}
