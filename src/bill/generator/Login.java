/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bill.generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
/**
 *
 * @author dell
 */
public class Login extends JFrame implements ActionListener{
    JButton login,cancel,signup;
    JTextField username,password;
    Choice logginin;
    Login()
    {
        super("Login Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(300,20,100,20);
        add(lblusername);
        
        username=new JTextField();
        username.setBounds(400, 20, 150, 20);
        add(username);
        
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(300,60,100,20);
        add(lblpassword);
        
        password=new JTextField();
        password.setBounds(400, 60, 150, 20);
        add(password);
        
        JLabel logininas=new JLabel("Loggin in as");
        logininas.setBounds(300,100,100,20);
        add(logininas);
        
        logginin=new Choice();
        logginin.add("Admin");
        logginin.add("Customer");
        logginin.setBounds(400,100,150,20);
        add(logginin);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        
        login=new JButton("Login",new ImageIcon(i2));
        login.setBounds(330,160,100,20);
        login.addActionListener(this);
        add(login);
        
        
        ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("Icons/signup.png"));
        Image i4=i3.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        signup=new JButton("Signup",new ImageIcon(i4));
        signup.setBounds(450,160,100,20);
        signup.addActionListener(this);
        add(signup);
        
        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("Icons/cancel.jpg"));
        Image i6=i5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        cancel=new JButton("Cancel",new ImageIcon(i6));
        cancel.setBounds(380,200,100,20);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("Icons/second.jpg"));
        Image i8=i7.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel image=new JLabel(i9);
        image.setBounds(0,0,250,250);
        add(image);
        
        setSize(640,300);
        setLocation(400,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==login){
            String susername=username.getText();
            String spassword=password.getText();
            String user=logginin.getSelectedItem();
            
            try {
                Conn c=new Conn();
                String query="select * from login where username='"+susername+"' and password='"+spassword+"' and user='"+user+"'";
                ResultSet rs= c.s.executeQuery(query);
                if(rs.next())
                {
                    String meter=rs.getString("meter_no");
                    setVisible(false);
                    new Project(user,meter);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                    username.setText("");
                    password.setText("");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==signup)
        {
            
            new Signup();
        }
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new Login();
    }
}
