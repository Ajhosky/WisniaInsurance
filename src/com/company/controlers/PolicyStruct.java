package com.company.controlers;

import java.sql.SQLException;
import java.sql.Statement;

public class PolicyStruct {

    Statement st = Connection.connect();

    public PolicyStruct() throws SQLException, ClassNotFoundException {
        st.execute("DROP table if exists Policy");

        //POLICY TABLE
        st.execute("CREATE table Policy(id INTEGER not null constraint Customers_pk primary key autoincrement," +
                "policyholder varchar(30)," +
                "insured varchar(30)," +
                "beneficiary varchar(30)," +
                "risk text,"+
                "contributionAmount int(30),"+
                "policyType varchar(15)"+
                ")");
        st.close();
    }
}
