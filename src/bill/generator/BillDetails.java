/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bill.generator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author dell
 */
public class BillDetails extends JFrame{
    String meter;
    BillDetails(String meter){
        this.meter=meter;
        setSize(700,650);
        setLocation(400,150);
        getContentPane().setBackground(Color.WHITE);
        JTable table=new JTable();
        
        try {
            Conn c=new Conn();
            String query="select * from bill where meter_no='"+meter+"'";
            ResultSet rs=c.s.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane sp=new JScrollPane(table);
        sp.setBounds(0,0,700,650);
        add(sp);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BillDetails("");
    }
}
