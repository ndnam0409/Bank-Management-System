package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class SignupThree extends JFrame {

    JLabel accountType, cardNo, number, cardDetails, PIN, pnumber, pindetails, services;
    JRadioButton saving, fixedDeposit, current, recurringDeposit;
    JCheckBox ATM, IBanking, MobileBanking, email, cheque, e_statement, note;
    JButton submit, cancel;
    
    SignupThree(){
        
        setLayout(null);
        
        setTitle("ACCOUNT DETAILS - PAGE 3");
        
        JLabel additionalDetails = new JLabel("Page 3: Account Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        accountType = new JLabel("Account Type");
        accountType.setFont(new Font("Raleway", Font.BOLD, 20));
        accountType.setBounds(100,140,200,30);
        add(accountType);
        
        saving = new JRadioButton("Saving Account");
        saving.setFont(new Font("Raleway", Font.BOLD, 16));
        saving.setBackground(Color.LIGHT_GRAY);
        saving.setBounds(120, 180,250,20);
        add(saving);
        
        fixedDeposit = new JRadioButton("Fixed Deposit Account");
        fixedDeposit.setFont(new Font("Raleway", Font.BOLD, 16));
        fixedDeposit.setBackground(Color.LIGHT_GRAY);
        fixedDeposit.setBounds(370, 180,250,20);
        add(fixedDeposit);
        
        current = new JRadioButton("Current Acocunt");
        current.setFont(new Font("Raleway", Font.BOLD, 16));
        current.setBackground(Color.LIGHT_GRAY);
        current.setBounds(120, 220,250,20);
        add(current);
        
        recurringDeposit = new JRadioButton("Recurring Deposit Account");
        recurringDeposit.setFont(new Font("Raleway", Font.BOLD, 16));
        recurringDeposit.setBackground(Color.LIGHT_GRAY);
        recurringDeposit.setBounds(370, 220,250,20);
        add(recurringDeposit);
        
        ButtonGroup accType = new ButtonGroup();
        accType.add(saving);
        accType.add(fixedDeposit);
        accType.add(current);
        accType.add(recurringDeposit);
        
        cardNo = new JLabel("Card Number: ");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 20));
        cardNo.setBounds(100,280,200,30);
        add(cardNo);
        
        number = new JLabel("XXXX-XXXX-XXXX-4922");
        number.setFont(new Font("Raleway", Font.BOLD, 20));
        number.setBounds(330,280,300,30);
        add(number);

        cardDetails = new JLabel("Your 16 Digit Card Number");
        cardDetails.setFont(new Font("Raleway", Font.BOLD, 12));
        cardDetails.setBounds(100,310,300,20);
        add(cardDetails);
        
        PIN = new JLabel("PIN: ");
        PIN.setFont(new Font("Raleway", Font.BOLD, 20));
        PIN.setBounds(100,350,300,20);
        add(PIN);
        
        pnumber = new JLabel("XXXXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 20));
        pnumber.setBounds(330,350,300,20);
        add(pnumber);
        
        pindetails = new JLabel("Your 6 Digits Password");
        pindetails.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetails.setBounds(100,380,300,20);
        add(pindetails);
        
        services = new JLabel("Services Required: ");
        services.setFont(new Font("Raleway", Font.BOLD, 20));
        services.setBounds(100,420,200,30);
        add(services);
        
        ATM = new JCheckBox("ATM CARD");
        ATM.setBackground(Color.LIGHT_GRAY);
        ATM.setFont(new Font("Raleway", Font.BOLD, 16));
        ATM.setBounds(120,470,200,20);
        add(ATM);
        
        IBanking = new JCheckBox("Internet Banking");
        IBanking.setBackground(Color.LIGHT_GRAY);
        IBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        IBanking.setBounds(380,470,200,20);
        add(IBanking);
        
        MobileBanking = new JCheckBox("Mobile Banking");
        MobileBanking.setBackground(Color.LIGHT_GRAY);
        MobileBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        MobileBanking.setBounds(120,520,200,20);
        add(MobileBanking);
        
        email = new JCheckBox("Email & SMS Alerts");
        email.setBackground(Color.LIGHT_GRAY);
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        email.setBounds(380,520,200,20);
        add(email);
        
        cheque = new JCheckBox("Cheque Book");
        cheque.setBackground(Color.LIGHT_GRAY);
        cheque.setFont(new Font("Raleway", Font.BOLD, 16));
        cheque.setBounds(120,570,200,20);
        add(cheque);
        
        e_statement = new JCheckBox("E-Statement");
        e_statement.setBackground(Color.LIGHT_GRAY);
        e_statement.setFont(new Font("Raleway", Font.BOLD, 16));
        e_statement.setBounds(380,570,200,20);
        add(e_statement);
        
        note = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        note.setBackground(Color.LIGHT_GRAY);
        note.setFont(new Font("Raleway", Font.BOLD, 12));
        note.setBounds(100,630,600,20);
        add(note);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 670, 100,30);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(450, 670, 100,30);
        add(cancel);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        setSize(850,800);
        setLocation(350,0);
        setVisible(true);
    }
    public static void main(String args[]) {
        new SignupThree();
    }
}
