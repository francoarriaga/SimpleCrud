/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;


//import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author franco
 */
public class conexion {
    Connection con ;
    
    public conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3307/prueba", "root","");
            System.out.println("Established connection");
        } catch (Exception e) {
            System.out.println("No connection");
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
