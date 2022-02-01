/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener{
    JButton button1,button2,button3;
    JLabel label1,label2,label3,label4;
    JPanel panel;
    Home()
    {
        ImageIcon icon1 = new ImageIcon("src/vlms/images/member.png"); // load the image to a icon
        Image img1 = icon1.getImage(); // transform it 
        Image newimg1 = img1.getScaledInstance(300,300,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon1 = new ImageIcon(newimg1);  // transform it back
      /*  
        ImageIcon icon2 = new ImageIcon("src/videolibrarymanagementsystem/images/Admin.png"); // load the image to a icon
        Image img2 = icon2.getImage(); // transform it 
        Image newimg2 = img2.getScaledInstance(200,200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon2 = new ImageIcon(newimg2);  // transform it back
        */
        
        ImageIcon icon3 = new ImageIcon("src/vlms/images/member.png"); // load the image to a icon
        Image img3 = icon3.getImage(); // transform it 
        Image newimg3 = img3.getScaledInstance(300,300,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon3 = new ImageIcon(newimg3);  
        
        
        label1 = new JLabel();
        label1.setText("Member");
        label1.setBounds(350,450,250,250);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 35));// set font of text

        label2 = new JLabel();
        label2.setText("Created by Sreejita Banerjee");
        label2.setBounds(580,595,900,150);
        label2.setForeground(Color.black);// set font color of text
        label2.setFont(new Font("Times New Roman", Font.BOLD, 20));// set font of text
        
        label3 = new JLabel();
        label3.setText("Video Library Management System 1.0");
        label3.setBounds(250,5,900,150);
        //label3.setBackground(Color.red);
        //label3.setOpaque(true);
        label3.setForeground(Color.black);// set font color of text
        label3.setFont(new Font("Times New Roman", Font.BOLD, 50));// set font of text
        
        
        label4 = new JLabel();
        label4.setText("Guest");
        label4.setBounds(970,450,250,250);
        label4.setForeground(Color.black);// set font color of text
        label4.setFont(new Font("Times New Roman", Font.BOLD, 35));// set font of text
        
        
        
        button1 = new JButton();
        button1.setBounds(250,250,300,300);
        button1.addActionListener(this);
        button1.setIcon(icon1);
        
       
       /* 
        button2 = new JButton();
        button2.setBounds(400,150,200,200);
        button2.addActionListener(this);
        button2.setIcon(icon2);
      */  
        button3 = new JButton();
        button3.setBounds(850,250,300,300);
        button3.addActionListener(this);
        button3.setIcon(icon3);
        
        panel = new JPanel();
        //panel.setBounds(0,0,1000,500);
        panel.setBounds(0,0,1366,768);
        panel.setBackground(new Color(255,252,135));
        panel.setLayout(null);
        panel.add(button1);
       // panel.add(button2); 
        panel.add(button3);
        panel.add(label1);
       panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("VLMS");
        //this.setSize(1000,500);
        this.setSize(1366,768);
        this.setLayout(null);
        this.setVisible(true);
        //this.setResizable(false);
        /*
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        //this.getContentPane().setBackground(new Color(255,252,135)); */
        this.add(panel);
       
       
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
        {
            //System.out.println("Button 1");
           // setVisible(false);
            new Login().setVisible(true);
            
        }
       /*  if(e.getSource()==button2)
        {
            //System.out.println("Button 2");
            setVisible(false);
            new Login().setVisible(true);
            //new MemberFirstScreen().setVisible(true);
        }*/
          if(e.getSource()==button3)
        {
            
           
             
            int answer=JOptionPane.showConfirmDialog(null,  "This is Read-Only mode\nTo get access to all CDs please Sign-up to become a member of VLMS\nBecome a mmember?", "FYI", JOptionPane.YES_NO_OPTION);
            System.out.println(answer);
            if(answer==0)
            {
                new SignUp().setVisible(true);
            }
            else if(answer==1)
            {
                
                 new SearchCD();
            }
            else
            {
                this.setVisible(true);
            }
           
        }
         
    }
    public static void main(String[] args)
    {
        new Home();
    }
}

