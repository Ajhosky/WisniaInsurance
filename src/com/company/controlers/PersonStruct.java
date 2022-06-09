package com.company.controlers;

import com.company.personDto.Person;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PersonStruct {

    Statement st = Connection.connect();

    public PersonStruct() throws SQLException, ClassNotFoundException {
        st.execute("DROP table if exists Person");
        st.execute("CREATE table Person(id INTEGER not null constraint Customers_pk primary key autoincrement," +
                "surname varchar(20)," +
                "name varchar(20)," +
                "pesel varchar(12)," +
                "phoneNumber varchar(12)," +
                "address varchar(30)," +
                "age INTEGER,"+
                ")");
        st.execute("INSERT INTO Person (surname, name, pesel,phoneNumber, address) values ('Kowalski', 'Jurek', '12345678901','12356789','wisniowa56' )");
        st.close();
    }
    public static void insertIntoPerson() throws SQLException, ClassNotFoundException, IOException {
        Statement st = Connection.connect();
        String surname;
        String name;
        String pesel;
        String phoneNumber;
        String address;
        Integer age;
        System.out.println("Podaj dane do tabeli Person");
        Scanner scanner = new Scanner(System.in);
        System.out.println("surname: ");
        surname = scanner.next();
        System.out.println("name: ");
        name = scanner.next();
        System.out.println("pesel: ");
        pesel = scanner.next();
        System.out.println("phoneNumber: ");
        phoneNumber = scanner.next();
        System.out.println("address: ");
        address = scanner.next();
        System.out.println("age: ");
        age = scanner.nextInt();
        st.execute("INSERT INTO Person (name, surname, pesel, phoneNumber, address, age) values (surname,name,pesel,phoneNumber,address,age)");

        //st.execute("INSERT INTO")
    }
}
