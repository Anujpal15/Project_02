package Swing_Project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Form extends JFrame implements ActionListener {
    JLabel label1, label2, label3, label4, label5;
    JTextField t1, t2;
    JRadioButton male, female;
    JComboBox day,month,year;
    JTextArea tal;
    JCheckBox term;
    JButton submit;
    JLabel msg;
    JTextArea screen;

    Form(){
        setTitle("Registration Form1");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c  = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Name");
        label1.setBounds(20,50,100,20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);

        label2 = new JLabel("Mobile");
        label2.setBounds(20,100,100,20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);

        label3 = new JLabel("Gender");
        label3.setBounds(20,150,100,20);
        c.add(label3);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(130,150,80,20);
        female.setBounds(220,150,80,20);

        c.add(male);
        c.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        label4 = new JLabel("DOB");
        String [] days = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25","26", "27", "28", "29", "30", "31"};
        String [] months = {"Jun", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug","Sep","Oct","Nov","Dec"};
        String [] years = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010",
                "2011","2012","2013", "2014", "2015", "2016", "2017", "2018","2019", "2020", "2021", "2022","2023"};

        day = new JComboBox(days);
        month = new JComboBox<>(months);
        year = new JComboBox(years);

        day.setBounds(130,200,50,20);
        month.setBounds(190,200,50,20);
        year.setBounds(250,200,50,20);

        c.add(day);
        c.add(month);
        c.add(year);

        label5 = new JLabel("Address");
        label5.setBounds(20,250,100,20);
        c.add(label5);

        tal = new JTextArea();
        tal.setBounds(130,240,200,50);
        c.add(tal);



        term = new JCheckBox("Please accept teams and condition");
        term.setBounds(50,300,250,50);
        c.add(term);

        submit = new JButton("Submit");
        submit.setBounds(150,350,80,20);
        c.add(submit);
        submit.addActionListener(this);

        screen = new JTextArea();
        screen.setBounds(350,50,300,300);
        c.add(screen);

        msg = new JLabel();
        msg.setBounds(20,400,250,20);
        c.add(msg);
        c.setBackground(Color.yellow);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (term.isSelected()){
            msg.setText("Registration Successful");
            String name = t1.getText();
            String mobile = t2.getText();
            String gender = "male";
            if (female.isSelected()){
                gender="female";
            }
            String dob= day.getSelectedItem()+ "_" + month.getSelectedItem()+"_" +year.getSelectedItem();
            String address = tal.getText();

            screen.setText("Name :"+ name +"\n"+ "Mobile :"+ mobile +"\n" +"DOB :"+ dob+ "\n"+ "Address"+ address);
        }
        else {
            msg.setText("accept terms and condition to submit");
        }
    }
}
public class Registration{
    public static void main(String[] args) {
        Form form = new Form();
    }
}