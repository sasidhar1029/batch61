package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) throws SQLException{
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");

		    try (Connection con = DriverManager.getConnection(
		            "jdbc:mysql://localhost:3306/hostels_db", "root", "root");

		         PreparedStatement pst = con.prepareStatement(
		            "insert into teacher(id, name, salary) values(?,?,?)")) {

		        pst.setInt(1, 101);
		        pst.setString(2, "ravi");
		        pst.setDouble(3, 50000);

		        int n = pst.executeUpdate();

		        if (n > 0) {
		            System.out.println("Record inserted successfully");
		        } else {
		            System.out.println("Something went wrong");
		        }
		    }

		} catch (Exception e) {
		    e.printStackTrace();
		}

	}
}
