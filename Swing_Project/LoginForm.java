package Swing_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame implements ActionListener {
    Container c;
    JLabel label1,label2;
    JTextField user;
    JPasswordField pass;
    JButton button;

    Frame(){
        setTitle("Login Form1");

        setSize(400,300);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Username");
        label2 = new JLabel("Password");

        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20);

        c.add(label1);
        c.add(label2);

        user = new JTextField();
        user.setBounds(120,50,120,20);
        c.add(user);

        pass = new JPasswordField();
        pass.setBounds(120,100,70,20);
        c.add(pass);

        button = new JButton("Login");
        button.setBounds(100,150,70,30);
        c.add(button);

        button.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Username :" + user.getText());
        System.out.println("Password :" + pass.getText());
    }
}
public class LoginForm {
    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}
