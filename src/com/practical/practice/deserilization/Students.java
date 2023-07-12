package com.practical.practice.deserilization;


import java.io.Serializable;

public class Students implements Serializable
{
	private static final long serialVersionUID = 7582065102360574584L;
	int rollno;
	char division;
	String names;
	
	public Students(int rollno, char division, String names) {
		this.rollno=rollno;
		this.division=division;
		this.names=names;
	}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", division=" + division + ", names=" + names + "]";
	}
	
}
