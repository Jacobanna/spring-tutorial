package com.bharath.spring.constructorinjection.ambiguity;

public class Addition {
    Addition(double a, double b) {
        System.out.println("Inside constructor DOUBLE");
    }

    Addition(int a, int b) {
        System.out.println("Inside constructor INT");
    }

    Addition(String a, String b) {
        System.out.println("Inside constructor STRING ");
    }
}
