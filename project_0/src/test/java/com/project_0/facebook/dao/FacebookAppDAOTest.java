package com.project_0.facebook.dao;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.facebookapp.entity.Facebookuser;
import com.project_0.facebook.entity.FacebookAppUser;
import com.project_0.facebook.utility.ControllerFactory;
import com.project_0.facebook.utility.DAOFactory;

public class FacebookAppDAOTest {
private FacebookAppDAOInterface fa;
Logger log=Logger.getLogger("FacebookAppDAOTest");
	@Before
	public void setUp() throws Exception {
		fa=DAOFactory.createObject();
	}

	@After
	public void tearDown() throws Exception {
		fa=null;
	}

	@Test
	public void testSignUp() {
		log.info("Sinup in Dao layer");
		FacebookAppUser lu=new FacebookAppUser();
		lu.setFname("babu");
		lu.setLname("Mahesh");
		lu.setGender("m");
		lu.setAge(20);
		lu.setLocation("madras");
		lu.setEmail("ssss9515@");
		lu.setPass1("s");
		lu.setPass2("s");
		int i=fa.signUp(lu);		
		assert i>0:"signUp failed";
	}

	@Test
	public void testSignIn() {
		log.info("Signin in Dao layer");
		FacebookAppUser lu=new FacebookAppUser();
		lu.setEmail("sss@");
		lu.setPass1("s");
		String i=fa.signIn(lu);		
		assert i!=null:"signin failed";
	}


	@Test
	public void testViewProfile() {
		log.info("view profile in Dao layer");
		FacebookAppUser lu=new FacebookAppUser();
		lu.setEmail("sss@");
		List<FacebookAppUser> i=fa.viewProfile(lu);		
		assert i!=null:"view profile failed";
	}

	@Test
	public void testViewAllProfile() {
		log.info("view all profile in Dao layer");
		FacebookAppUser lu=new FacebookAppUser();
		List<FacebookAppUser> i=fa.viewAllProfile();		
		assert i!=null:"view all profile failed";
	}

	@Test
	public void testSearchProfile() {
		log.info("Search profile in Dao layer");
		FacebookAppUser lu=new FacebookAppUser();

		lu.setFname("Srikanth");
		List<FacebookAppUser> i=fa.searchProfile(lu);		
		assert i!=null:"search profile failed";
	}

	@Test
	public void testLogoutProfile() {
		log.info("logout profile in Dao layer");
		FacebookAppUser lu=new FacebookAppUser();

		lu.setEmail("sss@");
		int i=fa.logoutProfile(lu);		
		assert i>0:"view profile failed";
	}

	@Test
	public void testEditProfile() {
		log.info("edit profile in Dao layer");
		FacebookAppUser lu=new FacebookAppUser();

		lu.setEmail("m");
		List<FacebookAppUser> i=fa.viewProfile(lu);		
		assert i!=null:"edit profile failed";
	}

	@Test
	public void testEditName() {
		log.info("edit name in Dao layer");
		FacebookAppUser lu=new FacebookAppUser();

		lu.setEmail("m");
		lu.setFname("MaheshBabu");
		int i=fa.editName(lu);		
		assert i>0:"edit name profile failed";
	}

	@Test
	public void testEditLocation() {
		log.info("edit location in Dao layer");
		FacebookAppUser lu=new FacebookAppUser();

		lu.setEmail("m");
		lu.setLocation("Hyderabad");
		int i=fa.editLocation(lu);		
		assert i>0:"edit location profile failed";
	}
	@Test
	public void testChat() {
		log.info("chat in Dao layer");
		FacebookAppUser lu=new FacebookAppUser();
		lu.setEmail("b");
		lu.setSender("babu");
		lu.setReceiver("Mahesh");
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
		LocalDateTime currentTime=LocalDateTime.now();
		String dateString;
		dateString=dt.format(currentTime).toString();
		lu.setT(dateString);
		lu.setMessages("hi mahesh how ar u?");
		int i=fa.chat(lu);		
		assert i>0:"chat failed";
	}

}
