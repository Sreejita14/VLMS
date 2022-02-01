/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
    JLabel label1,label2,label3,labelid;
    JButton button1,button2,button3;
    JTextField textField1,textField2,textFieldID;
    JComboBox comboBox;
    JPanel panel;
    Login()
    {
        labelid = new JLabel();
        labelid.setText("Member ID");
        labelid.setBounds(10,60,120,50);
        labelid.setForeground(Color.black);// set font color of text
        labelid.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label1 = new JLabel();
        label1.setText("Userame");
        label1.setBounds(10,90,100,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
       // label1.setBackground(Color.red);
        //label1.setOpaque(true);
        
        label2 = new JLabel();
        label2.setText("Password");
        label2.setBounds(10,120,100,50);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        
       /* 
        label3 = new JLabel();
        label3.setText("Role");
        label3.setBounds(10,165,100,50);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        
        
        String[] options = {"Admin","Member"};
        comboBox = new JComboBox(options);
        comboBox.setBounds(90,175,150,20);
        */
        
        button1 = new JButton();
        button1.setBounds(30,220,100,30);
        button1.addActionListener(this);
        button1.setText("Login");
        button1.setFocusable(false);
        button1.setBackground(new Color(30,138,246));
        button1.setForeground(Color.white);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        
        button2 = new JButton();
        button2.setBounds(145,220,100,30);
        button2.addActionListener(this);
        button2.setText("SignUp");
        button2.setFocusable(false);
        button2.setBackground(new Color(30,138,246));
        button2.setForeground(Color.white);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        
        button3 = new JButton();
        button3.setBounds(65,260,170,30);
        button3.addActionListener(this);
        button3.setText("Forget Password");
        button3.setFocusable(false);
        button3.setBackground(new Color(30,138,246));
        button3.setBorderPainted( false );
        button3.setForeground(Color.white);
        button3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        
        textFieldID = new JTextField();
        textFieldID .setBounds(90,75,150,20);
        textFieldID .setFont(new Font("Times New Roman",Font.PLAIN,20));
        textFieldID .setForeground(Color.black);
        textFieldID .setBackground(Color.white);
        textFieldID .setCaretColor(Color.black);
        
        textField1 = new JTextField();
        textField1.setBounds(90,105,150,20);
        textField1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
        
        
        textField2 = new JPasswordField();
        textField2.setBounds(90,135,150,20);
        textField2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
        textField2.setCaretColor(Color.black);
        
        
        
        
        
        JPanel Panel  = new JPanel();
        Panel.setBackground(new Color(220,220,220));
        Panel.setBounds(0, 0, 300, 400);
        Panel.setLayout(null);
        Panel.add(labelid);
        Panel.add(label1);
        Panel.add(label2);
       // Panel.add(label3);
        Panel.add(textFieldID);
        Panel.add(textField1);
        Panel.add(textField2);
        //Panel.add(comboBox);
        Panel.add(button1);
        Panel.add(button2);
        Panel.add(button3);
        
        
        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Login");
        this.setSize(300,400);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(34,67,88)); 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.getContentPane().setBackground(Color.LIGHT_GRAY); 
        this.add(Panel);
        //this.add(label1);
        //this.add(label2);
        
       
        
       
        
        
    
        
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
            
    try{
        Conn c = new Conn();
        if(e.getSource()==button1)
       {
          //System.out.println( textField.getText());
          String query = "SELECT * FROM ACCOUNT WHERE BINARY ID=? AND username =? AND BINARY password=?";
           PreparedStatement ps = c.con.prepareStatement(query);
           
            ps.setString(1,textFieldID.getText());
           ps.setString(2,textField1.getText());
            ps.setString(3,textField2.getText());
           ResultSet rs = ps.executeQuery();
        if(rs.next())
           {
              setVisible(false);
              new AdminFirstScreen().setVisible(true);
            
           }
           else if(textFieldID.getText().equals(""))
               {
                    JOptionPane.showMessageDialog(null, "Provide Membership ID!");
               }
           else
               JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
           
           new ViewMemberDetails().setVisible(false);
       }
    
        
           else if(e.getSource()==button2)
            {
          setVisible(false);
            new SignUp().setVisible(true);
         
            }
            
            else if(e.getSource()==button3)
            {
                 setVisible(false);
          new ForgotPassword().setVisible(true);
         
            }
       
    }
   catch(Exception ae)
        {
          System.out.println(e);   
        }
    }
    
       
    
     public static void main(String[] args)
    {
        new Login();
    }
}

