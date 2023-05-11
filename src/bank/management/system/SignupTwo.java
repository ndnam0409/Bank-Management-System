package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    long random;
    JLabel religion, category, income, educational, qualification, occupation, citizen, PAN, Aadhar, exAccount;
    JComboBox religionComboBox, categoryComboBox, incomeComboBox, eduComboBox, occupationCombobox;
    JTextField panTextField, AadharTextField;
    JRadioButton syes, sno, eyes, eno;
    JButton next;
    String formno;
    SignupTwo(String formno){
        
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100,140,200,30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionComboBox = new JComboBox(valReligion);
        religionComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        religionComboBox.setBounds(300,140,400,30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);
        
        category = new JLabel("Category: ");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        categoryComboBox= new JComboBox(valCategory);
        categoryComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        categoryComboBox.setBounds(300,190,400,30);
        categoryComboBox.setBackground(Color.WHITE);
        add(categoryComboBox);
        
        income = new JLabel("Income: ");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100,240,200,30);
        add(income);
     
        String valIncome[] = {"null", " < 150,000", "< 250,000", "< 500,000", "Up to 1,000,000"};
        incomeComboBox = new JComboBox(valIncome);
        incomeComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        incomeComboBox.setBounds(300,240,400,30);
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);
        
        educational = new JLabel("Educational ");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100,290,200,30);
        add(educational);
        
        String valEducation[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        eduComboBox = new JComboBox(valEducation);
        eduComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        eduComboBox.setBounds(300,290,400,30);
        eduComboBox.setBackground(Color.WHITE);
        add(eduComboBox);
        
        qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
        String valOccupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        occupationCombobox = new JComboBox(valOccupation);
        occupationCombobox.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationCombobox.setBounds(300,390,400,30);
        occupationCombobox.setBackground(Color.WHITE);
        add(occupationCombobox);
       
        PAN = new JLabel("PAN Number: ");
        PAN.setFont(new Font("Raleway", Font.BOLD, 20));
        PAN.setBounds(100,440,200,30);
        add(PAN);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        Aadhar = new JLabel("Aadhar Number: ");
        Aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        Aadhar.setBounds(100,490,200,30);
        add(Aadhar);
        
        AadharTextField = new JTextField();
        AadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        AadharTextField.setBounds(300,490,400,30);
        add(AadharTextField);
        
        citizen = new JLabel("Senior Citizen: ");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100,540,200,30);
        add(citizen);
        
        syes = new JRadioButton("Yes");
        syes.setFont(new Font("Raleway", Font.BOLD, 14));
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.LIGHT_GRAY);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway", Font.BOLD, 14));
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.LIGHT_GRAY);
        add(sno);
        
        ButtonGroup citizenGroup = new ButtonGroup();
        citizenGroup.add(syes);
        citizenGroup.add(sno);
        
        exAccount = new JLabel("Existing Account: ");
        exAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        exAccount.setBounds(100,590,200,30);
        add(exAccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway", Font.BOLD, 14));
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.LIGHT_GRAY);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setFont(new Font("Raleway", Font.BOLD, 14));
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.LIGHT_GRAY);
        add(eno);
        
        ButtonGroup exAccountGroup = new ButtonGroup();
        exAccountGroup.add(eyes);
        exAccountGroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = " " + random;
        String sreligion = (String)religionComboBox.getSelectedItem();
        String scategory = (String)categoryComboBox.getSelectedItem();
        String sincome = (String)incomeComboBox.getSelectedItem();
        String seducational = (String) eduComboBox.getSelectedItem();
        String soccupation = (String) occupationCombobox.getSelectedItem();
        String span = panTextField.getText();
        String saadhar = AadharTextField.getText();
        String scitizen = null;
        if (syes.isSelected()){
            scitizen = "Yes";
        }else if (sno.isSelected()){
            scitizen = "No";
        }
        String sExistAccount = null;
        if (eyes.isSelected()){
            sExistAccount = "Yes";
        }else if (eno.isSelected()){
            sExistAccount = "No";
        }
        
        try{
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducational+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+scitizen+"', '"+sExistAccount+"')";
            c.s.executeUpdate(query);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]) {
       new SignupTwo("");
    }
}
