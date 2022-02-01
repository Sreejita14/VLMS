/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pay extends JFrame implements ActionListener{
    JButton button;
    Pay(){
         JOptionPane.showMessageDialog(null, "This site is used only for the project purpose.\nDon not pay anything at this site!", "DO NOT PAY", JOptionPane.WARNING_MESSAGE);
        
        JEditorPane j = new JEditorPane();
        j.setEditable(false);   

        try {
            j.setPage("https://razorpay.com/payment-gateway/");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        } 

        JScrollPane scrollPane = new JScrollPane(j);     
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));
        
       button=new JButton("Back");
       button.setBounds(600,40,100,30);
       button.setBackground(Color.blue);
       button.setFocusable(false);
       button.setForeground(Color.white);
       button.addActionListener(this);
       j.add(button);
        
        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Pay");
        this.setSize(800,600);
        this.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.add(j);
        
      
      
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
           // System.out.println("Clicked");
            this.setVisible(false);
            new BuyMembership().setVisible(true);
        }
    }
    public static void main(String[] args){
        new Pay().setVisible(true);
    }
}


