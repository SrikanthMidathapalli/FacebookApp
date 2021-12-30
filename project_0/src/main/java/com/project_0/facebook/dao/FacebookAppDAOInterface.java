package com.project_0.facebook.dao;
import com.project_0.facebook.entity.FacebookAppUser;

import java.util.List;

public interface FacebookAppDAOInterface {

	int signUp(FacebookAppUser fau);
	String signIn(FacebookAppUser fau);
	List<FacebookAppUser> viewProfile(FacebookAppUser fau);
	List<FacebookAppUser> viewAllProfile();
	List<FacebookAppUser> searchProfile(FacebookAppUser fau);
	int logoutProfile(FacebookAppUser fau);
	List<FacebookAppUser> editProfile(FacebookAppUser fau);
	int editName(FacebookAppUser fau);
	int editLocation(FacebookAppUser fau);
	int chat(FacebookAppUser fau);

}
