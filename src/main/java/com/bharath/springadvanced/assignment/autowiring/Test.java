package com.bharath.springadvanced.assignment.autowiring;

import com.bharath.springadvanced.autowiring.annotations.Employee;
import com.bharath.springadvanced.autowiring.annotations.Employee2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/springadvanced/assignment/autowiring/config.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
    }
}
