/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.sql.*;
//change password
public class ForgotPassword extends JFrame implements ActionListener{
   
    JLabel label0,label1,label2,label3,label4,label5,label6,label7;
    JTextField textField,textField1,textField2,textField3,textField4,textField5;
    JComboBox comboBox ;
    JPanel Panel;
    JButton b1,b2,b3;
    public ForgotPassword()
    {
        label0 = new JLabel();
        label0.setText("Membership ID");
        label0.setBounds(10,30,130,50);
        label0.setForeground(Color.black);// set font color of text
        label0.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        label1 = new JLabel();
        label1.setText("Name");
        label1.setBounds(10,60,130,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
       // label1.setBackground(Color.red);
        //label1.setOpaque(true);
        
        label2 = new JLabel();
        label2.setText("Security Question");
        label2.setBounds(10,90,130,50);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label3 = new JLabel();
        label3.setText("Answer");
        label3.setBounds(10,120,130,50);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
       /* 
        label4 = new JLabel();
        label4.setText("Change Username");
        label4.setBounds(10,150,130,50);
        label4.setForeground(Color.black);// set font color of text
        label4.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        */
        label5 = new JLabel();
        label5.setText("Change Password");
        label5.setBounds(10,180,130,50);
        label5.setForeground(Color.black);// set font color of text
        label5.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        
        
        textField = new JTextField();
        textField.setBounds(135,45,250,20);
        textField.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField.setForeground(Color.black);
        textField.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField.setCaretColor(Color.black);
        
        textField1 = new JTextField();
        textField1.setBounds(135,75,250,20);
        textField1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField1.setCaretColor(Color.black);
        //textField.setText("username");
        
        textField2 = new JTextField();
        textField2.setBounds(135,105,250,20);
        textField2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField2.setCaretColor(Color.black);
        
        textField3 = new JTextField();
        textField3.setBounds(135,135,250,20);
        textField3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField3.setForeground(Color.black);
        textField3.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField3.setCaretColor(Color.black);
        //textField.setText("username");
        
       /* textField4 = new JTextField();
        textField4.setBounds(135,165,250,20);
        textField4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField4.setCaretColor(Color.black);
        //textField.setText("username");*/
        
        textField5 = new JPasswordField();
        textField5.setBounds(135,195,250,20);
        textField5.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField5.setForeground(Color.black);
        textField5.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField5.setCaretColor(Color.black);
        //textField.setText("username");
        
        
      
        
        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setFocusable(false);
        b1.setForeground(Color.white);
        b1.setBackground(Color.blue);
        b1.setBounds(400,40,100,30);
        
        b2=new JButton("Change");
        b2.addActionListener(this);
        b2.setFocusable(false);
        b2.setForeground(Color.white);
        b2.setBackground(Color.blue);
        b2.setBounds(100,300,100,30);
        
        
        b3=new JButton("Back");
        b3.addActionListener(this);
        b3.setFocusable(false);
        b3.setForeground(Color.white);
        b3.setBackground(Color.blue);
        b3.setBounds(300,300,100,30);
        
       
        
        
        Panel  = new JPanel();
        Panel.setBackground(new Color(220,220,220));
        Panel.setBounds(0, 0, 600,400);
        Panel.setLayout(null);
        Panel.add(label0);
        Panel.add(label1);
        Panel.add(label2);
        Panel.add(label3);
        //Panel.add(label4);
        Panel.add(label5);
        Panel.add(textField);
        Panel.add(textField1);
        Panel.add(textField2);
        Panel.add(textField3);
       // Panel.add(textField4);
        Panel.add(textField5);
        Panel.add(b1);
        Panel.add(b2);
        Panel.add(b3);
        
        
        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Forgot Password");
        this.setSize(600,400);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
       // this.getContentPane().setBackground(new Color(34,67,88)); 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        //this.getContentPane().setBackground(Color.LIGHT_GRAY); 
        this.add(Panel);
    }
    
 
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
       
    try{
        Conn c = new Conn();
        if(e.getSource()==b1)
       {
          if(textField.getText().equals(""))
                {
                     JOptionPane.showMessageDialog(null, "Provide Membership ID!", "", JOptionPane.INFORMATION_MESSAGE);
                }
          else
          {
          String query = "SELECT * FROM ACCOUNT WHERE ID =?";
           PreparedStatement ps = c.con.prepareStatement(query);
           
           ps.setString(1,textField.getText());
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
               textField1.setText(rs.getString("name"));
               textField2.setText(rs.getString("security"));
           }
          }
       }
    
        
           else if(e.getSource()==b2)
            {/*
           String query = "SELECT * FROM ACCOUNT WHERE BINARY ID=? AND BINARY answer =?";
           PreparedStatement ps = c.con.prepareStatement(query);
           
           ps.setString(1,textField.getText());
           ps.setString(2,textField3.getText());
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
               textField4.setText(rs.getString("username"));
               textField5.setText(rs.getString("password"));
           }
           */
                                    String query2 = "SELECT answer FROM ACCOUNT WHERE ID =?";
                                    PreparedStatement ps2 = c.con.prepareStatement(query2);
           
                                         ps2.setString(1,textField.getText());
                                     ResultSet rs2 = ps2.executeQuery();
                                         while(rs2.next())
                                     {
                                        
                                         
                                         if(!textField3.getText().equals(rs2.getString("answer")))
                                        {
                                             JOptionPane.showMessageDialog(null, "Provide Correct Security answer!", "", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                         else
                                           JOptionPane.showMessageDialog(null, "Password Changed", "", JOptionPane.INFORMATION_MESSAGE);  
                                     }
                                         
                  
                
                 if(textField.getText().equals(""))
                {
                     JOptionPane.showMessageDialog(null, "Provide Membership ID!", "", JOptionPane.INFORMATION_MESSAGE);
                }
                 else if(textField3.getText().equals(""))
                {
                     JOptionPane.showMessageDialog(null, "Provide Security answer!", "", JOptionPane.INFORMATION_MESSAGE);
                }
                 
                else
                {  
              
                                String query = "UPDATE ACCOUNT SET password=? WHERE ID=? AND BINARY answer =?";
                                PreparedStatement ps = c.con.prepareStatement(query);
           
                                ps.setString(1,textField5.getText());
                                ps.setString(2,textField.getText());
                                ps.setString(3,textField3.getText());
                                
                                ps.executeUpdate();
                   	 
           
                }
                textField.setText("");
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField5.setText("");
               
           
         
            }
            
            else if(e.getSource()==b3)
            {
                setVisible(false);
                new Login().setVisible(true);
         
            }
       
    }
   catch(Exception ae)
        {
          System.out.println(e);   
        }
    }
    
     public static void main(String[] args) {
       new ForgotPassword();
    }

   
   
}

