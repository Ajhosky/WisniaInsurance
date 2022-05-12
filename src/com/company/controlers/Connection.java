package com.company.controlers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
    public void saveData(String tableName) throws SQLException, ClassNotFoundException, FileNotFoundException {
        Statement st = Connection.connect();
        String Data = String.valueOf(st.execute("SELECT * FROM "+ tableName));
        PrintWriter zapis = new PrintWriter(tableName+".txt");
        zapis.println(Data);
        zapis.close();
    }



}
