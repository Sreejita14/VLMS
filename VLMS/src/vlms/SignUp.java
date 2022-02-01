
package vlms;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.sql.*;

public class SignUp extends JFrame implements ActionListener{
   
    JLabel label0,label1,label2,label3,label4,label5,label6,label7,textField7;
    JTextField textField,textField1,textField2,textField3,textField4,textField5,textField6;
    JComboBox comboBox ;
    JPanel Panel;
    JButton b1,b2,b3;
    public SignUp()
    {
        label0 = new JLabel();
        label0.setText("Username");
        label0.setBounds(10,30,100,50);
        label0.setForeground(Color.black);// set font color of text
        label0.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        label1 = new JLabel();
        label1.setText("Name");
        label1.setBounds(10,60,100,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
       // label1.setBackground(Color.red);
        //label1.setOpaque(true);
        
        label2 = new JLabel();
        label2.setText("E-mail ID");
        label2.setBounds(10,90,100,50);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label3 = new JLabel();
        label3.setText("Address");
        label3.setBounds(10,120,100,50);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label4 = new JLabel();
        label4.setText("Phone no.");
        label4.setBounds(10,150,100,50);
        label4.setForeground(Color.black);// set font color of text
        label4.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label5 = new JLabel();
        label5.setText("Password");
        label5.setBounds(10,180,100,50);
        label5.setForeground(Color.black);// set font color of text
        label5.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label6 = new JLabel();
        label6.setText("Security Question");
        label6.setBounds(10,210,130,50);
        label6.setForeground(Color.black);// set font color of text
        label6.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
        label7 = new JLabel();
        label7.setText("Answer");
        label7.setBounds(10,240,100,50);
        label7.setForeground(Color.black);// set font color of text
        label7.setFont(new Font("Times New Roman", Font.BOLD, 15));// set font of text
        
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
        
        
        textField5 = new JPasswordField();
        textField5.setBounds(135,195,250,20);
        textField5.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField5.setForeground(Color.black);
        textField5.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField2.setCaretColor(Color.black);
        
        
        
        String[] options = {"Your nick name?","Your favourite color?","Your pet name?"};
        comboBox = new JComboBox(options);
        comboBox.setBounds(135,225,250,20);
        
        textField6 = new JTextField();
        textField6.setBounds(135,255,250,20);
        textField6.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField6.setForeground(Color.black);
        textField6.setBackground(Color.white);
        //textField.setBorder(BorderFactory.createEmptyBorder());
        textField2.setCaretColor(Color.black);
        
        
        textField7 = new JLabel();
        textField7.setBounds(135,285,250,20);
        textField7.setFont(new Font("Times New Roman",Font.PLAIN,15));
        textField7.setForeground(Color.black);
        //textField7.setEditable(false);
        
        
        b1 = new JButton("SignUp");
        b1.addActionListener(this);
        b1.setFocusable(false);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);// b1.setBackground(new Color(205,255,130));
        b1.setBounds(120,325,90,30);
        
        
        b2=new JButton("Back");
        b2.addActionListener(this);
        b2.setFocusable(false);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.blue);//new Color(205,246,246)
        b2.setBounds(230,325,90,30);
        
        b3=new JButton("Generate ID");
        b3.addActionListener(this);
        b3.setFocusable(false);
        b3.setForeground(Color.white);
        b3.setBackground(Color.BLUE);
        b3.setBounds(10,285,100,30);
        
        
        
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
        Panel.add(textField);
        Panel.add(textField1);
        Panel.add(textField2);
        Panel.add(textField3);
        Panel.add(textField4);
        Panel.add(textField5);
        Panel.add(comboBox);
        Panel.add(textField6);
        Panel.add(textField7);
        Panel.add(b1);
        Panel.add(b2);
        Panel.add(b3);
        
        
        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SignUp");
        this.setSize(450,450);
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
        
        /*if(e.getSource()==b1)
            {
                setVisible(false);
                new Login().setVisible(true);
         
            }*/
    try{
        Conn c = new Conn();
        if(e.getSource()==b1)
       {
           
           
           if(textField.getText().equals("")||textField1.getText().equals("")||textField2.getText().equals("")||textField3.getText().equals("")||textField4.getText().equals("")||textField5.getText().equals("")||textField6.getText().equals("")||textField7.getText().equals(""))
           {
                JOptionPane.showMessageDialog(null, "Provide all Details", "", JOptionPane.INFORMATION_MESSAGE);
           }
           
           else
           {
           System.out.println("Clicked");
           //setVisible(false);
           
           String query = "INSERT INTO ACCOUNT(ID,username,name,mail,address,number,password,security,answer) VALUES (?,?,?,?,?,?,?,?,?)";
           PreparedStatement ps = c.con.prepareStatement(query);
           
          /*String username =  textField.getText();
          String name =  textField1.getText();
          String mail =  textField2.getText();
          String address = textField3.getText();
          String number = textField4.getText();
          String password = textField5.getText();
          String security = (String) comboBox.getSelectedItem();
          String answer = textField6.getText();
          System.out.println(username);
         
       
         
       
        ps.setString(1,username);
        ps.setString(2,name);
        ps.setString(3,mail);
        ps.setString(4,address);
        ps.setString(5,number);
        ps.setString(6,password);
        ps.setString(7,security);
        ps.setString(8,answer);*/
        
        ps.setString(1,textField7.getText());
        ps.setString(2,textField.getText());
        ps.setString(3,textField1.getText());
        ps.setString(4,textField2.getText());
        ps.setString(5,textField3.getText());
        ps.setString(6,textField4.getText());
        ps.setString(7,textField5.getText());
        ps.setString(8,(String) comboBox.getSelectedItem());
        ps.setString(9,textField6.getText());
          
          
        int count = ps.executeUpdate();
        //System.out.println(count);
        if(count>0){
            //JOptionPane.showMessageDialog(null, "Account Created Successfully ");
            JOptionPane.showMessageDialog(null, "Account Created Successfully", "Account Created", JOptionPane.INFORMATION_MESSAGE);
        }
       textField.setText("");      
       textField1.setText("");
       textField2.setText("");
       textField3.setText("");
       textField4.setText("");
       textField5.setText("");
       textField6.setText("");
       textField7.setText("");
       }
       } 
        
           else if(e.getSource()==b2)
            {
                setVisible(false);
                new Login().setVisible(true);
         
            }
            
            else if(e.getSource()==b3)
            {
                //setVisible(false);
                //new Login().setVisible(true);
               // String id = (String) new MembershipID();
                final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
                SecureRandom random = new SecureRandom();
                StringBuilder sb = new StringBuilder();
 
                // each iteration of the loop randomly chooses a character from the given
                // ASCII range and appends it to the `StringBuilder` instance
 
                for (int i = 0; i < 10; i++)
            {
                int randomIndex = random.nextInt(chars.length());
                    sb.append(chars.charAt(randomIndex));
            }
 
        
                //System.out.println(sb.toString());
                textField7.setText(sb.toString());
                b3.setEnabled(false);
                //textField7.setEditable(false);
                JOptionPane.showMessageDialog(null, "This is a ONE TIME ID!", "Remember ID", JOptionPane.WARNING_MESSAGE);
         
            }
       
    }
   catch(Exception ae)
        {
          System.out.println(e);   
        }
    }
    
     public static void main(String[] args) {
       new SignUp();
    }

   
   
}

