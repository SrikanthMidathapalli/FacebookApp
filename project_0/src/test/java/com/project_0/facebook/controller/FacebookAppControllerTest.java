package com.project_0.facebook.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.project_0.facebook.utility.ControllerFactory;

public class FacebookAppControllerTest {
	Logger log=Logger.getLogger("FacebookAppControllerTest");
	FacebookAppControllerInterface faci;

	@Before
	public void setUp() throws Exception {
		faci=ControllerFactory.createObject();
	}

	@After
	public void tearDown() throws Exception {
		faci=null;
	}

	@Test
	public void testSignUp() throws IOException, Exception {
		log.info("sinup method test case");
		int i=faci.signUp();
		assert i>0:"signup failed";
	}

	@Test
	public void testSignIn() {
		log.info("signin method test case");
		int i=faci.signIn();
		assert i>0:"signin failed";
	}

	@Test
	public void testViewProfile() {
		log.info("view profile method test case");
		int i=faci.viewProfile();
		assert i>0:"viewProfile failed";
	}

	@Test
	public void testViewAllProfile() {
		log.info("view all profile method test case");
		int i=faci.viewAllProfile();
		assert i>0:"view all profile failed";
	}

	@Test
	public void testSearchProfile() {
		log.info("search method test case");
		int i=faci.searchProfile();
		assert i>0:"search profile failed";
	}

	@Test
	public void testEditProfile() {
		log.info("sinup method test case");
		int i=faci.editProfile();
		assert i>0:"edit profile failed";
	}

	@Test
	public void testLogoutProfile() {
		log.info("logout method test case");
		int i=faci.logoutProfile();
		assert i>0:"logout failed";
	}

	@Test
	public void testEditName() {
		log.info("sinup method test case");
		int i=faci.editName();
		assert i>0:"edit name failed";
	}

	@Test
	public void testEditLocation() {
		log.info("EditLocation method test case");
		int i=faci.editLocation();
		assert i>0:"EditLocation failed";
	}
	@Test
	public void tesChat() throws SQLException {
		log.info("chat method test case");
		int i=faci.chat();
		assert i>0:"chat failed";
	}

}
