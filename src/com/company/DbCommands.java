package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCommands {

    public static void makeDb() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection(
                "jdbc:sqlite:C:\\2tc\\WisniaInsurance\\insurancesDB.sqlite"
        );
        Statement st = con.createStatement();
        st.execute("DROP table if exists Customers");
        st.execute("CREATE table Customers(id int not null constraint Customers_pk primary key autoincrement," +
                "phone varchar(12)," +
                "address varchar(30)" +
                ")");
        con.close();
    }
//    create table Customers
//            (
//                    id int not null
//                    constraint Customers_pk
//                    primary key autoincrement,
//                    phone varchar(12),
//    address varchar(30)
//);




}
