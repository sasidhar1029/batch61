package vcube.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import vcube.com.dto.LoginUser;

public class StudentDao {

	public boolean registerStudent(LoginUser luser) {

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/sasidhar1029",
	                "root",
	                "root");

	        PreparedStatement pst = con.prepareStatement(
	                "INSERT INTO sasi(name,email,password,Re_password) VALUES (?,?,?,?)");

	        pst.setString(1, luser.getName());
	        pst.setString(2, luser.getEmail());
	        pst.setString(3, luser.getPassword());
	        pst.setString(4, luser.getRe_password());

	        int n = pst.executeUpdate();

	        con.close();

	        return n > 0;

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}

}
