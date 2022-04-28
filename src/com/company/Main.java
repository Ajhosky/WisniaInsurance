package com.company;

import com.company.personDto.Person;

import javax.swing.*;
import java.awt.*;
import java.sql.*;




public class Main {
    private static String text;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {



        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection(
                "jdbc:sqlite:C:\\2tc\\WisniaInsurance\\insurancesDB.sqlite"
        );
        Statement st = con.createStatement();
        st.execute("DROP table if exists Customers");
       // st.execute("CREATE TABLE Individual_Customer()");
        st.execute("CREATE table Customers(id INTEGER not null constraint Customers_pk primary key autoincrement," +
                "name varchar(20)," +
                "phone varchar(12)," +
                "address varchar(30)" +
                ")");
        st.execute("INSERT INTO Customers(phone, address)values ('123321567', 'Wisniowa56')");
        System.out.println(st.execute("SELECT * FROM Customers"));
        con.close();
        Person person = new Person("Adam","12312312312","")


//        JFrame f = new JFrame("Wisnia Insurance");
//        JPanel panel = new JPanel();
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

