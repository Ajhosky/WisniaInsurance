package com.company;

import java.sql.*;

import static java.lang.Class.forName;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // dataBase
        {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection(
                "jdbc:sqlite:C:\\2tc\\WisniaInsurance\\insurancesDB.sqlite"
        );
        Statement st = con.createStatement();
        st.execute("DROP table if exists Policy");
        st.execute("CREATE table Policy(id int autincrement," +
                "policy_name text," +
                "policy_type text" +
                ")");
        con.close();
        }
    }
}
