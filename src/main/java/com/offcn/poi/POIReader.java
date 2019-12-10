package com.offcn.poi;



import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class POIReader {

    static final String url="jdbc:mysql://localhost:3306/youlexuan?useServerPrepStmts=false&rewriteBatchedStatements=true";
    static final String user="root";
    static final String pass="root";
    static final String driver="com.mysql.jdbc.Driver";
    static Connection con = null;
    public static Connection getCon(){
        try {
            Class.forName(driver);
             con = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    public void test(){
        System.out.println(".........");
    }
}
