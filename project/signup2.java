package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JButton next;

    // drop down for religion
    JComboBox comboBox, comboBox2,comboBox3,comboBox4,comboBox5;
    //Textfield
    JTextField textPan,textAdhar;
    JRadioButton r1, r2,m1,m2;
    String formno;
     signup2(String formno){
         super("APPLICATION FORM");

         //bank image
         ImageIcon i1=  new ImageIcon(ClassLoader.getSystemResource("icon/bank2.jpg"));
         Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
         ImageIcon i3= new ImageIcon(i2);
         JLabel image= new JLabel(i3);
         image.setBounds(150,5,100,100);
         add(image);

         this.formno= formno;

         //PAGE 2
         JLabel l1= new JLabel("Page 2:-");
         l1.setFont(new Font("Raleway",Font.BOLD,22));
         l1.setBounds(300,20,600,40);
         add(l1);

         JLabel l2= new JLabel("Additional Details");
         l2.setFont(new Font("Raleway",Font.BOLD,22));
         l2.setBounds(300,60,600,40);
         add(l2);

         //religion
         JLabel l3= new JLabel("Religion");
         l3.setFont(new Font("Raleway",Font.BOLD,15));
         l3.setBounds(100,120,100,30);
         add(l3);
         //drop down
         String [] religion= {"Hindu","Muslim","Sikh","Christian","Other"};
         comboBox= new JComboBox(religion);
         comboBox.setBackground(new Color(161, 252, 216));
         comboBox.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox.setBounds(350,120,320,30);
         add(comboBox);

         //category
         JLabel l4= new JLabel("Category :");
         l4.setFont(new Font("Raleway",Font.BOLD,15));
         l4.setBounds(100,170,100,30);
         add(l4);

         String [] category= {"General","OBC","SC","ST","Other"};
         comboBox2= new JComboBox(category);
         comboBox2.setBackground(new Color(161, 252, 216));
         comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox2.setBounds(350,170,320,30);
         add(comboBox2);

         //Income
         JLabel l5= new JLabel("Income :");
         l5.setFont(new Font("Raleway",Font.BOLD,15));
         l5.setBounds(100,220,100,30);
         add(l5);

         String [] income= {"Null","<50,000","<1,50,000","<5,00,000","<8,00,000","<10,00,000",">10,00,000"};
         comboBox3= new JComboBox(income);
         comboBox3.setBackground(new Color(161, 252, 216));
         comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox3.setBounds(350,220,320,30);
         add(comboBox3);

         //Education
         JLabel l6= new JLabel("Educational :");
         l6.setFont(new Font("Raleway",Font.BOLD,15));
         l6.setBounds(100,270,100,30);
         add(l6);

         String [] educational= {"Non-Graduate","Graduate","POst-Graduate","Doctrate","Other"};
         comboBox4= new JComboBox(educational);
         comboBox4.setBackground(new Color(161, 252, 216));
         comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox4.setBounds(350,270,320,30);
         add(comboBox4);

         //Occupation
         JLabel l7= new JLabel("Occupation :");
         l7.setFont(new Font("Raleway",Font.BOLD,15));
         l7.setBounds(100,320,100,30);
         add(l7);

         String [] occupation= {"Salaried","Self-Employed","Business","Retired","Student","Other"};
         comboBox5= new JComboBox(occupation);
         comboBox5.setBackground(new Color(161, 252, 216));
         comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox5.setBounds(350,320,320,30);
         add(comboBox5);

         //Pan Card Number
         JLabel l8= new JLabel("Pan Number :");
         l8.setFont(new Font("Raleway",Font.BOLD,15));
         l8.setBounds(100,370,100,30);
         add(l8);

         textPan= new JTextField();
         textPan.setFont(new Font("Raleway",Font.BOLD,15));
         textPan.setBounds(350,370,320,30);
         add(textPan);

         //Adhar Number

         JLabel l9= new JLabel("Adhar Number :");
         l9.setFont(new Font("Raleway",Font.BOLD,15));
         l9.setBounds(100,420,150,30);
         add(l9);

         textAdhar= new JTextField();
         textAdhar.setFont(new Font("Raleway",Font.BOLD,15));
         textAdhar.setBounds(350,420,320,30);
         add(textAdhar);

         //Senior citizen
         JLabel l10= new JLabel("Senior Citizen :");
         l10.setFont(new Font("Raleway",Font.BOLD,15));
         l10.setBounds(100,470,150,30);
         add(l10);

         r1= new JRadioButton("Yes");
         r1.setFont(new Font("Raleway",Font.BOLD,13));
         r1.setBackground(new Color(161, 252, 216));
         r1.setBounds(350,470,100,30);
         add(r1);

         r2= new JRadioButton("No");
         r2.setFont(new Font("Raleway",Font.BOLD,13));
         r2.setBackground(new Color(161, 252, 216));
         r2.setBounds(450,470,100,30);
         add(r2);

         ButtonGroup buttonGroup= new ButtonGroup();
         buttonGroup.add(r1);
         buttonGroup.add(r2);

         //Existed Account
         JLabel l11= new JLabel("Existing Account :");
         l11.setFont(new Font("Raleway",Font.BOLD,15));
         l11.setBounds(100,520,150,30);
         add(l11);

         m1= new JRadioButton("Yes");
         m1.setFont(new Font("Raleway",Font.BOLD,13));
         m1.setBackground(new Color(161, 252, 216));
         m1.setBounds(350,520,100,30);
         add(m1);

         m2= new JRadioButton("No");
         m2.setFont(new Font("Raleway",Font.BOLD,13));
         m2.setBackground(new Color(161, 252, 216));
         m2.setBounds(450,520,100,30);
         add(m2);

         ButtonGroup buttonGroup1= new ButtonGroup();
         buttonGroup1.add(m1);
         buttonGroup1.add(m2);

         //Form Number
         JLabel l12= new JLabel("Form No :");
         l12.setFont(new Font("Raleway",Font.BOLD,14));
         l12.setBounds(600,10,100,30);
         add(l12);

         JLabel l13= new JLabel(formno);
         l13.setFont(new Font("Raleway",Font.BOLD,14));
         l13.setBounds(700,10,100,30);
         add(l13);

         //Button
         next= new JButton("Next");
         next.setFont(new Font("Raleway",Font.BOLD,15));
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setBounds(570,640,100,30);
         next.addActionListener(this);
         add(next);







         // frame size and background color
         setLayout(null);
        setSize(850,750);
        setLocation(100,0);
        getContentPane().setBackground(new Color(161, 252, 216));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String rel= (String) comboBox.getSelectedItem();
         String cate= (String) comboBox2.getSelectedItem();
         String inc= (String) comboBox3.getSelectedItem();
         String edu= (String) comboBox4.getSelectedItem();
         String occ= (String) comboBox5.getSelectedItem();

         String pan= textPan.getText();
         String adhar= textAdhar.getText();

         String sencit= " ";
         if(r1.isSelected()){
             sencit="Yes";
         }else if(r2.isSelected()){
             sencit="No";
         }

        String eacc= " ";
        if(m1.isSelected()){
            eacc="Yes";
        }else if(m2.isSelected()){
            eacc="No";
        }
        try{
            if(textPan.getText().equals("") || textAdhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields.");
            }else{
                Con c1= new Con();
                String q= "insert into signupTwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+sencit+"','"+eacc+"' )";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
    new signup2("");
    }
}
