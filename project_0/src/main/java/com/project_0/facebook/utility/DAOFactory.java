package com.project_0.facebook.utility;

import com.project_0.facebook.dao.FacebookAppDAO;
import com.project_0.facebook.dao.FacebookAppDAOInterface;

public class DAOFactory {
	private DAOFactory() {
		
	}

	public static FacebookAppDAOInterface createObject() {
		return new FacebookAppDAO();
	}

}
