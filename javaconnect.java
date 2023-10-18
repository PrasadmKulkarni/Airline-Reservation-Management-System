
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saqib khan
 */
public class javaconnect {
    Connection conn;
    public static Connection ConnectDb(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/atbs","root","");
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
Connection conn=java.sql.DriverManager.getConnection("jdbc:ucanaccess://D:\\Airline Reservation1.accdb");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
            
        }
        
        
        
    }
    
}
