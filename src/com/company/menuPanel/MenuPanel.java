package com.company.menuPanel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel implements Mediator, ActionListener {
    JFrame window;
    JPanel left;
private PolicyListButton policyListButton;
private List list;


    @Override
    public void registerComponent(Component component){
       component.setMediator(this);
       switch (component.getName()){
           case "PolicyListButton":
               policyListButton = (PolicyListButton)component;
               break;
           case "List":
               list = (List)component;
               break;
               }
       }

    @Override
    public void showPolicyList(List list) {

    }

    @Override
    public void createGUI() {
        JFrame window = new JFrame("Wisnia Insurance menu");
        window.setSize(960,600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        JPanel left = new JPanel();
        left.setBounds(0,0,100,100);
        left.setBackground(Color.gray);
        left.setBorder(new LineBorder(Color.BLACK));
        JButton b1=new JButton("Sign in");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.yellow);
        JButton b2=new JButton("Sign up");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.green);
        left.add(b1);
        left.add(b2);
        window.add(left);
        Font font = new Font("Courier", Font.BOLD,25);
        JLabel error = new JLabel("Something went wrong");
        error.setText("Something went wrong");
        error.setVisible(false);
        error.setFont(font);
        left.add(error);
        ActionListener SignInButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                error.setVisible(true);
            }
        };
        b1.addActionListener(SignInButton);
        b2.addActionListener(SignInButton);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //    public void JButtonTest(){
//        frame = new JFrame();
//        frame.setTitle("My JFrame");
//        frame.setSize(500, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        button = new JButton("Click Me!");
//        button.addActionListener(this);
//
//        frame.setLayout(new FlowLayout());
//        frame.add(button);
//        frame.setVisible(true);
//    }

}
