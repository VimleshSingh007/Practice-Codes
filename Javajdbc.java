/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javajdbc;

//CREATE TABLE 

import java.sql.*;

public class Javajdbc {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "samar@4581";

        Connection connection = DriverManager.getConnection(url, username, password);
        
        String q="create table employee(sid int primary key auto_increment,ename varchar(40),eadd varchar(100),esalary double)";
                

        Statement statement = connection.createStatement();
        statement.executeUpdate(q);
        System.out.println("table created successfully ");
       
            
        statement.close();
        connection.close();
        
        }catch(Exception e){
                System.out.println(e);
        } 
    }
        
    
}
   
    

