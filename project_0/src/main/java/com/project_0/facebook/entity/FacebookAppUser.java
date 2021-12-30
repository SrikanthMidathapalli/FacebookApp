package com.project_0.facebook.entity;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;

import oracle.sql.DATE;

public class FacebookAppUser {
	private String fname;
	private String lname;
	private String gender;
	private int age;
	private String location;
	private String email;
	private String pass1;
	private String pass2;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender2) {
		this.gender = gender2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age2) {
		this.age = age2;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass1() {
		return pass1;
	}
	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}
	public String getPass2() {
		return pass2;
	}
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	private String sender;
	private String receiver;
	private String messages;
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	private String t;

	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getT() {
		return t;
	}
	public void setT(String dateString) {
		this.t=dateString;
		Date t=new Date();
		Timestamp ts=new Timestamp(t.getTime());
	}
	public String getTime() {
		
		return null;
	}
	public void setT(DATE currentDate) {
		
	}
	
}

	

