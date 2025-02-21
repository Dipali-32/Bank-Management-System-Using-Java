package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1, p2;
    String pin;
    ChangePin(String pin){
        this.pin= pin;

        //Load image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        //Create jlabel
        JLabel l3= new JLabel(i3);
        l3.setBounds(0,0,1550, 830);
        add(l3);

        //Change pin
        JLabel label1= new JLabel("CHANGE YOUR PIN.");
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setBounds(430,180,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2= new JLabel("NEW PIN");
        label2.setFont(new Font("System", Font.BOLD,16));
        label2.setBounds(430,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        p1= new JPasswordField();
        p1.setBounds(430,250,400,35);
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(p1);

        //Re- enter password
        JLabel label3= new JLabel("RE-ENTER NEW  PIN");
        label3.setFont(new Font("System", Font.BOLD,16));
        label3.setBounds(430,280,400,35);
        label3.setForeground(Color.WHITE);
        l3.add(label3);

        p2= new JPasswordField();
        p2.setBounds(430,310,400,35);
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(p2);


        // Button
        b1= new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l3.add(b1);

        b2= new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        l3.add(b2);

        //frame set
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String pin1= p1.getText();
            String pin2= p2.getText();
            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null, "PIN do not match! Please try again!");
                return;
            }
            if(e.getSource()==b1){
                if(pin1.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter Pin.");
                    return;
                }
                if(pin2.equals("")){
                    JOptionPane.showMessageDialog(null, "Renter new Pin.");
                    return;
                }
                // change pin in bank, signup, login
                Con c= new Con();
                String q1= "update bank set pin='"+pin1+"' where pin='"+pin+"'  ";
                String q2= "update login set pin='"+pin1+"' where pin='"+pin+"'  ";
                String q3= "update signupThree set pin='"+pin1+"' where pin='"+pin+"'  ";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "Pin changed successfully.");
                pin= pin1; // update pin to store new pin
                setVisible(false);
                new main_Class(pin);
            }
            else if(e.getSource()==b2){
                setVisible(false);
                new main_Class(pin);
            }



        }catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new ChangePin("");

    }
}
