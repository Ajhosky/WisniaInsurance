package com.company;

import com.company.menuPanel.Mediator;
import com.company.menuPanel.MenuPanel;
import com.company.menuPanel.PolicyListButton;
import com.company.personDto.Person;
import com.company.controlers.Connection;

import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class Main {
    private static String text;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Statement st = Connection.connect();
        //PERSON TABLE
        st.execute("DROP table if exists Person");

        st.execute("CREATE table Person(id INTEGER not null constraint Customers_pk primary key autoincrement," +
                "surname varchar(20),"+
                "name varchar(20)," +
                "pesel varchar(12)," +
                "phoneNumber varchar(12),"+
                "address varchar(30)" +
                ")");
        st.execute("DROP table if exists Policy");

        //POLICY TABLE
        st.execute("CREATE table Policy(id INTEGER not null constraint Customers_pk primary key autoincrement," +
                "policyholder varchar(30)," +
                "insured varchar(30)," +
                "beneficiary varchar(30)," +
                "risk text,"+
                "contributionAmount int(30),"+
                "policyType varchar(15)"+
                ")");

        st.execute("DROP table if exists Customers");
        //COMPANIES TABLE
        st.execute("CREATE table Customers(id INTEGER not null constraint Customers_pk primary key autoincrement," +
                "name varchar(20)," +
                "phone varchar(12)," +
                "address varchar(30)" +
                ")");
        st.close();
        Person person = new Person("Kowalski","Adam","12312312312","123123123","Warszawa ul.zlota 32a", 45);
        person.insertIntoDb(person);



        // okno menu

        Mediator mediator = new MenuPanel();

        mediator.registerComponent(new PolicyListButton());
        mediator.createGUI();

//        JPanel panel = new JPanel();
//            JFrame window = new JFrame("Wisnia Insurance menu");
//            window.setBounds(200,200,500,500);
//            window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            window.setVisible(true);
//            window.setResizable(false);
//            panel.setVisible(true);
//            panel.setBackground(Color.black);
//            window.add(panel);panel


//        panel.setBounds(0, 0, 400, 400);
//        panel.setBackground(Color.red);
//        JButton login = new JButton("Sign in");
//        login.setBounds(30, 50, 80, 30);
//        login.setBackground(Color.yellow);
//        JButton register = new JButton("Sign up");
//        register.setBounds(120, 50, 80, 30);
//        register.setBackground(Color.green);
//        panel.add(login);
//        panel.add(register);
//
//        f.add(panel);
//        f.setSize(400, 400);
//        f.setLayout(null);
//        f.setVisible(true);
        }
    }

