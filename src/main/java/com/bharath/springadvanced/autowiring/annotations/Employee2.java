package com.bharath.springadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee2 {
//    correct using field
    @Autowired
    @Qualifier("address2")
    private Address address;

//    another correct using constructor
//    @Autowired
    public Employee2(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "address=" + address +
                '}';
    }
}
