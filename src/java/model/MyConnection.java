/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class MyConnection {
    public static Connection getMyConnection()
   {
       Connection c=null;
        String driver="com.mysql.jdbc.Driver";
            String dbName="online_exam";
        String url="jdbc:mysql://localhost:3306/"+dbName;
        String dbUser="root";
        String dbPass="";
        try{
            Class.forName(driver);
            c=DriverManager.getConnection(url, dbUser, dbPass);
        }catch(ClassNotFoundException e){e.printStackTrace();}
           catch(SQLException e){e.printStackTrace();}
       return c;
   }
}
