package com.bharath.springadvanced.assignment.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
    private String name;
    @Autowired
    private Reservation reservation;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", reservation=" + reservation +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
