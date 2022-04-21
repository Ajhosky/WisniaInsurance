package com.company.personDto;

public class Company extends Customers {
    private String NIP;
    private String regon;
    private Representative representative;

    public Company(Integer id, String name, String phoneNumber, com.company.personDto.address address, String NIP, String regon, Representative representative) {
        super();
        this.NIP = NIP;
        this.regon = regon;
        this.representative = representative;
    }

    public String getNIP() {
        return NIP;
    }

    public String getRegon() {
        return regon;
    }

    public Representative getRepresentative() {
        return representative;
    }
}
