/*
 * Copyright (AJC) Ryan Wans (c) 2018. ALl Rights Reserved
 * Any code in this document, including API's under similar
 * branding are the sole property of Ryan Wans. Any distribution,
 * reproduction, taking snippits, or claiming of this code breaks 
 * the terms of service and voids any agreement with the end user.
*/

package tts_sql.origin;

import java.sql.*;
import java.util.*;
import java.io.*;


public class Main {
	
	public static boolean status;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		eval();
	}
	
	public static void eval()
	{
		String url       = // REMOVED //;
		String userNAME  = // REMOVED //;
		String passWORD  = // REMOVED //;
		String dbNAME    = // REMOVED //;
		int i = 0;
		try
		{
			String usr = login_frame.getUsername.getText();
			String olps = login_frame.getPassword.getText();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url + dbNAME, userNAME, passWORD);
			Statement state = con.createStatement();
			String query = "SELECT password FROM credentials WHERE username='" + usr + "'";
			ResultSet rs = state.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			while (rs.next())
			{
				String pswd = rs.getString("password");
				if (olps.equals(pswd))
				{
					status = true;
				} else {
					status = false;
				}
				
			}
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
