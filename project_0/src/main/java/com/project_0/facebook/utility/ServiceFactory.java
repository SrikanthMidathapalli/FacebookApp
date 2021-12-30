package com.project_0.facebook.utility;

import com.project_0.facebook.service.FacebookAppService;
import com.project_0.facebook.service.FacebookAppServiceInterface;

public class ServiceFactory {
	private ServiceFactory() {
		
	}

	public static FacebookAppServiceInterface createObject() {
		return new FacebookAppService();
	}

}
