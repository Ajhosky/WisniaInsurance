package com.company.menuPanel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel implements Mediator, ActionListener {
    JButton button;
    JFrame frame;
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
        window.setLayout(null);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        JPanel left = new JPanel();
        left.setBorder(new LineBorder(Color.BLACK));
        left.setSize(320, 600);
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        JPanel buttonPanel = new JPanel();
        policyListButton.setPreferredSize(new Dimension(85, 25));
        buttonPanel.add(policyListButton);
        buttonPanel.setLayout(new FlowLayout());
        JPanel listPanel = new JPanel();
       // list.setFixedCellWidth(260);
        listPanel.setSize(320, 470);
        left.add(buttonPanel);
        left.add(listPanel);

    }
    public void JButtonTest(){
        frame = new JFrame();
        frame.setTitle("My JFrame");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Click Me!");
        button.addActionListener(this);

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
    }
}
