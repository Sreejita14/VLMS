/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;




import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewMemberCD implements ActionListener {

    JFrame frame1,frame2;
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    JLabel label1;
    JTextField  textField1;
    JButton button1,button2;
    JScrollPane sp;

    ViewMemberCD() {

        frame1 = new JFrame();
       
        
        
        
        label1 = new JLabel();
        label1.setText("Enter Membership ID");
        label1.setBounds(10,60,150,50);
        label1.setForeground(Color.black);// set font color of text
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        textField1 = new JTextField();
        textField1.setBounds(10,110,150,20);
        textField1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.white);
        textField1.setCaretColor(Color.black);
        
        
        button1 = new JButton();
        button1.setBounds(10,200,150,30);
        button1.addActionListener(this);
        button1.setText("View CD/s");
        button1.setFocusable(false);
        button1.setBackground(new Color(30,138,246));
        button1.setForeground(Color.white);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        
        button2 = new JButton();
        button2.setBounds(10,250,120,30);
        button2.addActionListener(this);
        button2.setText("Reset ID");
        button2.setFocusable(false);
        button2.setBackground(new Color(30,138,246));
        button2.setForeground(Color.white);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        JPanel Panel  = new JPanel();
        Panel.setBackground(new Color(220,220,220));
        Panel.setBounds(0, 0, 300, 400);
        Panel.setLayout(null);
        Panel.add(label1);
       // Panel.add(label2);
       // Panel.add(label3);
        Panel.add(textField1);
       // Panel.add(textField2);
       // Panel.add(comboBox);
        Panel.add(button1);
        Panel.add(button2);
        //Panel.add(button3);
        frame1.setTitle("Search Member CD");
        frame1.setSize(300,400);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame1.getWidth()) / 2;
        int y = (screenSize.height - frame1.getHeight()) / 2;
        frame1.setLocation(x, y);
        frame1.add(Panel);
        
        
        
      


    }

    public static void main(String[] args) {
        new ViewMemberCD();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {

            String memberID = textField1.getText().toString();//getting text of username text field and storing it in a String variable
            frameSecond(memberID);//passing the text value to frameSecond method

        }
        if (e.getSource() == button2) {
           textField1.setText("");//resetting the value of username text field
        }

    }


    public void frameSecond(String memberID) {
        
         frame2 = new JFrame();
    	
    	//setting the properties of second JFrame
                  defaultTableModel = new DefaultTableModel();
                  table = new JTable(defaultTableModel);
                  table.setBounds(30, 40, 200, 300);
                  table.setEnabled(false);
                  
          defaultTableModel.addColumn("CD ID");
        defaultTableModel.addColumn("CD Genre");
        defaultTableModel.addColumn("CD Name");
        defaultTableModel.addColumn("No. of Episodes");
        defaultTableModel.addColumn("Director Name");
        defaultTableModel.addColumn("Total Hour");
        defaultTableModel.addColumn("Enrollment Date");
    
                   
                     sp = new JScrollPane(table);
                     frame2.add(sp);
                  
                  
                //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
		frame2.setTitle("Database Results");
		 frame2.setSize(800, 300);
		 frame2.setVisible(true);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (screenSize.width -  frame2.getWidth()) / 2;
                int y = (screenSize.height -  frame2.getHeight()) / 2;
                 frame2.setLocation(x, y);



        try {
        	
           	Conn c = new Conn();
                
                
                
                 String query = "select * from ISSUE WHERE ID=? ";
               
                    PreparedStatement ps = c.con.prepareStatement(query);
                    ps.setString(1, memberID);
                    ResultSet resultSet = ps.executeQuery();
           
       
        
        
        
   
            while (resultSet.next()) {
            	
            	//Retrieving details from the database and storing it in the String variables
                String ID= resultSet.getString("CDID");
                String videoname = resultSet.getString("genre");
                String modules = resultSet.getString("CDname");
                String chapters = resultSet.getString("episode");
                String instructor = resultSet.getString("director");
                String hours = resultSet.getString("hour");
                String date = resultSet.getString("issueDate");
                //String price = resultSet.getString("price");
               
                    defaultTableModel.addRow(new Object[]{ID,videoname,modules,chapters,instructor,hours,date});//Adding row in Table
                   frame2.setVisible(true);
            }


        } catch (Exception e) {
            System.out.println(e);
        }


    }
}

