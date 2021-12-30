package com.project_0.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.project_0.facebook.entity.FacebookAppUser;

public class FacebookAppDAO implements FacebookAppDAOInterface {
	List<FacebookAppUser> lll = new ArrayList<FacebookAppUser>();
	public int signUp(FacebookAppUser fau) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Srikanth");
				PreparedStatement ps = con.prepareStatement("insert into registeruser values(?,?,?,?,?,?,?,?)");
				ps.setString(1, fau.getFname());
				ps.setString(2, fau.getLname());
				ps.setString(3, fau.getGender());
				ps.setLong(4, fau.getAge());
				ps.setString(5, fau.getLocation());
				ps.setString(6, fau.getEmail());
				ps.setString(7, fau.getPass1());
				ps.setString(8, fau.getPass2());
				i = ps.executeUpdate();
			}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	@Override
	public String signIn(FacebookAppUser fau) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Srikanth");
			PreparedStatement ps = con.prepareStatement("insert into d values where registeruser.email=? and registeruser.pass1=?");
			ps.setString(1, fau.getEmail());
			ps.setString(2, fau.getPass1());
			i=ps.executeUpdate();
			}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(i>0) {
			return fau.getEmail() ;
		}
		else {
			System.out.println("EROOR: invalid email and password");
		}
		return fau.getEmail();
	}

	@Override
	public List<FacebookAppUser> viewProfile(FacebookAppUser fau) {
		
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Srikanth");
				PreparedStatement ps = con.prepareStatement("select * from  registeruser  where email=?");
				ps.setString(1, fau.getEmail());
				ResultSet res = ps.executeQuery();	
				while (res.next()) {
					FacebookAppUser ll = new FacebookAppUser();
					ll.setFname(res.getString(1));
					ll.setLname(res.getString(2));
					ll.setGender(res.getString(3));
					ll.setAge(res.getInt(4));
					ll.setLocation(res.getString(5));
					ll.setEmail(res.getString(6));
					ll.setPass1(res.getString(7));
					ll.setPass2(res.getString(8));
					lll.add(ll);
					break;
				}
				//if(lll.==)

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return lll;
	}

	@Override
	public List<FacebookAppUser> viewAllProfile() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Srikanth");
			PreparedStatement ps = con.prepareStatement("select * from registeruser");

			ResultSet res = ps.executeQuery();

			while (res.next()) {
				FacebookAppUser ll = new FacebookAppUser();
				ll.setFname(res.getString(1));
				ll.setLname(res.getString(2));
				ll.setGender(res.getString(3));
				ll.setAge(res.getInt(4));
				ll.setLocation(res.getString(5));
				ll.setEmail(res.getString(6));
				ll.setPass1(res.getString(7));
				ll.setPass2(res.getString(8));
				lll.add(ll);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return lll;
	}

	@Override
	public List<FacebookAppUser> searchProfile(FacebookAppUser fau) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Srikanth");
			PreparedStatement ps = con.prepareStatement("select fname,lname from registeruser where fname=?");
			ps.setString(1, fau.getFname());
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				FacebookAppUser ll = new FacebookAppUser();
				ll.setFname(res.getString(1));
				ll.setLname(res.getString(2));
				lll.add(ll);
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return lll;
	}

	@Override
	public int logoutProfile(FacebookAppUser fau) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Srikanth");
			PreparedStatement ps = con.prepareStatement("delete from d where email=?");
			ps.setString(1, fau.getEmail());
			int res = ps.executeUpdate();
			i=1;
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<FacebookAppUser> editProfile(FacebookAppUser fau) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Srikanth");
				PreparedStatement ps = con.prepareStatement("select * from  registeruser  where email=?");
				ps.setString(1, fau.getEmail());
				ResultSet res = ps.executeQuery();	
				while (res.next()) {
					FacebookAppUser ll = new FacebookAppUser();
					ll.setFname(res.getString(1));
					ll.setLname(res.getString(2));
					ll.setGender(res.getString(3));
					ll.setAge(res.getInt(4));
					ll.setLocation(res.getString(5));
					ll.setEmail(res.getString(6));
					ll.setPass1(res.getString(7));
					ll.setPass2(res.getString(8));
					lll.add(ll);
					break;
				}

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return lll;
	}

	@Override
	public int editName(FacebookAppUser fau) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Srikanth");
				PreparedStatement ps = con.prepareStatement("update  registeruser set fname=? where email=?");
				ps.setString(1, fau.getFname());
				ps.setString(2, fau.getEmail());
				int res = ps.executeUpdate();	
			i=1;

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return i;
	}

	@Override
	public int editLocation(FacebookAppUser fau) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Srikanth");
				PreparedStatement ps = con.prepareStatement("update  registeruser set location=? where email=?");
				ps.setString(1, fau.getLocation());
				ps.setString(2, fau.getEmail());
				int res = ps.executeUpdate();	
			i=1;

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return i;
	}

	@Override
	public int chat(FacebookAppUser fau) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Srikanth");
			PreparedStatement ps = con.prepareStatement("insert into message values(?,?,?,?,?)");
			ps.setString(1, fau.getEmail());
			ps.setString(2, fau.getSender());
			ps.setString(3, fau.getReceiver());
			ps.setString(4, fau.getMessages());
			ps.setString(5, fau.getT().toString());
			i=ps.executeUpdate();
			i=1;
			}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		/*
		 * if(i>0) { return fau.getReceiver(); } else {
		 * System.out.println("EROOR: invalid entry"); }
		 */
		return i;
	}	
}