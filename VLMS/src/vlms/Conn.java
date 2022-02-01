/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlms;




import java.sql.*;

public class Conn {
    Connection con;
    Statement st;
    public Conn()
    {
        try{
            String url = "jdbc:mysql://localhost:3306/CD";
            String username = "root";
            String password ="sreejitabanerjeebppimt";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            st = con.createStatement();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args)
    {
        new Conn();
    }
}

