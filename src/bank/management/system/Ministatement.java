package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Ministatement extends JFrame {
    
    JLabel bank, text, card, mini;
    String pinnumber;
    Ministatement(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("Mini Statement");
        
        setLayout(null);
        
        text = new JLabel();
        add(text);
        
        bank = new JLabel("BIDV Bank");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        mini = new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while (rs.next()){
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
            while (rs.next()){
                mini.setText(mini.getText() + rs.getString(""));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
    }
    public static void main(String args[]) {
        new Ministatement("");
    }
}
