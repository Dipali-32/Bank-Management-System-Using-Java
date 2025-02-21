package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    //button
    JButton next;
    //radio buttons
    JRadioButton r1, r2, m1, m2,m3;
    //get user entered data
    JTextField textName,textFname, textEmail, textAdd,textCity,textPin,textState;
    JDateChooser dateChooser;

    //Generate random application number
    Random ran= new Random();
    long first4= (ran.nextLong()%9000L)+1000L;
    String first= " "+ Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");


        //bank image
        ImageIcon i1=  new ImageIcon(ClassLoader.getSystemResource("icon/bank2.jpg"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        // label no
        JLabel label1= new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        //page label
//        JLabel label2= new JLabel("PAGE 1");
//        label2.setBounds(330,70,600,30);
//        label2.setFont(new Font("Raleway", Font.BOLD, 22));
//        add(label2);

        //personal Information
        JLabel label3= new JLabel("Personal Details");
        label3.setBounds(290,70,600,30);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        //Name
        JLabel labelName= new JLabel("Name: ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,130,100,30);
        add(labelName);

        //  box
        textName= new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 14));
        textName.setBounds(300,130,400,30);
        add(textName);

        //Father Name
        JLabel labelfName= new JLabel("Father's Name: ");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,180,200,30);
        add(labelfName);

        //  box
        textFname= new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD, 14));
        textFname.setBounds(300,180,400,30);
        add(textFname);
        // DOB
        JLabel DOB= new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,230,200,30);
        add(DOB);

        dateChooser= new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,230,400,30);
        add(dateChooser);

        //gender-- radio buttons
        JLabel labelG=  new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,280,200,30);
        add(labelG);

        // Male-radio buttons
        r1= new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(72, 163, 224));
        r1.setBounds(300,280,60,30);
        add(r1);

        // Female-radio buttons
        r2= new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(72, 163, 224));
        r2.setBounds(450,280,90,30);
        add(r2);

        // to select only one radio button at a time
        ButtonGroup buttonGroup= new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        //Email address
        JLabel labelEmail= new JLabel("Email Address:");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,330,200,30);
        add(labelEmail);

        textEmail= new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 14));
        textEmail.setBounds(300,330,400,30);
        add(textEmail);

        //Married Status
        JLabel labelMs= new JLabel("Marital Status:");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,380,200,30);
        add(labelMs);

        // Married, Unmarried radio buttons
        m1= new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(72, 163, 224));
        m1.setBounds(300,380,90,30);
        add(m1);

        m2= new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(72, 163, 224));
        m2.setBounds(400,380,110,30);
        add(m2);

        m3= new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(72, 163, 224));
        m3.setBounds(520,380,90,30);
        add(m3);

        // to select only one radio button at a time
        ButtonGroup buttonGroup1= new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        //Address
        JLabel labelAdd= new JLabel("Address:");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,430,200,30);
        add(labelAdd);

        textAdd= new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD, 14));
        textAdd.setBounds(300,430,400,30);
        add(textAdd);

        //City
        JLabel labelCity= new JLabel("City:");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,480,200,30);
        add(labelCity);

        textCity= new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD, 14));
        textCity.setBounds(300,480,400,30);
        add(textCity);

        //pin code
        JLabel labelPin= new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,530,200,30);
        add(labelPin);

        textPin= new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD, 14));
        textPin.setBounds(300,530,400,30);
        add(textPin);

        //State
        JLabel labelState= new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,580,200,30);
        add(labelState);

        textState= new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD, 14));
        textState.setBounds(300,580,400,30);
        add(textState);

        //Button
        next= new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,630,80,30);
        next.addActionListener(this);
        add(next);







        //page backgrund color
        getContentPane().setBackground(new Color(72, 163, 224));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno= first;
        String name= textName.getText();
        String fname= textFname.getText();
        String dob= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender= null;
        if(r1.isSelected()){
            gender="Male";
        }else if(r2.isSelected()){
            gender="Female";
        }
        String email= textEmail.getText();
        String marital= null;
        if(m1.isSelected()){
            marital="Married";
        }else if(m2.isSelected()){
            marital= "Unmarried";
        }else if(m3.isSelected()){
            marital="Other";
        }
        String address= textAdd.getText();
        String city= textCity.getText();
        String pincode= textPin.getText();
        String state= textState.getText();

        //store extracted data from signup from into database
        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }
            else{
                Con con1= new Con();
                String q= "insert into signup values('" +formno + "', '" +name + "','" +fname + "','" +dob + "', '" + gender + "','" +email + "', '" +marital + "', '" +address + "','" +city + "','" +pincode + "','" +state + "' )";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }

        } catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();

    }
}
