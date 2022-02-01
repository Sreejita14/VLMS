/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author USER
 */
public class MembershipAvailable {
    MembershipAvailable()
    {
             JFrame f= new JFrame();  
        String s = "\nGold Membership:\n"
                + "1. Get unlimited access to all courses for 3 months.\n"
                + "2. Get Shareable Course Certificates that can be put on your resume or LinkedIn or at any site.\n"
                + "3. Self-Paced Learning Option.\n" 
                + "4. Practice Assignments.\n" 
                + "5. Course articles\n"
                +"\nDiamond Membership:\n"
                + "1. Get unlimited access to all courses for 6 months.\n"
                + "2. Get Shareable Course Certificates that can be put on your resume or LinkedIn or at any site.\n"
                + "3. Self-Paced Learning Option.\n" 
                + "4. Practice Assignments.\n" 
                + "5. Course articles\n"
                + "6. 24x7 mentor support\n"
                + "7. Live aptitute classes on weekends*\n"
                +"\nPlatinum Membership:\n"
                + "1. Get unlimited access to all courses for 12 months.\n"
                + "2. Get Shareable Course Certificates that can be put on your resume or LinkedIn or at any site.\n"
                + "3. Self-Paced Learning Option.\n" 
                + "4. Practice Assignments.\n" 
                + "5. Course articles\n"
                + "6. 24x7 mentor support\n"
                + "7. Live aptitute classes on weekends*\n"
                + "8. Placement preparation by top mentors*\n"
                + "9. Intership opportunity based on performance**\n"
                +"\n"+"\n"+"\n"+"\n"+"\n"+"\n"
                +"\n*To be notified by the mentor"
                +"\n**Based on course completion and test scores "
                +"\n"+"\n"+"\n"+"\n"+"\n"+"\n"
                
                ;
                
       
        
     /*
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1500, 1000);
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);*/
        
      
        
        
        JTextArea area=new JTextArea(s);  
        area.setBounds(0,0, 1366,768); 
        
        area.setEditable ( false );
        area.setBackground(Color.black);
        area.setForeground(Color.WHITE);
        area.setFont(new Font("Times New Roman",Font.PLAIN,20));
        
         JScrollPane  sp= new JScrollPane(area);
         //sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
         sp.setSize(1366,768 );
  
       
      
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        f.setTitle("About");
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setSize(800, 760 );
        //f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
       
       f.add(sp);
       
        
     }  

    
public static void main(String args[])  
    {  
   new MembershipAvailable();  
    }
}

