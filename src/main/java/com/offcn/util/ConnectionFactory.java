package com.offcn.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	static final String  url= "jdbc:mysql://localhost:3306/youlexuan";
	static final String  user= "root";
	static final String  pass= "root";
	static final String  driver= "com.mysql.jdbc.Driver";
	static Connection con = null;
	
	public static Connection getCon(){
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			return con;
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		System.out.println(getCon());
	}
	
	
}
