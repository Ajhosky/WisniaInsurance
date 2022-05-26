package com.company.controlers;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
    public static void insertIntoPolicy() throws SQLException, ClassNotFoundException {
        Statement st = Connection.connect();
        String policyholder;
        String insured;
        String beneficiary;
        String risk;
        String contributionAmount;
        String policyType;
        System.out.println("Podaj dane do tabeli Policy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("policyHolder: ");
        policyholder = scanner.next();
        System.out.println("insured: ");
        insured = scanner.next();
        System.out.println("beneficiary: ");
        beneficiary = scanner.next();
        System.out.println("risk: ");
        risk = scanner.next();
        System.out.println("contributionAmount: ");
        contributionAmount = scanner.next();
        System.out.println("policyType: ");
        policyType = scanner.next();
        st.execute("INSERT INTO Person (policyholder, insured, beneficiary, risk, contributionAmount, policyType) values (policyholder,insured,beneficiary,risk,contributionAmount,policyType)");

    }
}
