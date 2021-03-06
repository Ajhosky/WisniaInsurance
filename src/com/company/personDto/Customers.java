package com.company.personDto;

public abstract class Customers {
   protected Integer id;
   protected String name;
   protected String phoneNumber;
   protected String address;

   public Customers() {
      this.id = id;
      this.name = name;
      this. phoneNumber = phoneNumber;
      this.address = address;
   }


   public Integer getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public String getAddress() {
      return address;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}
