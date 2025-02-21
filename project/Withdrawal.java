package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton b1, b2;
    Withdrawal(String pin){
        this.pin= pin;

        //Load image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        //Create jlabel
        JLabel l3= new JLabel(i3);
        l3.setBounds(0,0,1550, 830);
        add(l3);

        //WITHDRAWAL
        JLabel label1= new JLabel("MAXIMUM WITHDRAWAL IS 10000");
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setBounds(460,180,700,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2= new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setFont(new Font("System", Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        //amount
        textField= new JTextField();
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(textField);

        // Button
        b1= new JButton("WITHDRAW");
        b1.setBounds(700,362,150,35);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l3.add(b1);

        b2= new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        l3.add(b2);

        // set JFrame properties
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw.");
                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin= '" + pin + "' ");
                    int balance = 0;
                    while (resultSet.next()) {
                        try{
                            if (resultSet.getString("type").equals("Deposit")) {
                                balance += Integer.parseInt(resultSet.getString("amount"));
                            } else {
                                balance -= Integer.parseInt(resultSet.getString("amount"));
                            }
                        }catch(NumberFormatException ex){
                            ex.printStackTrace();
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance.");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "','Withdrawal', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " withdrew Successfully.");
                    setVisible(false);
                    new main_Class(pin);
                }


            } catch (Exception E) {
                E.printStackTrace();
            }
        }else if(e.getSource()==b2){
            setVisible(false);
            new main_Class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawal("");

    }
}
