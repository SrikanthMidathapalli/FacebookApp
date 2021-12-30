package com.project_0.facebook.service;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.project_0.facebook.controller.FacebookAppControllerInterface;
import com.project_0.facebook.utility.ControllerFactory;

public class FacebookAppServiceTest {

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
	public void testSignUp() {
		
		fail("Not yet implemented");
	}

	@Test
	public void testSignIn() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewAllProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogoutProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditName() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testChat() {
		fail("Not yet implemented");
	}

}
