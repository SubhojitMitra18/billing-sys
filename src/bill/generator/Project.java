/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bill.generator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author dell
 */
public class Project extends JFrame implements ActionListener{
    String atype,meter;
    
    Project(String atype,String meter)
    {
        this.meter=meter;
        this.atype=atype;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/elect1.jpg"));
        Image i2=i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
        
        JMenu master=new JMenu("Master");
        master.setForeground(Color.BLUE);
        master.setFont(new Font("Times New Roman",Font.BOLD,25));
        
        
        JMenuItem newcustomer=new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,20));
        newcustomer.setBackground(Color.white);
        ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("Icons/icon1.png"));
        Image image1=icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(image1));
        newcustomer.setMnemonic('D');
        newcustomer.addActionListener(this);
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        master.add(newcustomer);
        
        JMenuItem customerdetails=new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced",Font.PLAIN,20));
        customerdetails.setBackground(Color.white);
        ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("Icons/icon2.png"));
        Image image2=icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(image2));
        customerdetails.setMnemonic('M');
        customerdetails.addActionListener(this);
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        master.add(customerdetails);
        
        
        JMenuItem depositdetails=new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("monospaced",Font.PLAIN,20));
        depositdetails.setBackground(Color.white);
        ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("Icons/icon3.png"));
        Image image3=icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(image3));
        depositdetails.setMnemonic('N');
        depositdetails.addActionListener(this);
        depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        master.add(depositdetails);
        
        JMenuItem calculatebill=new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced",Font.PLAIN,20));
        calculatebill.setBackground(Color.white);
        ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("Icons/icon5.png"));
        Image image4=icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(image4));
        calculatebill.setMnemonic('B');
        calculatebill.addActionListener(this);
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        master.add(calculatebill);
        
        JMenu info=new JMenu("Information");
        info.setForeground(Color.red);
        info.setFont(new Font("Times New Roman",Font.BOLD,25));
        mb.add(info);
        
        JMenuItem updateinformation=new JMenuItem("Update Information");
        updateinformation.setFont(new Font("monospaced",Font.PLAIN,20));
        updateinformation.setBackground(Color.white);
        ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("Icons/icon4.png"));
        Image image6=icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        updateinformation.setIcon(new ImageIcon(image6));
        updateinformation.setMnemonic('P');
        updateinformation.addActionListener(this);
        updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        info.add(updateinformation);
        
        JMenuItem viewinformation=new JMenuItem("View Information");
        viewinformation.setFont(new Font("monospaced",Font.PLAIN,20));
        viewinformation.setBackground(Color.white);
        ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("Icons/icon6.png"));
        Image image5=icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewinformation.setIcon(new ImageIcon(image5));
        viewinformation.setMnemonic('L');
        viewinformation.addActionListener(this);
        viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        info.add(viewinformation);
        
        JMenu user=new JMenu("User");
        user.setForeground(Color.BLUE);
        user.setFont(new Font("Times New Roman",Font.BOLD,25));
        
        
        JMenuItem paybill=new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced",Font.PLAIN,20));
        paybill.setBackground(Color.white);
        ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("Icons/icon4.png"));
        Image image7=icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(image7));
        paybill.setMnemonic('R');
        paybill.addActionListener(this);
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        user.add(paybill);
        
        JMenuItem billdetails=new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced",Font.PLAIN,20));
        billdetails.setBackground(Color.white);
        ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("Icons/icon6.png"));
        Image image8=icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(image8));
        billdetails.setMnemonic('B');
        billdetails.addActionListener(this);
        billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        user.add(billdetails);
        
        JMenu report=new JMenu("Report");
        report.setForeground(Color.red);
        report.setFont(new Font("Times New Roman",Font.BOLD,25));
        
        
        JMenuItem generatebill=new JMenuItem("Generate Bill");
        generatebill.setFont(new Font("monospaced",Font.PLAIN,20));
        generatebill.setBackground(Color.white);
        ImageIcon icon9=new ImageIcon(ClassLoader.getSystemResource("Icons/icon7.png"));
        Image image9=icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        generatebill.setIcon(new ImageIcon(image9));
        generatebill.setMnemonic('G');
        generatebill.addActionListener(this);
        generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
        report.add(generatebill);
        
        JMenu utility=new JMenu("Utility");
        utility.setForeground(Color.blue);
        utility.setFont(new Font("Times New Roman",Font.BOLD,25));
        
        
        JMenuItem notepad=new JMenuItem("NotePad");
        notepad.setFont(new Font("monospaced",Font.PLAIN,20));
        notepad.setBackground(Color.white);
        ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("Icons/icon12.png"));
        Image image10=icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(image10));
        notepad.setMnemonic('N');
        notepad.addActionListener(this);
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        utility.add(notepad);
        
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced", Font.PLAIN, 20));
        calculator.setBackground(Color.white);
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("Icons/icon9.png"));
        Image image11 = icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(image11));
        calculator.setMnemonic('C');
        calculator.addActionListener(this);
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        utility.add(calculator);
        
        JMenu mexit=new JMenu("Exit");
        mexit.setForeground(Color.red);
        mexit.setFont(new Font("Times New Roman",Font.BOLD,25));
        
        
        
        JMenuItem exit=new JMenuItem("Exit");
        exit.setFont(new Font("monospaced",Font.PLAIN,20));
        exit.setBackground(Color.white);
        ImageIcon icon12=new ImageIcon(ClassLoader.getSystemResource("Icons/icon11.png"));
        Image image12=icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(image12));
        exit.setMnemonic('W');
        exit.addActionListener(this);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
        mexit.add(exit);
        
        if(atype.equals("Admin")){
        mb.add(master);
        mb.add(mexit);
        mb.add(utility);
        }
        else{
        mb.add(info);
        mb.add(report);
        mb.add(user);
        mb.add(mexit);
        mb.add(utility);
        
        }
         
        
        setLayout(new FlowLayout());
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String msg=ae.getActionCommand();
        if(msg.equals("New Customer")){
            new NewCustomer();
        }
        else if(msg.equals("Customer Details")){
            new Customerdetails();
        }
        
        else if(msg.equals("Deposit Details")){
            new DepositDetails();
        }
        
        else if(msg.equals("Calculate Bill")){
            new CalculateBill();
        }
        else if(msg.equals("View Information"))
        {
            new ViewInformation(meter);
        }else if(msg.equals("Update Information"))
        {
            new UpdateInformation(meter);
        }else if(msg.equals("Bill Details"))
        {
            new BillDetails(meter);
        }
        else if(msg.equals("NotePad"))
        {
            try {
                Runtime.getRuntime().exec("Notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(msg.equals("Calculator"))
        {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(msg.equals("Exit"))
        {
            setVisible(false);
            new Login();
        }else if(msg.equals("Pay Bill"))
        {
            new PayBil(meter);
        }else if(msg.equals("Generate Bill"))
        {
            new GenerateBill(meter);
        }
    }
    
    public static void main(String[] args)
    {
        new Project("","");
    }
}