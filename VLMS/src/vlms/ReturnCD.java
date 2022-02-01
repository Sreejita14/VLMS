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
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReturnCD extends JFrame implements ActionListener{
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,textField3,textField4,textField5,textField7,textField8,textField9,textField10,textField11,textField12;
    JTextField textField1,textField2,textField6;
    JComboBox comboBox ;
    JPanel Panel;
    JButton viewMember,enrollButton,searchButton,returnButton,backButton;
    public ReturnCD()
    {
        label1 = new JLabel();
        label1.setText("Membership ID");
        label1.setBounds(10,30,120,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        
        label2 = new JLabel();
        label2.setText("Code"); //Member Name,Email ID, Enroll Date
        label2.setBounds(10,60,120,50);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        label3 = new JLabel();
        label3.setText("Member Name");
        label3.setBounds(10,90,100,50);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        label4 = new JLabel();
        label4.setText("Email ID");
        label4.setBounds(10,120,100,50);
        label4.setForeground(Color.black);// set font color of text
        label4.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        label5 = new JLabel();
        label5.setText("CD Return Date");
        label5.setBounds(10,150,200,50);
        label5.setForeground(Color.black);// set font color of text
        label5.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        
        
        
        label6 = new JLabel();
        label6.setText("CD ID");
        label6.setBounds(10,180,100,50);
        label6.setForeground(Color.black);// set font color of text
        label6.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
      
        
        label7 = new JLabel();
        label7.setText("CD Genre");
        label7.setBounds(10,210,100,50);
        label7.setForeground(Color.black);// set font color of text
        label7.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label8 = new JLabel();
        label8.setText("CD Name");
        label8.setBounds(10,240,100,50);
        label8.setForeground(Color.black);// set font color of text
        label8.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label9 = new JLabel();
        label9.setText("Episode/s");
        label9.setBounds(10,270,100,50);
        label9.setForeground(Color.black);// set font color of text
        label9.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
       
        
        label10 = new JLabel();
        label10.setText("Director");
        label10.setBounds(10,300,120,50);
        label10.setForeground(Color.black);// set font color of text
        label10.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label11 = new JLabel();
        label11.setText("Hours");
        label11.setBounds(10,330,120,50);
        label11.setForeground(Color.black);// set font color of text
        label11.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label12 = new JLabel();
        label12.setText("CD Issue Date");
        label12.setBounds(10,360,120,50);
        label12.setForeground(Color.black);// set font color of text
        label12.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        /*label13 = new JLabel();
        label13.setText("Due Date");
        label13.setBounds(10,390,120,50);
        label13.setForeground(Color.black);// set font color of text
        label13.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text*/
        
       
        textField1 = new JTextField();
        textField1.setBounds(135,45,250,20);
        textField1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        
        
        textField2 = new JTextField();
        textField2.setBounds(135,75,250,20);
        textField2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField2.setForeground(Color.black);
        textField2.setEditable(false);
       textField2.setBackground(Color.white);
        
        
        
        textField3 = new JLabel();
        textField3.setBounds(135,105,250,20);
        textField3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField3.setForeground(Color.black);
        textField3.setBackground(Color.white);
        
        
        
        textField4 = new JLabel();
        textField4.setBounds(135,135,250,20);
        textField4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.white);
        
        textField5 = new JLabel();
        textField5.setBounds(135,165,250,20);
        textField5.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField5.setForeground(Color.black);
        textField5.setBackground(Color.white);
        
        
        /*textField6 = new JTextField();
        textField6.setBounds(135,195,250,20);
        textField6.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField6.setForeground(Color.black);
        textField6.setBackground(Color.white);
        textField6.setCaretColor(Color.black);*/
        comboBox = new JComboBox();
        comboBox.setBounds(135,195,250,20);//(135,205,250,20);
        comboBox.addActionListener(this);
        
        
  
        
        
        textField7 = new JLabel();
        textField7.setBounds(135,225,250,20);
        textField7.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField7.setForeground(Color.black);
        textField7.setBackground(Color.white);
        
        textField8 = new JLabel();
        textField8.setBounds(135,255,250,20);
        textField8.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField8.setForeground(Color.black);
        textField8.setBackground(Color.white);
        
        textField9 = new JLabel();
        textField9.setBounds(135,285,250,20);
        textField9.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField9.setForeground(Color.black);
        textField9.setBackground(Color.white);
        
        textField10 = new JLabel();
        textField10.setBounds(135,315,250,20);
        textField10.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField10.setForeground(Color.black);
        textField10.setBackground(Color.white);
        
        textField11 = new JLabel();
        textField11.setBounds(135,345,250,20);
        textField11.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField11.setForeground(Color.black);
        textField11.setBackground(Color.white);
        
        textField12= new JLabel();
        textField12.setBounds(135,375,250,20);
        textField12.setForeground(Color.black);// set font color of text
        textField12.setFont(new Font("Times New Roman", Font.PLAIN, 20));// set font of text
        
       /* textField13= new JLabel();
        textField13.setBounds(135,405,250,20);
        textField13.setForeground(Color.black);// set font color of text
        textField13.setFont(new Font("Times New Roman", Font.PLAIN, 20));// set font of text*/
       
        
       
       
       
            
        viewMember=new JButton("View");
        viewMember.addActionListener(this);
        viewMember.setFocusable(false);
        viewMember.setForeground(Color.white);
        viewMember.setBackground(Color.black);
        viewMember.setBounds(390,45,70,20);  
        
        
                
                
     
        
        searchButton = new JButton("Search");
        searchButton.addActionListener(this);
        searchButton.setFocusable(false);
        searchButton.setForeground(Color.white);
        searchButton.setBackground(Color.BLACK);
        searchButton.setBounds(390,195,85,20);
        
       /* enrollButton=new JButton("Issue");
        enrollButton.addActionListener(this);
        enrollButton.setFocusable(false);
        enrollButton.setForeground(Color.white);
        enrollButton.setBackground(Color.blue);
        enrollButton.setBounds(100,450,90,30);*/
        
       returnButton=new JButton("Return");
        returnButton.addActionListener(this);
        returnButton.setFocusable(false);
        returnButton.setForeground(Color.white);
        returnButton.setBackground(Color.blue);
        returnButton.setBounds(100,450,90,30);
        //returnButton.setEnabled(true);*/
        
        backButton=new JButton("Back");
        backButton.addActionListener(this);
        backButton.setFocusable(false);
        backButton.setForeground(Color.white);
        backButton.setBackground(Color.blue);
        backButton.setBounds(300,450,90,30);
        
        
      
        
        
        
        Panel  = new JPanel();
        Panel.setBackground(new Color(220,220,220));
        Panel.setBounds(0, 0, 500, 600);
        Panel.setLayout(null);
        
        Panel.add(label1);
        Panel.add(label2);
        Panel.add(label3);
        Panel.add(label4);
        Panel.add(label5);
        Panel.add(label6);
        Panel.add(label7);
        Panel.add(label8);
        Panel.add(label9);
        Panel.add(label10);
        Panel.add(label11);
        Panel.add(label12);
        //Panel.add(label13);
        Panel.add(textField1);
        Panel.add(textField2);
        Panel.add(textField3);
        Panel.add(textField4);
        Panel.add(textField5);
       // Panel.add(textField6);
       Panel.add(comboBox);
        Panel.add(textField7);
        Panel.add(textField8);
        Panel.add(textField9);
        Panel.add(textField10);
       Panel.add(textField11);
      Panel.add(textField12);
      //Panel.add(textField13);
        Panel.add(searchButton);
        //Panel.add(enrollButton);
      Panel.add(returnButton);
        Panel.add(backButton);
        Panel.add(viewMember);
      
        
        
        
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("");
        this.setSize(500,600);
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
        
               if(e.getSource()==viewMember)
        {
               
            
            
            
            
                                   Date date = new Date();  
                                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                                    String strDate= formatter.format(date);  
                                     textField5.setText(strDate); 
           
          
                                    String query = "SELECT * FROM ACCOUNT WHERE ID =?";
           
                                    PreparedStatement ps = c.con.prepareStatement(query);
          
           
                                     ps.setString(1,textField1.getText());
          
           
                                        ResultSet rs = ps.executeQuery();
           
                                while(rs.next())
                                {
                                    textField2.setText(rs.getString("secretCode"));
                                    textField3.setText(rs.getString("name"));
                                    textField4.setText(rs.getString("mail"));
                                     
                                }                                                 
                                 
                                String query2 = "SELECT * FROM ISSUE WHERE ID=?";
                                PreparedStatement ps2 = c.con.prepareStatement(query2);
                                ps2.setString(1,textField1.getText());
                                ResultSet rs2 = ps2.executeQuery();
                                while(rs2.next())
                                {
                                    comboBox.addItem(rs2.getString(6));
                                    //textField13.setText(rs2.getString("returnDate"));
                                }
                                
                                
                                
        }




  


           else if(e.getSource()==searchButton)
            {
                
                                 
                                 
                                  String query = "SELECT * FROM CD WHERE CDID =?";
           
                                    PreparedStatement ps = c.con.prepareStatement(query);
          
           
                                     ps.setString(1,(String)comboBox.getSelectedItem());
          
           
                                        ResultSet rs = ps.executeQuery();
           
                                if(rs.next())
                                {
                                    textField7.setText(rs.getString("genre"));
                                    textField8.setText(rs.getString("CDname"));
                                    textField9.setText(rs.getString("episode"));
                                    textField10.setText(rs.getString("director"));
                                    textField11.setText(rs.getString("hour"));
                                    //textField12.setText(rs.getString("stocks"));
                                }
                                else
                                {
                                    textField7.setText("");
                                    textField8.setText("");
                                    textField9.setText("");
                                    textField10.setText("");
                                    textField11.setText("");
                                    //textField12.setText("");
                                }
                                
                                
                                
                                String query2 = "SELECT issueDate FROM ISSUE WHERE ID=? AND CDID=?";
                                PreparedStatement ps2 = c.con.prepareStatement(query2);
                                ps2.setString(1,textField1.getText());
                                ps2.setString(2,(String)comboBox.getSelectedItem());
                                ResultSet rs2 = ps2.executeQuery();
                                while(rs2.next())
                                {
                                    textField12.setText(rs2.getString("issueDate"));
                                }
         
            }
            
            else if(e.getSource()==returnButton)
            {
                String item = (String)comboBox.getSelectedItem();
                
                if(textField1.getText().equals(""))
               {
                   JOptionPane.showMessageDialog(null, "Provide Membership ID", "", JOptionPane.WARNING_MESSAGE);
               }
                else if(item==null)
               {
                   JOptionPane.showMessageDialog(null, "No CDs available to return!", "", JOptionPane.WARNING_MESSAGE);
               }
                             
                else {
                    
                     
                    
                    
                        String query = "INSERT INTO RETURNCD (ID,secretCode,name,mail,returnDate,CDID,genre,CDname,episode,director,hour,issueDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ";
                                PreparedStatement ps = c.con.prepareStatement(query);
           
                                ps.setString(1,textField1.getText());
                                ps.setString(2,textField2.getText());
                                ps.setString(3,textField3.getText());
                                ps.setString(4,textField4.getText());
                                ps.setString(5,textField5.getText());
                                ps.setString(6,(String)comboBox.getSelectedItem());
                                ps.setString(7,textField7.getText());
                                ps.setString(8,textField8.getText());
                                ps.setString(9,textField9.getText());
                                ps.setString(10,textField10.getText());
                                 ps.setString(11,textField11.getText());
                                  ps.setString(12,textField12.getText());
                                
                                
                                
                                 int count = ps.executeUpdate();
                                 
                         String query1 = "SELECT returnDate FROM ISSUE WHERE ID=?";
                        PreparedStatement ps1 = c.con.prepareStatement(query1);  
                        ps1.setString(1,textField1.getText());
                         ResultSet rs1 = ps1.executeQuery();
                                
                              if(rs1.next())
                              {
                                  String rdate = rs1.getString("returnDate");
                                   Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(rdate);  
                                    Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(textField5.getText()); 
                                    int result = date2.compareTo(date1);
                                    if(result<=0)
                                    {
                                           JOptionPane.showMessageDialog(null, "CD returned within due date!", "", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else
                                    {
                                         int answer=JOptionPane.showConfirmDialog(null,  "Late Return!!! Pay Fine!", "FYI", JOptionPane.OK_OPTION);
                                            System.out.println(answer);
                                            if(answer==0)
                                        {
                                             new Pay().setVisible(true);
                                         }
           
                                    }
                              }
                                 
                                 
                                 
                     String query4 = "SELECT IssueNo FROM ACCOUNT WHERE ID=?";
               
                                PreparedStatement ps4 = c.con.prepareStatement(query4);
                                ps4.setString(1,textField1.getText());
                                ResultSet resultSet1 = ps4.executeQuery();
                                
                               if(resultSet1.next()) 
                                {  
                                    String s = resultSet1.getString("IssueNo");
                
                
                                    int stock = Integer.parseInt(s);
                                     //System.out.println(stock);   
                                   stock--;
               
                                     String updatedStock = Integer.toString(stock);
                                      //System.out.println(updatedStock); 
                                      
                                      String query5 = "UPDATE ACCOUNT SET IssueNo=? WHERE ID=?";
                                  PreparedStatement ps5 = c.con.prepareStatement(query5);
                                      ps5.setString(1,updatedStock);
                                       ps5.setString(2,textField1.getText());
                                       ps5.executeUpdate();
                                }
                     
                                 String query2 = "SELECT stocks FROM CD WHERE CDID=?";
               
                                PreparedStatement ps2 = c.con.prepareStatement(query2);
                                ps2.setString(1,(String)comboBox.getSelectedItem());
                                ResultSet resultSet = ps2.executeQuery();
                                
                               if(resultSet.next()) 
                                {  
                                    String s = resultSet.getString("stocks");
                
                
                                    int stock = Integer.parseInt(s);
                                     System.out.println(stock);   
                                   stock++;
               
                                     String updatedStock = Integer.toString(stock);
                                      System.out.println(updatedStock); 
                                      
                                      String query3 = "UPDATE CD SET stocks=? WHERE CDID=?";
                                  PreparedStatement ps3 = c.con.prepareStatement(query3);
                                      ps3.setString(1,updatedStock);
                                       ps3.setString(2,(String)comboBox.getSelectedItem());
                                       ps3.executeUpdate();
                                }
                
                               String query11 = "DELETE FROM ISSUE WHERE ID=? AND CDID=?";
                        PreparedStatement ps11 = c.con.prepareStatement(query11);  
                        ps11.setString(1,textField1.getText());
                          ps11.setString(2,(String)comboBox.getSelectedItem());
          
           
                         
  
                        int count1 =ps11.executeUpdate();  
                       // System.out.println(count1+" records deleted");
                                    
                             
                                
                                

                                textField1.setText("");
                                textField2.setText("");
                                textField3.setText("");
                                textField4.setText("");
                                textField5.setText("");
                                comboBox.removeAllItems();
                                textField7.setText("");
                                textField8.setText("");
                                textField9.setText("");
                                textField10.setText("");
                                textField11.setText("");
                                textField12.setText("");
                               //textField13.setText("");

                }
                
            }
            else if(e.getSource()==backButton)
            {
                    this.setVisible(false);
                   // new MemberFirstScreen().setVisible(true);
            }
       
    }
   catch(Exception ae)
        {
          System.out.println(ae);   
        }
    }
    
     public static void main(String[] args) {
        new ReturnCD();
    }

   
   
}


