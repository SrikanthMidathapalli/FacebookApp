package com.project_0.facebook.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.project_0.facebook.entity.FacebookAppUser;
import com.project_0.facebook.service.FacebookAppService;
import com.project_0.facebook.service.FacebookAppServiceInterface;
import com.project_0.facebook.utility.ControllerFactory;
import com.project_0.facebook.utility.ServiceFactory;
import com.project_0.facebook.view.FacebookView;

public class FacebookAppController implements FacebookAppControllerInterface {
	public FacebookAppServiceInterface faci;
	public FacebookAppUser fau;
	public int signUp() throws Exception {
		//
		fau=new FacebookAppUser();
		faci= ServiceFactory.createObject();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name:");
		String fname=sc.next();
		fau.setFname(fname);
		System.out.println("enter last name:");
		String lname=sc.next();
		fau.setLname(lname);
		System.out.println("enter gender  M/F:");
		String gender=sc.next();
		if(gender.equalsIgnoreCase("m")||gender.equalsIgnoreCase("f")) {
			fau.setGender(gender);
		}
		else {
			System.out.println("\t\t\tgender must be M/m or F/f only");
			faci=null;
			System.gc();
			fau=null;
			System.gc();
			
			  FacebookAppControllerInterface faci=ControllerFactory.createObject();
			 FacebookAppUser fau=new FacebookAppUser();
			  faci.signUp(); 
		}
		System.out.println("enter age:");
		int age=sc.nextInt();
		fau.setAge(age);
		System.out.println("enter location:");
		String location=sc.next();
		fau.setLocation(location);
		System.out.println("enter email:");
		String email=sc.next();
		fau.setEmail(email);
		System.out.println("enter password:");
		String pass1=sc.next();
		System.out.println("re enter password:");
		fau.setPass1(pass1);
		String pass2=sc.next();
		if(pass2.equals(pass1)) {
			fau.setPass2(pass2);
			System.out.println("\t\t\tpassword verified Sucessful!!! ");
		}
		else {
			System.out.println("\t\t\tpassword mismatch )::");
			faci=null;
			System.gc();
			fau=null;
			System.gc();
			FacebookAppControllerInterface faci=ControllerFactory.createObject();
			FacebookAppUser fau=new FacebookAppUser();
			faci.signUp();
		}
			return faci.signUp(fau);
	}

	public int signIn() {
		FacebookAppServiceInterface ls=ServiceFactory.createObject();
		FacebookAppUser fau=new FacebookAppUser();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Email:");
		String email=sc.next();
		fau.setEmail(email);
		System.out.println("enter Password:");
		String Password=sc.next();
		fau.setPass1(Password);
		List<FacebookAppUser> lu12=ls.viewProfile(fau);
		
		for(FacebookAppUser lu2:lu12) {
			System.out.println("Email is\t\t\t "+lu2.getEmail());
			System.out.println("Password is\t\t\t "+lu2.getPass1());
		}
		
		return lu12.size();
		
	}

	public int viewProfile() {
		FacebookAppServiceInterface ls=ServiceFactory.createObject();
		FacebookAppUser fau=new FacebookAppUser();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Email:");
		String email=sc.next();
		fau.setEmail(email);
		List<FacebookAppUser> lu12=ls.viewProfile(fau);
		
		for(FacebookAppUser lu2:lu12) {
			System.out.println("\t\t\t------------------------------");
			System.out.println("First Name is\t\t\t "+lu2.getFname());
			System.out.println("Last Name is\t\t\t "+lu2.getLname());
			System.out.println("Gender is\t\t\t "+lu2.getGender());
			System.out.println("Age is\t\t\t\t "+lu2.getAge());
			System.out.println("Age is\t\t\t\t "+lu2.getLocation());
			System.out.println("Email is\t\t\t "+lu2.getEmail());
			System.out.println("Password is\t\t\t "+lu2.getPass1());
			System.out.println("con Password is\t\t\t "+lu2.getPass2());
		}
		
		return lu12.size();
	}
	public int viewAllProfile() {
		FacebookAppServiceInterface ls=ServiceFactory.createObject();
		List<FacebookAppUser> lu1=ls.viewAllProfile();
		
		for(FacebookAppUser lu2:lu1) {
			System.out.println("\t\t\t------------------------------");
			System.out.println("First Name is\t\t\t "+lu2.getFname());
			System.out.println("Last Name is\t\t\t "+lu2.getLname());
			System.out.println("Gender is\t\t\t "+lu2.getGender());
			System.out.println("Age is\t\t\t\t "+lu2.getAge());
			System.out.println("Age is\t\t\t\t "+lu2.getLocation());
			System.out.println("Email is\t\t\t "+lu2.getEmail());
			System.out.println("Password is\t\t\t "+lu2.getPass1());
			System.out.println("con Password is\t\t\t "+lu2.getPass2());
		}
		
		return lu1.size();
	}

