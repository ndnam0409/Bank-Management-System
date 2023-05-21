package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FashCash extends JFrame implements ActionListener {

    JLabel text;
    JButton r1,r2,r3,r4,r5,r6,back;
    String pinnumber;
    FashCash(String pinnumber){
       this.pinnumber = pinnumber; 
       
       setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        text = new JLabel("Select withdrawl amount: ");
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,20);
        text.setFont(new Font("System", Font.BOLD, 16)); 
        image.add(text);
       
        r1 = new JButton("$100");
        r1.setBounds(170,415,150,30);
        r1.addActionListener(this);
        image.add(r1);
        
        r2 = new JButton("$200");
        r2.setBounds(355,415,150,30);
        r2.addActionListener(this);
        image.add(r2);
        
        r3 = new JButton("$500");
        r3.setBounds(170,450,150,30);
        r3.addActionListener(this);
        image.add(r3);
        
        r4 = new JButton("$1000");
        r4.setBounds(355,450,150,30);
        r4.addActionListener(this);
        image.add(r4);
        
        r5 = new JButton("$5000");
        r5.setBounds(170,485,150,30);
        r5.addActionListener(this);
        image.add(r5);
        
        r6 = new JButton("$10000");
        r6.setBounds(355,485,150,30);
        r6.addActionListener(this);
        image.add(r6);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else{
            String amount = ((JButton)ae.getSource()).getText().substring(1);
            Conn c = new Conn();
            try{
                ResultSet res = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(res.next()){
                    if (res.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(res.getString("amount"));
                    } else{
                        balance -= Integer.parseInt(res.getString("amount"));
                    }
                }
                if (ae.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"','"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"$ " + amount + " Debited Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
    } 
    
    public static void main(String args[]) {
        new FashCash("");
    }
}
