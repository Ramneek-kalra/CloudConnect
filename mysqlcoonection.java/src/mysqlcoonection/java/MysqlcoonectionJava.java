/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlcoonection.java;
import java.sql.*;
/**
 *
 * @author user
 */
public class MysqlcoonectionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/db1";
        try{   
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loded");
            Connection con = DriverManager.getConnection(url,"root","hmritm");
            System.out.println("connection established");
            con.close();
        }  
        catch(Exception e)
        {
            System.out.println("exception occured"+e);
        }
    }
    
}
