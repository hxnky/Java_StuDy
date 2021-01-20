package com.aia.firstspring.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

public class GuestMessage2 {

	private int id;
	private String message;
	private Date regDate;

	// 생성자
	public GuestMessage2(int id, String message, Date regDate) {
		super();
		this.id = id;
		this.message = message;
		this.regDate = regDate;
	}
	
	// 디폴트 생성자
	public GuestMessage2() {

	}

	// 게터와 세터
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
