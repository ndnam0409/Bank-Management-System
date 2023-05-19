package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PinChange extends JFrame implements ActionListener {
    String pinnumber;
    JLabel text, pintxt, repintxt;
    JTextField pin, repin;
    JButton change, back;
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        text = new JLabel("Change your PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(270,280,500,35);
        image.add(text);
        
        pintxt = new JLabel("New PIN: ");
        pintxt.setForeground(Color.WHITE);
        pintxt.setFont(new Font("System", Font.BOLD, 14));
        pintxt.setBounds(165,320,180,25);
        image.add(pintxt);
        
        pin = new JTextField();
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(330,320,180,25);
        add(pin);
        
        repintxt = new JLabel("Re-Enter New PIN: ");
        repintxt.setForeground(Color.WHITE);
        repintxt.setFont(new Font("System", Font.BOLD, 14));
        repintxt.setBounds(165,360,180,25);
        image.add(repintxt);
        
        repin = new JTextField();
        repin.setFont(new Font("Raleway", Font.BOLD, 18));
        repin.setBounds(330,360,180,25);
        add(repin);
        
        
        change = new JButton("Change");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
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
        } else if (ae.getSource() == change){
            try{
                String npin = pin.getText();
                String rpin = repin.getText();
                
                if (npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter new PIN");
                    if (rpin.equals("")){
                        JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
                        if (!npin.equals(rpin)){
                            JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                        }
                    }
                }
                Conn c = new Conn();
                String query1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
                String query2 = "update login set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
                String query3 = "update signupthree set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
                
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    
    public static void main(String args[]) {
        new PinChange("");
    }
}
