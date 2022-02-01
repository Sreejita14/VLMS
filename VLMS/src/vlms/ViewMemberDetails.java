/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewMemberDetails extends JFrame implements ActionListener{
    JLabel label0,label1,label2,label3,label4,label5,label6,label7,label8,label9,textField6,textField7,textField8;
    JTextField textField,textField1,textField2,textField3,textField4,textFieldCombo,textField5;
    JComboBox comboBox ;
    JPanel Panel;
    JButton b1,b2,b3,b4;
    public ViewMemberDetails()
    {
      label0 = new JLabel();
        label0.setText("Membership ID");
        label0.setBounds(10,30,120,50);
        label0.setForeground(Color.black);// set font color of text
        label0.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        label1 = new JLabel();
        label1.setText("Username");
        label1.setBounds(10,60,100,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
       // label1.setBackground(Color.red);
        //label1.setOpaque(true);
        
        label2 = new JLabel();
        label2.setText("Name");
        label2.setBounds(10,90,100,50);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label3 = new JLabel();
        label3.setText("E-mail ID");
        label3.setBounds(10,120,100,50);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label4 = new JLabel();
        label4.setText("Address");
        label4.setBounds(10,150,100,50);
        label4.setForeground(Color.black);// set font color of text
        label4.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
       
        
        label5 = new JLabel();
        label5.setText("Phone no.");
        label5.setBounds(10,180,100,50);
        label5.setForeground(Color.black);// set font color of text
        label5.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label6 = new JLabel();
        label6.setText("Membership");
        label6.setBounds(10,210,120,50);
        label6.setForeground(Color.black);// set font color of text
        label6.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label7 = new JLabel();
        label7.setText("Enroll Date");
        label7.setBounds(10,240,120,50);
        label7.setForeground(Color.black);// set font color of text
        label7.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label8 = new JLabel();
        label8.setText("Expiry Date");
        label8.setBounds(10,270,120,50);
        label8.setForeground(Color.black);// set font color of text
        label8.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        
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
        //textField.setText("username");
        
        textField3 = new JTextField();
        textField3.setBounds(135,135,250,20);
        textField3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField3.setForeground(Color.black);
        textField3.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField3.setCaretColor(Color.black);
        //textField.setText("username");
        
        textField4 = new JTextField();
        textField4.setBounds(135,165,250,20);
        textField4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField4.setCaretColor(Color.black);
        //textField.setText("username");
        
  
        
        
        textField5 = new JTextField();
        textField5.setBounds(135,195,250,20);
        textField5.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField5.setForeground(Color.black);
        textField5.setBackground(Color.white);
        textField5.setCaretColor(Color.black);
        
        textField6 = new JLabel();
        textField6.setBounds(135,225,250,20);
        textField6.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField6.setForeground(Color.black);
        textField6.setBackground(Color.white);
        
        
        textField7 = new JLabel();
        textField7.setBounds(135,255,250,20);
        textField7.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField7.setForeground(Color.black);
        textField7.setBackground(Color.white);
        
        
        textField8 = new JLabel();
        textField8.setBounds(135,285,250,20);
        textField8.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField8.setForeground(Color.black);
        textField8.setBackground(Color.white);
        
        
        
        
        
        b1 = new JButton("View");
        b1.addActionListener(this);
        b1.setFocusable(false);
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
        b1.setBounds(390,45,70,20);
        
        
        b2=new JButton("Back");
        b2.addActionListener(this);
        b2.setFocusable(false);
        b2.setForeground(Color.white);
        b2.setBackground(Color.blue);
        b2.setBounds(80,350,90,30);
        
        b3=new JButton("Update");
        b3.addActionListener(this);
        b3.setFocusable(false);
        b3.setForeground(Color.white);
        b3.setBackground(Color.BLACK);
        b3.setBounds(200,350,90,30);
        
        
        b4=new JButton("Delete");
        b4.addActionListener(this);
        b4.setFocusable(false);
        b4.setForeground(Color.white);
        b4.setBackground(Color.red);
        b4.setBounds(320,350,90,30);
        
        
        
        Panel  = new JPanel();
        Panel.setBackground(new Color(220,220,220));
        Panel.setBounds(0, 0, 500, 500);
        Panel.setLayout(null);
        Panel.add(label0);
        Panel.add(label1);
        Panel.add(label2);
        Panel.add(label3);
        Panel.add(label4);
        Panel.add(label5);
        Panel.add(label6);
        Panel.add(label7);
        Panel.add(label8);
        Panel.add(textField);
        Panel.add(textField1);
        Panel.add(textField2);
        Panel.add(textField3);
        Panel.add(textField4);
        Panel.add(textField5);
        Panel.add(textField6);
        Panel.add(textField7);
        Panel.add(textField8);
        Panel.add(b1);
        Panel.add(b2);
        Panel.add(b3);
       Panel.add(b4);
      
        
        
        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("View Details");
        this.setSize(500,450);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.add(Panel);
    }
    
 
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
       
    try{
        Conn c = new Conn();
        if(e.getSource()==b1)
       {
          
           
           String query = "SELECT * FROM ACCOUNT WHERE ID =?";
           
           PreparedStatement ps = c.con.prepareStatement(query);
          
           
           ps.setString(1,textField.getText());
          
           
           ResultSet rs = ps.executeQuery();
           
           while(rs.next())
           {
               textField1.setText(rs.getString("username"));
               textField2.setText(rs.getString("name"));
               textField3.setText(rs.getString("mail"));
               textField4.setText(rs.getString("address"));
               textField5.setText(rs.getString("number"));
           }
           
           String query2 = "SELECT membership,memEnrollDate,memExpireDate FROM ACCOUNT WHERE ID =?";
           PreparedStatement ps2 = c.con.prepareStatement(query2);
           ps2.setString(1,textField.getText());
           ResultSet rs2 = ps2.executeQuery();
            while(rs2.next())
           {
              
               textField6.setText(rs2.getString("membership"));
               textField7.setText(rs2.getString("memEnrollDate"));
               textField8.setText(rs2.getString("memExpireDate"));
               
           }
           
        JOptionPane.showMessageDialog(null, "Last Membership Package is only displayed here!");
        
        
          
          
       
       }
    
        
           else if(e.getSource()==b2)
            {
                setVisible(false);
                new MemberFirstScreen().setVisible(true);
         
            }
            
            else if(e.getSource()==b3)
            {
                                if(textField1.getText().equals(""))
                                {
                                     JOptionPane.showMessageDialog(null, "Provide Correct Membership ID", "", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                    /*
                                String s1 = textField.getText();
                                String s2 = textField1.getText(); 
	    			String s3 =  textField2.getText();
	    			String s4 =  textField3.getText();
                                String s5 =  textField4.getText();
	    			String s6 =  textField5.getText();
	    			*/
                                
                              
                                
                                
                                String query = "UPDATE ACCOUNT SET username=?,name=?,mail=?,address=?,number=? WHERE ID=?";
                                PreparedStatement ps = c.con.prepareStatement(query);
           
                                ps.setString(1,textField1.getText());
                                ps.setString(2,textField2.getText());
                                ps.setString(3,textField3.getText());
                                ps.setString(4,textField4.getText());
                                ps.setString(5,textField5.getText());
                                ps.setString(6,textField.getText());
                                
                                
                                 int count = ps.executeUpdate();
                                
	    			 JOptionPane.showMessageDialog(null, "Details Updated Successfully!!!", "", JOptionPane.INFORMATION_MESSAGE);
                                setVisible(false);
                                
                                
                                
                                 String query2 = "UPDATE STATISTICS SET name=?,mail=? WHERE ID=?";
                                PreparedStatement ps2 = c.con.prepareStatement(query2);
           
                                ps2.setString(1,textField2.getText());
                                ps2.setString(2,textField3.getText());
                                ps2.setString(3,textField.getText());

                               
                                
                                
                                 int count2 = ps2.executeUpdate();
                                 
                                 
                                 String query3 = "UPDATE ISSUE SET name=?,mail=? WHERE ID=?";
                                PreparedStatement ps3 = c.con.prepareStatement(query3);
           
                                ps3.setString(1,textField2.getText());
                                ps3.setString(2,textField3.getText());
                                ps3.setString(3,textField.getText());
                               
                                
                                
                                
                                  ps3.executeUpdate();
                                  new MemberFirstScreen().setVisible(true);
                                }
         
            }
            else if(e.getSource()==b4)
            {
                if(textField1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Account does not exist!", "", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else
                {
                    int answer=JOptionPane.showConfirmDialog(null,  "This will permanently delete your account from VLMS.\nDo you want to delete your account?", "", JOptionPane.YES_NO_OPTION);
                
                    System.out.println(answer);
                    if(answer==0)
                    {
                        String query1 = "DELETE FROM ACCOUNT WHERE ID=?";
                        PreparedStatement ps1 = c.con.prepareStatement(query1);  
                        ps1.setString(1,textField.getText());
          
           
                         
  
                        int count1 =ps1.executeUpdate();  
                        System.out.println(count1+" records deleted");  
                        
                        
                        String query2 = "DELETE FROM ISSUE WHERE ID=?";
                        PreparedStatement ps2 = c.con.prepareStatement(query2);  
                        ps2.setString(1,textField.getText());
          
           
                         
  
                        int count2= ps2.executeUpdate();  
                        System.out.println(count2+" records deleted"); 
                        JOptionPane.showMessageDialog(null, "Account Deleted!", "", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                       
                    }
                    else if(answer==1)
                    {
                
                        this.setVisible(true);
                    }
                    else
                    {
                            this.setVisible(true);
                     }
                }
            }
       
    }
   catch(Exception ae)
        {
          System.out.println(ae);   
        }
    }
    
     public static void main(String[] args) {
        new ViewMemberDetails();
    }

   
   
}


