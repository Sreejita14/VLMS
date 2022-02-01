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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BuyMembership extends JFrame implements ActionListener{
   JLabel label0,label1,label11 ,label2,label21,label3,label31,label4,label41,label5,labelDate,textDate,labelExpire,textExpire,label6,label61, label71;
    JTextField textField,textField1,textField2,textField3,textField4,textField5;
    JComboBox comboBox ;
    JPanel Panel;
    JButton CodeButton,SearchButton,PriceButton, BuyButton,BackButton;
    BuyMembership()
    {
      label0 = new JLabel();
        label0.setText("Membership ID");
        label0.setBounds(10,30,130,50);
        label0.setForeground(Color.black);// set font color of text
        label0.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        textField = new JTextField();
        textField.setBounds(135,45,250,20);
        textField.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField.setForeground(Color.black);
        textField.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField.setCaretColor(Color.black);
        
        label1 = new JLabel();
        label1.setText("Userame");
        label1.setBounds(10,60,130,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        
        label11 = new JLabel();
        label11 .setBounds(135,75,250,20);
        label11 .setFont(new Font("Times New Roman",Font.PLAIN,20));
        label11 .setForeground(Color.black);
        label11 .setBackground(Color.white);
       
        
        label2 = new JLabel();
        label2.setText("Name");
        label2.setBounds(10,90,130,50);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label21 = new JLabel();
        label21.setBounds(135,105,250,20);
        label21.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label21.setForeground(Color.black);
        label21.setBackground(Color.white);
        
        
        
        label3 = new JLabel();
        label3.setText("Email ID");
        label3.setBounds(10,120,130,50);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label31 = new JLabel();
        label31.setBounds(135,135,250,20);
        label31.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label31.setForeground(Color.black);
        label31.setBackground(Color.white);
        
        
        
        label4 = new JLabel();
        label4.setText("Phone Number");
        label4.setBounds(10,150,130,50);
        label4.setForeground(Color.black);// set font color of text
        label4.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label41 = new JLabel();
        label41.setBounds(135,170,250,20);
        label41.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label41.setForeground(Color.black);
        label41.setBackground(Color.white);
        
        
        
        
        label5 = new JLabel();
        label5.setText("Membership");
        label5.setBounds(10,180,130,50);
        label5.setForeground(Color.black);// set font color of text
        label5.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        String[] options = {"Gold","Diamond","Platinum"};
        comboBox = new JComboBox(options);
        comboBox.setBounds(135,200,250,20);//(135,205,250,20);
        comboBox.addActionListener(this);
        //(10,190,130,50);
        label6 = new JLabel();
        label6.setText("Total Price(Rs)");
        label6.setBounds(10,220,130,50);
        label6.setForeground(Color.black);// set font color of text
        label6.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
         label61 = new JLabel();
         label61.setBounds(135,235,250,20);
         label61.setFont(new Font("Times New Roman",Font.PLAIN,20));
         label61.setForeground(Color.black);
         label61.setBackground(Color.white);
        
       
        CodeButton=new JButton("Generate Secret Code");
        CodeButton.addActionListener(this);
        CodeButton.setFocusable(false);
        CodeButton.setForeground(Color.white);
        CodeButton.setBackground(Color.black);
        CodeButton.setBounds(10,270,170,30);
        
         label71 = new JLabel();
         label71.setBounds(200,275,250,20);
         label71.setFont(new Font("Times New Roman",Font.PLAIN,20));
         label71.setForeground(Color.black);
         label71.setBackground(Color.white);
         //label71.setOpaque(true);
        
        labelDate = new JLabel();
        labelDate.setText("Enroll Date");
        labelDate.setBounds(10,300,130,50);
        labelDate.setForeground(Color.black);// set font color of text
        labelDate.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
         textDate = new JLabel();
         textDate.setBounds(200,310,250,20);
         textDate.setFont(new Font("Times New Roman",Font.PLAIN,20));
         textDate.setForeground(Color.black);
         textDate.setBackground(Color.white);
         
         labelExpire = new JLabel();
        labelExpire.setText("Expiry Date");
        labelExpire.setBounds(10,330,130,50);
        labelExpire.setForeground(Color.black);// set font color of text
        labelExpire.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
         textExpire = new JLabel();
         textExpire .setBounds(200,340,250,20);
         textExpire .setFont(new Font("Times New Roman",Font.PLAIN,20));
         textExpire .setForeground(Color.black);
         textExpire .setBackground(Color.white);
         
         
        
        SearchButton = new JButton("Search");
        SearchButton.addActionListener(this);
        SearchButton.setFocusable(false);
        SearchButton.setForeground(Color.white);
        SearchButton.setBackground(Color.blue);
        SearchButton.setBounds(400,40,100,30);
        
       /*
        PriceButton=new JButton("Check Price");
        PriceButton.addActionListener(this);
        PriceButton.setFocusable(false);
        PriceButton.setForeground(Color.white);
        PriceButton.setBackground(Color.blue);
        PriceButton.setBounds(100,400,150,30);
        */
         BuyButton=new JButton("Buy");
        BuyButton.addActionListener(this);
         BuyButton.setFocusable(false);
         BuyButton.setForeground(Color.white);
         BuyButton.setBackground(Color.blue);
         BuyButton.setBounds(300,400,100,30);
        
        
        BackButton=new JButton("Back");
        BackButton.addActionListener(this);
        BackButton.setFocusable(false);
        BackButton.setForeground(Color.white);
        BackButton.setBackground(Color.blue);
        BackButton.setBounds(450,400,100,30);
        
       
        
        
        Panel  = new JPanel();
        Panel.setBackground(new Color(220,220,220));
        Panel.setBounds(0, 0, 600,600);
        Panel.setLayout(null);
        Panel.add(label0);
        Panel.add(label1);
        Panel.add(label2);
        Panel.add(label3);
        Panel.add(label4);
        Panel.add(label6);
        Panel.add(label5);
        Panel.add(textField);
        Panel.add(label11);
        Panel.add(label21);
        Panel.add(label31);
        Panel.add(label41);
        Panel.add( label61);
        Panel.add(CodeButton);
        Panel.add(label71);
        Panel.add(labelDate);
        Panel.add(textDate);
        Panel.add(labelExpire);
        Panel.add(textExpire);
        Panel.add(SearchButton);
        Panel.add(comboBox);
        Panel.add(BackButton);
        //Panel.add(PriceButton);
        Panel.add( BuyButton);
        
        
       
                
               // label61.setText(Integer.toString(cost));
         
       // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Buy Membership");
        this.setSize(600,600);
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
        if(e.getSource()==CodeButton)
        {
             final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
                SecureRandom random = new SecureRandom();
                StringBuilder sb = new StringBuilder();
 
                // each iteration of the loop randomly chooses a character from the given
                // ASCII range and appends it to the `StringBuilder` instance
 
                for (int i = 0; i < 5; i++)
            {
                int randomIndex = random.nextInt(chars.length());
                    sb.append(chars.charAt(randomIndex));
            }
 
        
                //System.out.println(sb.toString());
                label71.setText(sb.toString());
                CodeButton.setEnabled(false);
                //JOptionPane.showMessageDialog(null, "Remember the code to enroll in courses!", "Remember ID", JOptionPane.WARNING_MESSAGE);
        }
        else if(e.getSource()==SearchButton)
       {
           
                                 
                                      
                                     Date date = new Date();
                                     
                                     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                                    String strDate= formatter.format(date);  
                                     //System.out.println(strDate);
                                     textDate.setText(strDate);
                                     
                                 /*    Calendar cal = Calendar.getInstance(); 
                                     cal.setTime(date); 
           
                                    cal.add(Calendar.MONTH, 3);
                                     Date newDate = cal.getTime();
                                      SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
                                    String strDate1= formatter1.format(newDate); 
                                     System.out.println(strDate1); 
                                     textExpire.setText(strDate1);
                                    */ 
                                     
                                
                                     
                                     
                                     
           
          //System.out.println( textField.getText());
          String query = "SELECT * FROM ACCOUNT WHERE ID =?";
           PreparedStatement ps = c.con.prepareStatement(query);
           
           ps.setString(1,textField.getText());
           ResultSet rs = ps.executeQuery();
           if(rs.next())
           {
               
               label11.setText(rs.getString("username"));
               label21.setText(rs.getString("name"));
               label31.setText(rs.getString("mail"));
               label41.setText(rs.getString("number"));
           }
           else
                JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
       }
    
        
         /*  else if(e.getSource()==PriceButton)
            {
                String price = (String)comboBox.getSelectedItem();
                int cost =0;
                if(price.equals("Gold"))
                {
                    cost+=3000;
                    
                    
                                    Date date = new Date();
                                     Calendar cal = Calendar.getInstance(); 
                                     cal.setTime(date); 
           
                                    cal.add(Calendar.MONTH, 3);
                                     Date newDate = cal.getTime();
                                      SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
                                    String strDate1= formatter1.format(newDate); 
                                     //System.out.println(strDate1); 
                                     textExpire.setText(strDate1);
                }
                else if(price.equals("Diamond"))
                {
                    cost+=6000;
                    
                    
                    Date date = new Date();
                                     Calendar cal = Calendar.getInstance(); 
                                     cal.setTime(date); 
           
                                    cal.add(Calendar.MONTH, 6);
                                     Date newDate = cal.getTime();
                                      SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
                                    String strDate1= formatter1.format(newDate); 
                                     //System.out.println(strDate1); 
                                     textExpire.setText(strDate1);
                    
                    
                }
                else if(price.equals("Platinum"))
                {
                    cost+=10000;
                    
                    
                    Date date = new Date();
                                     Calendar cal = Calendar.getInstance(); 
                                     cal.setTime(date); 
           
                                    cal.add(Calendar.MONTH, 12);
                                     Date newDate = cal.getTime();
                                      SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
                                    String strDate1= formatter1.format(newDate); 
                                     //System.out.println(strDate1); 
                                     textExpire.setText(strDate1);
                    
                }
                
                label61.setText(Integer.toString(cost));
         
                
             
                
                
                
                
                
                
            }
        */
         
                
                if(e.getSource()==comboBox)
                {
                    
                
                    
                     String price = (String)comboBox.getSelectedItem();
                     System.out.println(comboBox.getSelectedItem());
                int cost =0;
                
                if(price.equals("Gold"))
                {
                    cost+=3000;
                    
                    
                                    Date date = new Date();
                                     Calendar cal = Calendar.getInstance(); 
                                     cal.setTime(date); 
           
                                    cal.add(Calendar.MONTH, 3);
                                     Date newDate = cal.getTime();
                                      SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
                                    String strDate1= formatter1.format(newDate); 
                                     //System.out.println(strDate1); 
                                     textExpire.setText(strDate1);
                                     label61.setText(Integer.toString(cost));
                }
                else if(price.equals("Diamond"))
                {
                    cost+=6000;
                    
                    
                    Date date = new Date();
                                     Calendar cal = Calendar.getInstance(); 
                                     cal.setTime(date); 
           
                                    cal.add(Calendar.MONTH, 6);
                                     Date newDate = cal.getTime();
                                      SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
                                    String strDate1= formatter1.format(newDate); 
                                     //System.out.println(strDate1); 
                                     textExpire.setText(strDate1);
                                     label61.setText(Integer.toString(cost));
                    
                }
                else if(price.equals("Platinum"))
                {
                    cost+=10000;
                    
                    
                    Date date = new Date();
                                     Calendar cal = Calendar.getInstance(); 
                                     cal.setTime(date); 
           
                                    cal.add(Calendar.MONTH, 12);
                                     Date newDate = cal.getTime();
                                      SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
                                    String strDate1= formatter1.format(newDate); 
                                     //System.out.println(strDate1); 
                                     textExpire.setText(strDate1);
                                     label61.setText(Integer.toString(cost));
                    
                }
                
                
                
                }
                
                
                
                
                
                
            
           else if(e.getSource()==BuyButton)
           {
               
               if(textField.getText().equals("")||label11.getText().equals(""))
               {
                    JOptionPane.showMessageDialog(null, "Provide Correct Membership ID", "Membership", JOptionPane.WARNING_MESSAGE);
               }
               else if(label61.getText().equals(""))
               {
                    JOptionPane.showMessageDialog(null, "Check Price!!!", "Membership", JOptionPane.WARNING_MESSAGE);
               }
               else if(label71.getText().equals(""))
               {
                    JOptionPane.showMessageDialog(null, "Generate Code!!!", "Membership", JOptionPane.WARNING_MESSAGE);
               }
               else 
               {
                   
                 
                   
                   new Pay().setVisible(true);
                   String query = "INSERT INTO STATISTICS(ID,name,mail,issueDate,price) VALUES (?,?,?,?,?)";
               
                    PreparedStatement ps = c.con.prepareStatement(query);
           
       
        
        ps.setString(1,textField.getText());
        ps.setString(2,label21.getText());
        ps.setString(3,label31.getText());
        ps.setString(4,textDate.getText());
        ps.setString(5,label61.getText());
        
      
          
          
        int count = ps.executeUpdate();
         System.out.println(count);
        
        
        
        String query2 = "UPDATE ACCOUNT SET membership=? , memEnrollDate=?,memExpireDate=?,secretCode=? WHERE ID=? ";
               
                    PreparedStatement ps2 = c.con.prepareStatement(query2);
                    ps2.setString(1,(String)comboBox.getSelectedItem());
                    ps2.setString(2,textDate.getText());
                    ps2.setString(3,textExpire.getText());
                    ps2.setString(4,label71.getText());
                     ps2.setString(5,textField.getText());
                   int count2= ps2.executeUpdate();
        
        System.out.println(count2);
       /* if(count>0){
            //JOptionPane.showMessageDialog(null, "Account Created Successfully ");
            JOptionPane.showMessageDialog(null, "Added to cart", "Membership", JOptionPane.INFORMATION_MESSAGE);
        }*/
               }
              


           }
            else if(e.getSource()==BackButton)
            {
                setVisible(false);
               new MemberFirstScreen().setVisible(true);
         
            }
        
       
    }
   catch(Exception ae)
        {
          System.out.println(e);   
        }
    }
    
     public static void main(String[] args) {
       new BuyMembership().setVisible(true);
    }

   
   
}

