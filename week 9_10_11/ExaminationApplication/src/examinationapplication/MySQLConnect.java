/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examinationapplication;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Sayyed Abrar Akhtar
 */
//Connecting MySQL Database
public class MySQLConnect {
    
    Connection conn;
    public Connection getConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp?useTimezone=true&serverTimezone=UTC","root","");
            System.out.println("Database Connection Successful");
            return conn;
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error in MySQLConnect getConn method.." + e);
        }
        return null;
        
    }
    
    public Boolean closeConnection() throws SQLException{
        conn = getConn();
        conn.close();
        return true;
    }
    
    public Boolean executeSQLQuery(String query, String message) {
        conn = getConn();
        Statement statement;
        try {
            statement = conn.createStatement();
            if((statement.executeUpdate(query))==1) {
                System.out.println("Data" + message + "Successfully!!");
                return true;
           }
        }catch (HeadlessException | SQLException ex) {
            System.out.println("Error in database executeSQLQuery method " + ex );

        }
        return false;
     }
    public ResultSet retrieveData(String query) {
        try {
           conn = getConn();
           PreparedStatement stmt=conn.prepareStatement(query);
           ResultSet rs=stmt.executeQuery();
           return rs;
           

           
       } catch (SQLException ex) {
           System.out.println(ex+"error in mysqlconnect.java at line 63");
           return null;
       }
    }
    
}


