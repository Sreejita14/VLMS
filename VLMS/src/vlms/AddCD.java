/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;



import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddCD extends JFrame implements ActionListener{

     JPanel panel;
     JTextField t1,t2,t3,t4,t5,t6,t7;
     JButton button1,button2;
     JLabel l1,l2,l3,l4,l5,l6,l7;
        
   

   

    public AddCD() {
        
        
        panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);

	l1 = new JLabel("CD ID");
	l1.setFont(new Font("Times New Roman",Font.PLAIN,15));
        l1.setForeground(Color.black);
	l1.setBounds(40,50, 90, 30);
	panel.add(l1);

	l2 = new JLabel("CD Genre");
        l2.setFont(new Font("Times New Roman",Font.PLAIN,15));
        l1.setForeground(Color.black);
	l2.setBounds(40, 80, 90, 30);
	panel.add(l2);

	l3 = new JLabel("CD Name");
	l3.setFont(new Font("Times New Roman",Font.PLAIN,15));
        l3.setForeground(Color.black);
	l3.setBounds(40, 110, 90, 30);
	panel.add(l3);

	l4 = new JLabel("Episode/s");
	l4.setFont(new Font("Times New Roman",Font.PLAIN,15));
        l4.setForeground(Color.black);
	l4.setBounds(40, 140, 90, 30);
	panel.add(l4);

	l5 = new JLabel("Director");
	l5.setFont(new Font("Times New Roman",Font.PLAIN,15));
        l5.setForeground(Color.black);
	l5.setBounds(40, 170, 90, 30);
	panel.add(l5);

	l6 = new JLabel("Hour/s");
	l6.setFont(new Font("Times New Roman",Font.PLAIN,15));
        l6.setForeground(Color.black);
	l6.setBounds(40, 200, 90, 30);
	panel.add(l6);

	l7 = new JLabel("Stocks");
	l7.setFont(new Font("Times New Roman",Font.PLAIN,15));
        l7.setForeground(Color.black);
	l7.setBounds(40, 230, 90, 30);
	panel.add(l7);

	t1 = new JTextField();
	t1.setBounds(150,60,230,20);
        t1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        t1.setForeground(Color.black);
        t1.setBackground(Color.white);
        t1.setCaretColor(Color.black);
	panel.add(t1);
	

	t2 = new JTextField();
	t2.setBounds(150, 90, 230, 20);
        t2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        t2.setForeground(Color.black);
        t2.setBackground(Color.white);
        t2.setCaretColor(Color.black);
	panel.add(t2);

	t3 = new JTextField();
	t3.setBounds(150, 120, 230, 20);
        t3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        t3.setForeground(Color.black);
        t3.setBackground(Color.white);
        t3.setCaretColor(Color.black);
	panel.add(t3);

	t4 = new JTextField();
	t4.setBounds(150, 150, 230, 20);
        t4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        t4.setForeground(Color.black);
        t4.setBackground(Color.white);
        t4.setCaretColor(Color.black);
	panel.add(t4);

        t5 = new JTextField();
	t5.setBounds(150, 180, 230, 20);
        t5.setFont(new Font("Times New Roman",Font.PLAIN,20));
        t5.setForeground(Color.black);
        t5.setBackground(Color.white);
        t5.setCaretColor(Color.black);
	panel.add(t5);

	t6 = new JTextField();
	t6.setBounds(150, 210, 230, 20);
        t6.setFont(new Font("Times New Roman",Font.PLAIN,20));
        t6.setForeground(Color.black);
        t6.setBackground(Color.white);
        t6.setCaretColor(Color.black);
	panel.add(t6);

	t7 = new JTextField();
	t7.setBounds(150, 240, 230, 20);
        t7.setFont(new Font("Times New Roman",Font.PLAIN,20));
        t7.setForeground(Color.black);
        t7.setBackground(Color.white);
        t7.setCaretColor(Color.black);
	panel.add(t7);
        
        button1 = new JButton();
        button1.setBounds(150, 300, 100,30);
        button1.addActionListener(this);
        button1.setText("Add");
        button1.setFocusable(false);
        button1.setBackground(Color.blue);
        button1.setForeground(Color.white);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        panel.add(button1);
                
        button2 = new JButton();
        button2.setBounds(280, 300, 100,30);
        button2.addActionListener(this);
        button2.setText("Back");
        button2.setFocusable(false);
        button2.setBackground(Color.blue);
        button2.setForeground(Color.white);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 15));

	
	
	panel.add(button2);

	
        
	
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Add CDs");
        this.setSize(500,400);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false); 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.add(panel);
        
        

    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            Conn c = new Conn();
            if(ae.getSource() == button1){
                if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("") )
                {
                                        JOptionPane.showMessageDialog(null, "Provide all details!", "Membership", JOptionPane.WARNING_MESSAGE);

                }
                
               else {    String query = "INSERT INTO CD(CDID,genre,CDname,episode,director,hour,stocks) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = c.con.prepareStatement(query);
                
		ps.setString(1, t1.getText());
		ps.setString(2, t2.getText());
		ps.setString(3, t3.getText());
		ps.setString(4, t4.getText());
		ps.setString(5, t5.getText());
		ps.setString(6, t6.getText());
                ps.setString(7, t7.getText());

		int count = ps.executeUpdate();
		if (count > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Added");
		else
                    JOptionPane.showMessageDialog(null, "Error");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
		ps.close();
                }
            }
            else if(ae.getSource() == button2){
                this.setVisible(false);
		//new AdminFirstScreen().setVisible(true);

            }
            c.con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
     public static void main(String[] args) {
	new AddCD().setVisible(true);
    }
}


