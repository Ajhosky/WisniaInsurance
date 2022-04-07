package com.company.personDto;

public class address {
    private String przedrostek;
    private String zipCode;
    private String country;
    private String city;
    private String street;

    public address(String przedrostek, String zipCode, String country, String city, String street) {
        this.przedrostek = przedrostek;
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public String getPrzedrostek() {
        return przedrostek;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
