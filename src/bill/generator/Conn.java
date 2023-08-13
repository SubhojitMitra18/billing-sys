/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bill.generator;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dell
 */
public class Conn {
    Connection c;
    Statement s;
    Conn()
    {
        try {
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/billsys","root","");
            s=c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
