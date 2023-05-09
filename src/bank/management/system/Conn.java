package bank.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///BankManagementSystem", "root", "Dnam4922@");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        new Conn();
    }
}
