package com.company.controlers;

import com.company.personDto.Person;

import java.io.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Connection {

    public static Statement connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:sqlite:C:\\2tc\\WisniaInsurance\\insurancesDB.sqlite"
        );
        Statement st = con.createStatement();
        return st;
    }
    public static void saveData(String tableName) throws SQLException, ClassNotFoundException, FileNotFoundException {
        Statement st = Connection.connect();
        String Data = null;
        ResultSet result = st.executeQuery("SELECT * FROM "+ tableName);
        while (result.next()){
            Data += "\n"+ result.getString(1)+"\t"+ result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4)+"\t"+result.getString(5)+"\t"+result.getString(6)+"\t"+result.getString(7);
        }
        st.close();
        System.out.println(Data); //teraz zwraca null i nie chce przypisac do niego danych z tabeli
        PrintWriter zapis = new PrintWriter(tableName+".txt");
        zapis.println(Data);
        zapis.close();
    }


//    public static void saveData(String tableName) throws SQLException, ClassNotFoundException, FileNotFoundException {
//        Statement st = Connection.connect();
//        String Data = String.valueOf(st.execute("SELECT * FROM "+ tableName));
//        PrintWriter zapis = new PrintWriter(tableName+".txt");
//        zapis.println(Data);
//        zapis.close();
//    }
}
