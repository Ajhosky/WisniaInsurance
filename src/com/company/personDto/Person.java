package com.company.personDto;

public class Person extends Customers {
    private String surname;
    private String pesel;

    public Person(String surname, String pesel) {
        super();
        //super(id, name, phoneNumber, address);
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

