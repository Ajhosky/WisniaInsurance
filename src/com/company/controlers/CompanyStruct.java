package com.company.controlers;

import java.sql.SQLException;
import java.sql.Statement;

public class CompanyStruct{

    Statement st = Connection.connect();

    public CompanyStruct() throws SQLException, ClassNotFoundException {
        st.execute("DROP table if exists Companies");
        st.execute("CREATE table Companies(id INTEGER not null constraint Companies_pk primary key autoincrement," +
                "name varchar(20)," +
                "phone varchar(12)," +
                "address varchar(30)," +
                "NIP varchar(11),"+
                "regon varchar(10),"+
                "representative_id INTEGER"+// representative_id to id perosn ktory ich reprezentuje
                ")");
        st.close();
    }

}
