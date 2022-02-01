/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;




// Packages to import
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class SearchCD extends JFrame  {
	  JFrame frame2;//creating object of second JFrame
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;
	JScrollPane sp;
	

	// Constructor
	public SearchCD()
	{
		
                

                    
                    
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
        defaultTableModel.addColumn("Stocks Available");
                    this.setVisible(true);
                     sp = new JScrollPane(table);
                    this.add(sp);
                  
                  
                //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Database Results");
		this.setSize(800, 300);
		this.setVisible(true);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (screenSize.width - this.getWidth()) / 2;
                int y = (screenSize.height - this.getHeight()) / 2;
                this.setLocation(x, y);
        
                
                
                
                      try {
        	Conn c = new Conn();
                
                
                
                 String query = "select * from CD ";
               
                    PreparedStatement ps = c.con.prepareStatement(query);
                    
                    ResultSet resultSet = ps.executeQuery();
           
       
        
        
        
   
            while (resultSet.next()) {
            	
            	//Retrieving details from the database and storing it in the String variables
                String ID= resultSet.getString("CDID");
                String videoname = resultSet.getString("genre");
                String modules = resultSet.getString("CDname");
                String chapters = resultSet.getString("episode");
                String instructor = resultSet.getString("director");
                String hours = resultSet.getString("hour");
                String price = resultSet.getString("stocks");
                
               
                    defaultTableModel.addRow(new Object[]{ID,videoname,modules,chapters,instructor,hours,price});//Adding row in Table
                   this.setVisible(true);
            }

                    


        } catch (Exception e) {
            System.out.println(e);
        }
                
                
                
                
                
                
                
                
                
                
	}

	

   
    
    // Driver method
	public static void main(String[] args)
	{
		new SearchCD();
	}
}


