package com.project_0.facebook.utility;

import com.project_0.facebook.controller.FacebookAppController;
import com.project_0.facebook.controller.FacebookAppControllerInterface;

public class ControllerFactory {
	private ControllerFactory() {
		
	}

	
	public static FacebookAppControllerInterface createObject() {
		return new FacebookAppController();
	}

}
