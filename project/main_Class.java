package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class  extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_Class(String pin){
        this.pin= pin;

        //Load image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        //Create jlabel
        JLabel l3= new JLabel(i3);
        l3.setBounds(0,0,1550, 830);
        add(l3);
        // labels
        JLabel label= new JLabel("Please select your transaction.");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 28));
        l3.add(label);

        //Buttons
        b1= new JButton("DEPOSIT");
        b1.setForeground(Color.BLACK);
        b1.setBounds(410,270,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2= new JButton("CASH WITHDRAWAL");
        b2.setForeground(Color.BLACK);
        b2.setBounds(700,270,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        b3= new JButton("FAST CASH");
        b3.setForeground(Color.BLACK);
        b3.setBounds(410,318,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        b4= new JButton("MINI STATEMENT");
        b4.setForeground(Color.BLACK);
        b4.setBounds(700,318,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5= new JButton("PIN CHANGE");
        b5.setForeground(Color.BLACK);
        b5.setBounds(410,362,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        b6= new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.BLACK);
        b6.setBounds(700,362,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        b7= new JButton("EXIT");
        b7.setForeground(Color.BLACK);
        b7.setBounds(700,406,150,35);
        b7.addActionListener(this);
        l3.add(b7);

        // set frame
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==b1){
                new Deposit(pin);
                setVisible(false);
            }
            else if(e.getSource()==b7){
                System.exit(0);
            }else if(e.getSource()==b2){
                new Withdrawal(pin);
                setVisible(false);
            }else if(e.getSource()==b6){
                new BalanceEnquiry(pin);
                setVisible(false);
            }
            else if(e.getSource()==b3){
                new FastCash(pin);
                setVisible(false);

            }
            else if(e.getSource()== b5){
                new ChangePin(pin);
                setVisible(false);
            }
            else if(e.getSource()==b4){
                new Mini(pin);
            }

        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
