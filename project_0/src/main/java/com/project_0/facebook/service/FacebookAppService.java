package com.project_0.facebook.service;

import java.util.List;

import com.project_0.facebook.dao.FacebookAppDAO;
import com.project_0.facebook.dao.FacebookAppDAOInterface;
import com.project_0.facebook.entity.FacebookAppUser;
import com.project_0.facebook.utility.DAOFactory;

public class FacebookAppService implements FacebookAppServiceInterface {

	public int signUp(FacebookAppUser fau) {
		FacebookAppDAOInterface fadf=DAOFactory.createObject();
		return fadf.signUp(fau);
	}

	public String signIn(FacebookAppUser fau) {
		FacebookAppDAOInterface fadf=DAOFactory.createObject();
		return fadf.signIn(fau);
	}

	public List<FacebookAppUser> viewProfile(FacebookAppUser fau) {
		FacebookAppDAOInterface fadf=DAOFactory.createObject();
		return fadf.viewProfile(fau);
	}

	public List<FacebookAppUser> viewAllProfile() {
		FacebookAppDAOInterface fadf=DAOFactory.createObject();
		return fadf.viewAllProfile();
	}

	public List<FacebookAppUser> searchProfile(FacebookAppUser fau) {
		FacebookAppDAOInterface fadf=DAOFactory.createObject();
		return fadf.searchProfile(fau);
	}

	public int logoutProfile(FacebookAppUser fau) {
		FacebookAppDAOInterface fadf=DAOFactory.createObject();
		return fadf.logoutProfile(fau);
	}

	public List<FacebookAppUser> editProfile(FacebookAppUser fau) {
		FacebookAppDAOInterface fadf=DAOFactory.createObject();
		return fadf.editProfile(fau);
	}

	public int editName(FacebookAppUser fau) {
		FacebookAppDAOInterface fadf=DAOFactory.createObject();
		return fadf.editName(fau);
	}

	public int editLocation(FacebookAppUser fau) {
		FacebookAppDAOInterface fadf=DAOFactory.createObject();
		return fadf.editLocation(fau);
	}

	public int chat(FacebookAppUser fau) {
		FacebookAppDAOInterface fadf=DAOFactory.createObject();
		return fadf.chat(fau);	
		}

}
