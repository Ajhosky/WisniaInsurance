package com.company.personDto;

public class Person extends Customers {
    private String surname;
    private String pesel;

    public Person(String surname, String pesel) {
        super(//cos wpisac);
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }
}