	public int searchProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Name:");
		String fname=sc.next();
		FacebookAppUser fau=new FacebookAppUser();
		fau.setFname(fname);
		FacebookAppServiceInterface ls=ServiceFactory.createObject();
		List<FacebookAppUser> lu1=ls.searchProfile(fau);
		
		for(FacebookAppUser lu2:lu1) {
			System.out.println("\t\t\t|------------------------------||------------------------------|");
			System.out.println("\t\t\tFirst Name is "+lu2.getFname()+"\t\tLast Name is "+lu2.getLname());
			System.out.println();
		}
		return lu1.size();
	}

	public int editProfile() {
		FacebookAppServiceInterface ls=ServiceFactory.createObject();
		FacebookAppUser fau=new FacebookAppUser();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Email:");
		String email=sc.next();
		fau.setEmail(email);
		List<FacebookAppUser> luu=ls.editProfile(fau);		
		for(FacebookAppUser lu2:luu) {
			System.out.println("\t\t\t------------------------------");
			System.out.println("First Name is\t\t\t "+lu2.getFname());
			System.out.println("Last Name is\t\t\t "+lu2.getLname());
			System.out.println("Gender is\t\t\t "+lu2.getGender());
			System.out.println("Age is\t\t\t\t "+lu2.getAge());
			System.out.println("Email is\t\t\t "+lu2.getEmail());
			System.out.println("Password is\t\t\t "+lu2.getPass1());
			System.out.println("con Password is\t\t\t "+lu2.getPass2());
		}
		
		return luu.size();
		}

	public int logoutProfile() {
		FacebookAppServiceInterface ls=ServiceFactory.createObject();
		FacebookAppUser fau=new FacebookAppUser();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Email:");
		String email=sc.next();
		fau.setEmail(email);
		List<FacebookAppUser> lu12=ls.viewProfile(fau);
		int lu1=ls.logoutProfile(fau);
		//if(fau.setEmail(email)==fau.getEmail())
		return lu1;
	}

	public int editName() {
		FacebookAppServiceInterface ls=ServiceFactory.createObject();
		FacebookAppUser fau=new FacebookAppUser();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Email:");
		String email=sc.next();
		fau.setEmail(email);
		System.out.println("enter name to update:");
		String fname=sc.next();
		fau.setFname(fname);
		int lu1=ls.editName(fau);
		return lu1;
	}

	public int editLocation() {
		FacebookAppServiceInterface ls=ServiceFactory.createObject();
		FacebookAppUser fau=new FacebookAppUser();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Email:");
		String email=sc.next();
		fau.setEmail(email);
		System.out.println("enter location to update:");
		String location=sc.next();
		fau.setLocation(location);
		int lu1=ls.editLocation(fau);
		return lu1;
	}

	public int uploadPhoto() {
		
		return 0;
	}

	public int likePhoto() {
		
		return 0;
	}

	public int dislikePhoto() {
		
		return 0;
	}

	public int commentOnPhoto() {
		
		return 0;
	}

	public int chat() throws SQLException {
		FacebookAppUser fau=new FacebookAppUser();
		faci= ServiceFactory.createObject();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email:");
		String email=sc.next();
		fau.setEmail(email);
		System.out.println("sender name:");
		String sender=sc.next();
		fau.setSender(sender);
		System.out.println("receiver name:");
		String receiver=sc.next();
		fau.setReceiver(receiver);
		System.out.println("enter message:");
		String messages=sc.next();
		fau.setMessages(messages);
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
		LocalDateTime currentTime=LocalDateTime.now();
		String dateString;
		dateString=dt.format(currentTime).toString();
		fau.setT(dateString);
		FacebookAppServiceInterface ls=ServiceFactory.createObject();
		int lu12=ls.chat(fau);
		if(lu12>0) {
			System.out.println("Email is:\t\t\t "+fau.getEmail());
			System.out.println("Sender is: is\t\t\t "+fau.getSender());
			System.out.println("Receiver is:\t\t\t "+fau.getReceiver());
			System.out.println("Message is\t\t\t "+fau.getMessages());
			System.out.println("Time  is\t\t\t "+fau.getT());
		}
		return lu12;
	}
}

