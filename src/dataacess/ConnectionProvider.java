/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataacess;
import java.sql.*;

/**
 *
 * @author madhurshinde
 */
public class ConnectionProvider {
    public static Connection getCON(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rms?useSSL=false","root","Madhur@2110*");
    return con;
    }
        catch(Exception e){
            
        return null;
        }
    }
    
}