package com.company.controlers;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {

    public static Statement connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:sqlite:C:\\2tc\\WisniaInsurance\\insurancesDB.sqlite"
        );
        Statement st = con.createStatement();
        return st;
    }


}
