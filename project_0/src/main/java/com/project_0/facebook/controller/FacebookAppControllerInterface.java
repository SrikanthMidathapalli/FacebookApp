package com.project_0.facebook.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.project_0.facebook.entity.FacebookAppUser;

public interface FacebookAppControllerInterface {

	int signUp() throws IOException, Exception;

	int signIn();

	int viewProfile();

	int viewAllProfile();

	int searchProfile();

	int editProfile();

	int logoutProfile();

	int editName();

	int editLocation();

	int uploadPhoto();

	int likePhoto();

	int dislikePhoto();

	int commentOnPhoto();

	int chat() throws SQLException;

}
