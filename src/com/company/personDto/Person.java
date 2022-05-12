package com.company.personDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Person extends Customers {
    private String surname;
    private String pesel;

    public Person(String surname, String pesel,String name, String phoneNumber, String address, Integer id) {
        super();
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.surname = surname;
        this.pesel = pesel;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }




    public void insertIntoDb(Person person) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection(
                "jdbc:sqlite:C:\\2tc\\WisniaInsurance\\insurancesDB.sqlite"
        );
        Statement st = con.createStatement();
        String PersonValues = person.getName() + ", " + person.getSurname() + ", " + person.getPhoneNumber() + ", " + person.getPesel() + ", " + person.getAddress();
        st.execute("INSERT INTO Person(Name, Surname, PhoneNumber, Pesel, Address) values(PersonValues)");
    }


}

