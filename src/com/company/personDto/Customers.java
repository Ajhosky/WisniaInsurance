package com.company.personDto;

import java.math.BigDecimal;

public class Customers {
   protected Integer id;
   protected String name;
   protected String phoneNumber;
   protected address address;

   public Customers(Integer id, String name, String phoneNumber, com.company.personDto.address address) {
      this.id = id;
      this.name = name;
      this.phoneNumber = phoneNumber;
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

   public com.company.personDto.address getAddress() {
      return address;
   }
}
