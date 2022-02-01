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


public class MemberFirstScreen extends JFrame implements ActionListener{
    JLabel label1,label2,label3;
    JButton button1,button2,button3;
    JTextField textField1,textField2;
    JPanel panel;
    JMenuItem item1,item2,item3,item4,additem,itemMembership,itemCourse,itemReturn,itemStart,itemSearch,itemAbout,itemLogout;
    JMenuBar menu;
    JMenu file1,file2,file3,file4,file5,file6;
    MemberFirstScreen()
    {
        
        menu = new JMenuBar();
         // menu.setLayout(null);
          menu.setBackground(Color.LIGHT_GRAY);
       
         file1 = new JMenu("Membership");
         file2 = new JMenu("Member");
         file3 = new JMenu("CD/s");
         //file4 = new JMenu("VLMS PLUS");
         //file5 = new JMenu("About Us");
         file6 = new JMenu("Logout");
        
     
       
        itemMembership = new JMenuItem("Available Memberships");
        itemMembership.addActionListener(this);
        file1.add(itemMembership);
        
        
        additem = new JMenuItem("Add Member");
        additem.addActionListener(this);
        
        item4 = new JMenuItem("View Member Details");
        itemSearch = new JMenuItem("View Member CD/s");
        //itemStart = new JMenuItem("Start Course");
        item4.addActionListener(this);
        itemSearch.addActionListener(this);
        //itemStart.addActionListener(this);
        file2.add(additem);
        file2.add(item4);
        file2.add(itemSearch);
       // file2.add(itemStart);
        
        itemCourse = new JMenuItem("Issue");
        itemCourse.addActionListener(this);
        
        file3.add(itemCourse);
        
        itemReturn = new JMenuItem("Return");
        itemReturn.addActionListener(this);
        
        file3.add(itemReturn);
        
       // itemAbout = new JMenuItem("About");
        //itemAbout.addActionListener(this);
        
      //  file5.add(itemAbout);
        
        itemLogout=new JMenuItem("Logout");
        itemLogout.addActionListener(this);
        
        file6.add(itemLogout);
        
        menu.add(file1);
        menu.add(file2);
        menu.add(file3);
       // menu.add(file4);
        //menu.add(file5);
        menu.add(file6);
        
        
        //Search videos.....VLMS Plus....Membership package
        
        ImageIcon icon1 = new ImageIcon("src/vlms/images/membership.jpg"); // load the image to a icon
        Image img1 = icon1.getImage(); // transform it 
        Image newimg1 = img1.getScaledInstance(200,200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon1 = new ImageIcon(newimg1);  // transform it back
        
        /*ImageIcon icon2 = new ImageIcon("src/videolibrarymanagementsystem/images/search.png"); // load the image to a icon
        Image img2 = icon2.getImage(); // transform it 
        Image newimg2 = img2.getScaledInstance(200,200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon2 = new ImageIcon(newimg2); */ // transform it back
        
        
        ImageIcon icon3 = new ImageIcon("src/vlms/images/search.png"); // load the image to a icon
        Image img3 = icon3.getImage(); // transform it 
        Image newimg3 = img3.getScaledInstance(200,200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon3 = new ImageIcon(newimg3);  
        
        label1 = new JLabel();
        label1.setText("Buy Membership");
        label1.setBounds(130,250,250,250);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));// set font of text

        label2 = new JLabel();
        label2.setText("Search CD");
        label2.setBounds(750,250,250,250);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 20));// set font of text
        
        /*label3 = new JLabel();
        label3.setText("VLMS PLUS");
        label3.setBounds(450,250,250,250);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 20));// set font of text
        */
        
        
        button1 = new JButton();
        button1.setBounds(100,150,200,200);
        button1.addActionListener(this);
        button1.setIcon(icon1);
        
       
        
        button2 = new JButton();
        button2.setBounds(700,150,200,200);
        button2.addActionListener(this);
        button2.setIcon(icon3);
        
       /* button3 = new JButton();
        button3.setBounds(400,150,200,200);
        button3.addActionListener(this);
        button3.setIcon(icon3);*/
        
         panel = new JPanel();
        panel.setBounds(0,0,1000,500);
        panel.setBackground(new Color(255,218,185));
        panel.setLayout(null);
        panel.add(button1);
        panel.add(button2); 
       // panel.add(button3);
        panel.add(label1);
        panel.add(label2);
        //panel.add(label3);
        
        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Home");
        //this.setSize(600,650);
        this.setSize(1000,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        System.out.println(screenSize.width);
        System.out.println(screenSize.height);
        
        this.setLocation(x, y);
        this.getContentPane().setBackground(Color.LIGHT_GRAY); 
        this.add(panel);
        this.setJMenuBar(menu);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       /* if(e.getSource()==item1)
        {
            JOptionPane.showMessageDialog(null, "Get full access to all Videos for 3 months\nFor more info click ok", "Gold", JOptionPane.INFORMATION_MESSAGE);
           // this.setVisible(false);
           // new Gold().setVisible(true);
        }
        else if (e.getSource()==item2)
        {
            JOptionPane.showMessageDialog(null, "Get full access to all Videos for 6 months\nFor more info click ok", "Diamond", JOptionPane.INFORMATION_MESSAGE);
        }
         else if (e.getSource()==item3)
        {
            JOptionPane.showMessageDialog(null, "Get full access to all Videos for 12 months\nFor more info click ok\nGet personal mentor 24*7\n*AdditionL VLMS PLUS subscription for 3 months", "Platinum", JOptionPane.INFORMATION_MESSAGE);
        }*/
          
        if(e.getSource()==itemMembership)
         {
             
             new MembershipAvailable();
         }
         else if(e.getSource()==additem)
         {
             this.setVisible(false);
             new AddMember().setVisible(true);
         }
        else if(e.getSource()==item4)
         {
             this.setVisible(false);
             new ViewMemberDetails().setVisible(true);
         }
          else if(e.getSource()==itemCourse)
         {
             //this.setVisible(false);
             new IssueCD();
         }
           else if(e.getSource()==itemReturn)
         {
             //this.setVisible(false);
             new ReturnCD();
         }
         else if(e.getSource()==itemSearch)
         {
             //this.setVisible(false);
             new ViewMemberCD();
         }
         /*else if(e.getSource()==itemStart)
         {
             //this.setVisible(false);
             new StartCourse().setVisible(true);
         }*/
        /* else if(e.getSource()==itemAbout)
         {
             //this.setVisible(false);
             new About();
         }*/
         else if(e.getSource()==itemLogout)
         {
             this.setVisible(false);
             new Login().setVisible(true);
         }
         else if(e.getSource()==button1)
        {
            //System.out.println("Button 1");
            this.setVisible(false);
            new BuyMembership().setVisible(true);
            
        }
        else if(e.getSource()==button2)
        {
            //System.out.println("Button 2");
            //this.setVisible(false);
            //new Login().setVisible(true);
            new SearchCD();
        }
         else if(e.getSource()==button3)
        {
            //System.out.println("Button 2");
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        new MemberFirstScreen();
    }
}

