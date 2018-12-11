package com.bharath.spring.lc.xmlconfig;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside setId() method");
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

    public void hi() {
        System.out.println("Inside hi() method");
    }

    public void bye() {
        System.out.println("Inside bye() method");
    }
}
