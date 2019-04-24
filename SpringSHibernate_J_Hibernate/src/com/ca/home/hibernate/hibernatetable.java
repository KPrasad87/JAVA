package com.ca.home.hibernate;

import javax.persistence.Entity;


public class hibernatetable {

	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int sno) {
		this.no = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

}
