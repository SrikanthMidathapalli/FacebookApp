package com.project_0.facebook.view;

import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import com.project_0.facebook.controller.FacebookAppController;
import com.project_0.facebook.controller.FacebookAppControllerInterface;
import com.project_0.facebook.entity.FacebookAppUser;
import com.project_0.facebook.utility.ControllerFactory;
public class FacebookView {
	public static void main(String[] args) throws IOException,Exception,SQLException {
		Logger log=Logger.getLogger("FacebookView");
		System.out.println("\t\t\t\t\t\t\t Welcome To Facebook App");
		System.out.println("\t\t\t||***||________________________________"
				+ "_____________________________________________||***||");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String cheack1="y";
		while(cheack1.equals(cheack1)) {
			System.out.println("\t\t\t\t\t\t 1.SIGNUP \t\t 2.SIGNIN");
			System.out.println();
			System.out.println("enter your choice 1 or 2");
			int choice_for_sign_in_up=sc.nextInt();
			try {
				switch(choice_for_sign_in_up) {
				case 1:
					if(choice_for_sign_in_up==1)
						System.out.println("\t\t\tyou choosed  "+choice_for_sign_in_up+" to signup");
						break;
				case 2:
					if(choice_for_sign_in_up==2)
						System.out.println("\t\t\tyou choosed  "+choice_for_sign_in_up+" to signin");
						break;
				default :log.warning("WARNING:CHOOSE [SIHN UP/SIGN IN] ONLY PRESS[1/2]");
					System.out.println("\t\t\t wrong choice in sign in and sign up selection");
					
					}
			}

			catch(InputMismatchException exception1) {
				exception1.printStackTrace();
				System.out.println("\t\t\tERROR:enter 1 or 2 only please");
				log.warning("WARNING:CHOOSE ONLY[Numbers]");
			}
			FacebookAppControllerInterface faci=ControllerFactory.createObject();
			switch(choice_for_sign_in_up) {
				case 1 :
					log.info("SIGN UP");
							int object_for_signup=faci.signUp();
							if(object_for_signup>0) {
								System.out.println("\t\t\tprofile created sucessfully!!!");
							}
							else {
								System.out.println("\t\t\tprofile creation failed)::");
							}
					break;
				case 2 :	
							log.info("SIGN IN");
							int object_for_signin=faci.signIn();
							if(object_for_signin>0) {
								FacebookAppUser facebookappuser_data=new FacebookAppUser();
								System.out.println("\t\t\tlogin sucessfully!!!");
								System.out.println();
								String cheack2="y";
								while(cheack2.equals(cheack2)) {
									System.out.println("\t\t\t 1.viewpprofile");
									System.out.println("\t\t\t 2.viewallprofile");
									System.out.println("\t\t\t 3.searchprofiles");
									System.out.println("\t\t\t 4.editprofile");
									System.out.println("\t\t\t 5.logoutprofile");
									System.out.println("enter your choice 1 or 2 or 3 or 4 or 5");
									int choice_for_viewprofile_options=sc.nextInt();
									try {
										switch(choice_for_viewprofile_options) {
										case 1:
											if(choice_for_viewprofile_options==1)
												System.out.println("\t\t\tyou choosed  "+choice_for_viewprofile_options+" to viewpprofile ");
												break;
										case 2:
											if(choice_for_viewprofile_options==2)
												System.out.println("\t\t\tyou choosed  "+choice_for_viewprofile_options+" to viewallprofile ");
												break;
										case 3:
											if(choice_for_viewprofile_options==3)
												System.out.println("\t\t\tyou choosed  "+choice_for_viewprofile_options+" to searchprofiles ");
												break;
										case 4:
											if(choice_for_viewprofile_options==4)
												System.out.println("\t\t\tyou choosed  "+choice_for_viewprofile_options+" to editprofile ");
												break;
										case 5:
											if(choice_for_viewprofile_options==5)
												System.out.println("\t\t\tyou choosed  "+choice_for_viewprofile_options+" to logoutprofile ");
												break;
										default:log.warning("WARNING:WRONG CHOICE IN [VIEW-PROFILE] PRESS ONLY[1/2/3/4/5]");
										}
									}
									catch(Exception exception) {
										exception.printStackTrace();
										System.out.println("\t\t\tERROR:enter 1 or 2 or 3 or 4 or 5 only please");
										log.warning("WARNING:CHOOSE ONLY[Numbers]");
									}
					
									switch(choice_for_viewprofile_options) {
										case 1 :
											//view profile start
											log.info("view PROFILE");
											int object_for_editprofile=faci.viewProfile();
											if(object_for_editprofile>0) {
												System.out.println("\t\t\tprofile selected to view");
												System.out.println();
												String cheack3="y";
												while(cheack3.equals(cheack3)) {
													System.out.println("\t\t\t 1.upload photo");
													System.out.println("\t\t\t 2.like photo");
													System.out.println("\t\t\t 3.dislike photo");
													System.out.println("\t\t\t 4.comment on photo");
													System.out.println("\t\t\t 5.chat");
													System.out.println("enter your choice 1 or 2 or 3 or 4 or 5");
													int choice_for_time_line=sc.nextInt();
													try {
														switch(choice_for_time_line) {
														case 1:
															if(choice_for_time_line==1)
																System.out.println("\t\t\tyou choosed  "+choice_for_time_line+" to upload photo ");
																break;
														case 2:
															if(choice_for_time_line==2)
																System.out.println("\t\t\tyou choosed  "+choice_for_time_line+" to like photo");
																break;
														case 3:
															if(choice_for_time_line==3)
																System.out.println("\t\t\tyou choosed  "+choice_for_time_line+" to dis like photo");
																break;
														case 4:
															if(choice_for_time_line==4)
																System.out.println("\t\t\tyou choosed  "+choice_for_time_line+" to comment on photo ");
																break;
														case 5:
															if(choice_for_time_line==5)
																System.out.println("\t\t\tyou choosed  "+choice_for_time_line+" to chat ");
																break;
														default:log.warning("WARNING:WRONG CHOICE IN [view profile timeline] PRESS ONLY[1/2/3/4/5]");
	
														}
												}
													catch(Exception exception) {
														exception.printStackTrace();
														System.out.println("\t\t\tERROR:enter 1 or 2 or 3 or 4 or 5 only please");
														log.warning("WARNING:CHOOSE ONLY[Numbers]");
													}
									
													switch(choice_for_time_line) {
														case 1 :
																	log.info("UPLOAD PHOTO OPTION IS NOT AVILABLE");
																	int object_for_uploadphoto=faci.uploadPhoto();
																	if(object_for_uploadphoto>0) {
																		System.out.println("\t\t\tphoto uploadsucessfully!!");
																	}
																	else {
																		System.out.println("\t\t\tfailed to upload photo");
																	}
															break;
														case 2:
																	log.info("LIKE PHOTO OPTION IS NOT AVILABLE");
																	int object_for_likephoto=faci.likePhoto();
																	if(object_for_likephoto>0) {
																		System.out.println("\t\t\tlike photo  sucessfully!!");
																	}
																	else {
																		System.out.println("\t\t\tfailed to dislike photo");
																	}
															break;
														case 3:
															log.info("DIS LIKE PHOTO OPTION IS NOT AVILABLE");
															int object_for_dislikephoto=faci.dislikePhoto();
															if(object_for_dislikephoto>0) {
																System.out.println("\t\t\tdis like photo sucessfully!!");
															}
															else {
																System.out.println("\t\t\tfailed to dislike photo");
															}
													break;
														case 4:
															log.info("COMMENT OPTION IS NOT AVILABLE");
															int object_for_commentonphoto=faci.commentOnPhoto();
															if(object_for_commentonphoto>0) {
																System.out.println("\t\t\tcommented on photo sucessfully!!");
															}
															else {
																System.out.println("\t\t\tfailed to comment on photo");
															}
													break;
														case 5:
															log.info("CHAT WITH OTHERS");
															int object_for_chat=faci.chat();
															if(object_for_chat>0) {
																System.out.println("\t\t\tchat sucessfully!!");
															}
															else {
																System.out.println("\t\t\tfailed to chat");
															}
													break;
														default:log.warning("WARNING:WRONG CHOICE IN [EDIT] PRESS ONLY[1/2/3/4]");
												}
												System.out.println("Do you want to continue in view profile page only y/n");
												String cheack4=sc.next();
												if(cheack4.equals("y")||cheack4.equals("Y")) {
														
												}
												else {
													System.out.println("\t\t\tenter only y/Y to continue");
													break;
												}
											}
										}
										break;
										//view profile end
											
										case 2 :
													log.info("VIEW ALL PROFILE");
													System.out.println("\t\t\tAllprofiles view");
													int object_for_viewallprofile=faci.viewAllProfile();
													if(object_for_viewallprofile>0) {
														System.out.println("\t\t\tscroll down to view all profiles");
													}
													else {
														System.out.println("\t\t\t failed to view Allprofile)::");
													}
											break;
										case 3 :
												log.info("SEARCH PROFILES");
												System.out.println("\t\t\tprofiles searching");
												int object_for_searchprofile=faci.searchProfile();
												if(object_for_searchprofile>0) {
													System.out.println("\t\t\tthe profiles for your search");
													}
												else {
													System.out.println("\t\t\t failed to view Searchprofiles)::");
												}
											break;
										
										case 4 :
											//edit profile start
											log.info("EDIT PROFILE");
											int object_for_edit_profile=faci.editProfile();
											if(object_for_edit_profile>0) {
												System.out.println("\t\t\tprofile selected to edit");
												System.out.println();
												String cheack5="y";
												while(cheack5.equals(cheack5)) {
													System.out.println("\t\t\t 1.edit name");
													System.out.println("\t\t\t 2.edit location");
													System.out.println("enter your choice 1 or 2");
													int choice_for_edit_name_loc=sc.nextInt();
													try {
														switch(choice_for_edit_name_loc) {
														case 1:
															if(choice_for_edit_name_loc==1)
																System.out.println("\t\t\tyou choosed  "+choice_for_edit_name_loc+" to edit names ");
																break;
														case 2:
															if(choice_for_edit_name_loc==2)
																System.out.println("\t\t\tyou choosed  "+choice_for_edit_name_loc+" to edit location ");
																break;
														default:log.warning("WARNING:WRONG CHOICE IN [EDIT] PRESS ONLY[1/2]");
	
														}
													}
													catch(Exception exception) {
														exception.printStackTrace();
														System.out.println("\t\t\tERROR:enter 1 or 2 only please");
														log.warning("WARNING:CHOOSE ONLY[Numbers]");
													}
									
													switch(choice_for_edit_name_loc) {
														case 1 :
																	log.info("EDIT NAME");
																	int object_for_edit_name=faci.editName();
																	if(object_for_edit_name>0) {
																		System.out.println("\t\t\tedited name sucessfully!!");
																	}
																	else {
																		System.out.println("\t\t\t failed to edit name)::");
																	}
															break;
														case 2:
																	log.info("EDIT LOCATION");
																	int object_for_edit_location=faci.editLocation();
																	if(object_for_edit_location>0) {
																		System.out.println("\t\t\tlocation edited sucessfully!!");
																	}
																	else {
																		System.out.println("\t\t\t failed edit location)::");
																	}
															break;
														default:log.warning("WARNING:WRONG CHOICE IN [EDIT] PRESS ONLY[1/2]");
												}
												System.out.println("Do you want to continue in edit page only y/n");
												String cheack6=sc.next();
												if(cheack6.equals("y")||cheack6.equals("Y")) {
														
												}
												else {
													System.out.println("\t\t\tenter only y/Y to continue");
													break;
												}
													}
												}
											break;
										//edit profile end
										case 5:	
											int object_for_logout=faci.logoutProfile();
											if(object_for_logout>0) {
												System.out.println("\t\t\tlogout sucssesful/");
												}
											else {
												System.out.println("\t\t\t failed to logout)::");
											}
										break;
									default:log.warning("WARNING:WRONG CHOICE IN [VIEW PROFILE] PRESS ONLY[1/2/3/4/5]");
									}
									System.out.println("Do you want to continue in login page only y/n");
									String cheack7=sc.next();
									if(cheack7.equals("y")||cheack7.equals("Y")) {
						
									}
									else {
										System.out.println("\t\t\tenter only y/Y to continue");
										break;
									}
								}
							}
							else {
								System.out.println("\t\t\tlogin or signin  failed");
							}
					break;
				default:log.warning("WARNING:WRONG CHOICE IN [SIGN IN] PRESS ONLY[1/2]");
			}
			System.out.println("Do you want to continue in sign up and sign in only y/n");
			String cheack8=sc.next();
			if(cheack8.equals("y")||cheack8.equals("Y")) {
				cheack1.equals(cheack8);
			}
			else {
				System.out.println("\t\t\tenter only y/Y to continue");
			}
		}
	}
}

