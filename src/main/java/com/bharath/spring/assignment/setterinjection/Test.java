package com.bharath.spring.assignment.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/assignment/setterinjection/assignmentconfig.xml");
        ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingcart");
        System.out.println(shoppingCart);
    }
}
