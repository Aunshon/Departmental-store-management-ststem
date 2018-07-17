
package javaapplication3;


import java.sql.*;
import javax.swing.*;

public class projectsqlconnetion {
    Connection conn=null;
    public static Connection ConnecrDb(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
    //JOptionPane.showMessageDialog(null, "Yes");
    //"jdbc:mysql://localhost:3306/depertmental","root",""
    //"jdbc:sqlite:depertmental.sqlite"
    return conn;
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,"Database Connection Failed");
    return null;
    }
    }
}
