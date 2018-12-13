package com.bharath.spring.constructorinjection.ambiguity;

public class Addition2 {
    Addition2(int a, double b) {
        System.out.println("Inside the costructor");
        System.out.println(a);
        System.out.println(b);
    }
}
