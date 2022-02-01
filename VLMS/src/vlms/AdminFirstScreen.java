/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class AdminFirstScreen extends JFrame implements ActionListener{
    JLabel label1,label2,label3;
    JButton button1,button2,button3;
    JTextField textField1,textField2;
    JPanel panel;
    JMenuItem item1,item2,item3;
    JMenuBar menu;
    JMenu file1,file2,file3,file4;
    
     JFrame frame1;//creating object of first JFrame
    JLabel nameLabel;//creating object of JLabel
    JTextField nameTextField;//creating object of JTextfield
    JButton fetchButton;//creating object of JButton
    JButton resetButton;//creating object of JButton
    
    JFrame frame2;//creating object of second JFrame
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    
    JScrollPane sp;
    AdminFirstScreen()
    {
     
        menu = new JMenuBar();
        menu.setBackground(Color.LIGHT_GRAY);
       
        file1 = new JMenu("CD Details");
        item1 = new JMenuItem("Update/Delete CD detail");
        item1.addActionListener(this);
        file1.add(item1);
        menu.add(file1);
        
        
        file2 = new JMenu("Member Section");
        item2 = new JMenuItem("Member Page");
        item2.addActionListener(this);
        file2.add(item2);
        menu.add(file2);
        
        
        
        
        ImageIcon icon1 = new ImageIcon("src/vlms/images/Addvideo.jpg"); // load the image to a icon
        Image img1 = icon1.getImage(); // transform it 
        Image newimg1 = img1.getScaledInstance(200,200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon1 = new ImageIcon(newimg1);  // transform it back
        
        ImageIcon icon2 = new ImageIcon("src/vlms/images/search.png"); // load the image to a icon
        Image img2 = icon2.getImage(); // transform it 
        Image newimg2 = img2.getScaledInstance(200,200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon2 = new ImageIcon(newimg2);  // transform it back
        
        
        ImageIcon icon3 = new ImageIcon("src/vlms/images/Statistics.png"); // load the image to a icon
        Image img3 = icon3.getImage(); // transform it 
        Image newimg3 = img3.getScaledInstance(200,200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon3 = new ImageIcon(newimg3);  
        
        label1 = new JLabel();
        label1.setText("Add CD/s");
        label1.setBounds(130,250,250,250);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));// set font of text

        label2 = new JLabel();
        label2.setText("Search CD/s");
        label2.setBounds(450,250,250,250);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 20));// set font of text
        
        label3 = new JLabel();
        label3.setText("View Statistics");
        label3.setBounds(750,250,250,250);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 20));// set font of text
        
        
        
        button1 = new JButton();
        button1.setBounds(100,150,200,200);
        button1.addActionListener(this);
        button1.setIcon(icon1);
        
       
        
        button2 = new JButton();
        button2.setBounds(400,150,200,200);
        button2.addActionListener(this);
        button2.setIcon(icon2);
        
        button3 = new JButton();
        button3.setBounds(700,150,200,200);
        button3.addActionListener(this);
        button3.setIcon(icon3);
        
         panel = new JPanel();
        panel.setBounds(0,0,1000,500);
        panel.setBackground(new Color(255,218,185));
        panel.setLayout(null);
        panel.add(button1);
        panel.add(button2); 
        panel.add(button3);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        
        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Admin");
        //this.setSize(600,650);
        this.setSize(1000,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.getContentPane().setBackground(Color.LIGHT_GRAY); 
        this.add(panel);
        this.setJMenuBar(menu);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          
       if(e.getSource()==item1)
       {
            this.setVisible(false);
           new AdminViewCD().setVisible(true);
       }
       else if(e.getSource()==item2)
       {
           
           new MemberFirstScreen().setVisible(true);
       }
       else if(e.getSource()==button1)
        {
            //System.out.println("Button 1");
            //setVisible(false);
            new AddCD().setVisible(true);
            
        }
        else if(e.getSource()==button2)
        {
            //System.out.println("Button 2");
            //setVisible(false);
            new SearchCD();
        }
         else if(e.getSource()==button3)
        {
       frame1 = new JFrame();
              
                     defaultTableModel = new DefaultTableModel();
                  table = new JTable(defaultTableModel);
                  table.setBounds(30, 40, 200, 300);
                  table.setEnabled(false);
                  
   // defaultTableModel.addColumn("Username");
        defaultTableModel.addColumn("Name");
        defaultTableModel.addColumn("Email ID");
        //defaultTableModel.addColumn("Phone no.");
        defaultTableModel.addColumn("Enroll Date");
        defaultTableModel.addColumn("Price");
        defaultTableModel.addColumn("Total Earning(last cell)");
                   // frame1.setVisible(true);
                     sp = new JScrollPane(table);
                  
                  
                  
               
		frame1.setTitle("Database Results");
		frame1.setSize(800, 300);
		frame1.setVisible(true);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (screenSize.width - this.getWidth()) / 2;
                int y = (screenSize.height - this.getHeight()) / 2;
                frame1.setLocation(x, y);
          frame1.add(sp);
                
                
                
                      try {
        	Conn c = new Conn();
                
                
                
                 String query = "select * from STATISTICS";
               
                    PreparedStatement ps = c.con.prepareStatement(query);
                    
                    ResultSet resultSet = ps.executeQuery();
           
       
        
        
        
            int sum =0;
            while (resultSet.next()) {
            	
            	//Retrieving details from the database and storing it in the String variables
                 
                String name = resultSet.getString("name");
                String mail = resultSet.getString("mail");
                String date = resultSet.getString("issueDate");
               
                String price = resultSet.getString("price");
                
                
                int cost = Integer.parseInt(price);
                
               
                
                sum = sum+cost;
                
                String TotalPrice = Integer.toString(sum);
                
                     defaultTableModel.addRow(new Object[]{name, mail,date,price,TotalPrice});//Adding row in Table//Adding row in Table
                   frame1.setVisible(true);
            }

                               


        } catch (Exception ae) {
            System.out.println(ae);
        }
                

    

        }
      

}
        
    
    public static void main(String[] args)
    {
        new AdminFirstScreen();
    }
}


