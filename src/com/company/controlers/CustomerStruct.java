package com.company.controlers;

import java.sql.SQLException;
import java.sql.Statement;

public class CustomerStruct {

    Statement st = Connection.connect();

    public CustomerStruct() throws SQLException, ClassNotFoundException {
        st.execute("DROP table if exists Customers");
        //COMPANIES TABLE
        st.execute("CREATE table Customers(id INTEGER not null constraint Customers_pk primary key autoincrement," +
                "name varchar(20)," +
                "phone varchar(12)," +
                "address varchar(30)" +
                ")");
        st.close();
    }
}
