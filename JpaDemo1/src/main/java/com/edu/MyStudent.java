package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyStudent 
{
	@Id
	private int sid;
	private String sname;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) 
	{
		
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "MyStudent [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	

}
