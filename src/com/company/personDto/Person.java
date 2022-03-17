package com.company.personDto;

public class Person extends Customers {
    private String surname;
    private String pesel;

    public Person() {
    }

    public Person(String surname, String pesel) {
        this.surname = surname;
        this.pesel = pesel;
    }
}

