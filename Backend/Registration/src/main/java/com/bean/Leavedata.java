package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Leavedata {
	@Id
	private int lid;
	private Integer eid;
	private String fdate;
	private String tdate;
	private String reason;
	
	public Leavedata(int lid, Integer eid, String fdate, String tdate, String reason) {
		super();
		this.lid = lid;
		this.eid = eid;
		this.fdate = fdate;
		this.tdate = tdate;
		this.reason = reason;
	}
	public Leavedata() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Leavedata [lid=" + lid + ", eid=" + eid + ", fdate=" + fdate + ", tdate=" + tdate + ", reason=" + reason
				+ "]";
	}
	
	

}
