package com.bharath.springadvanced.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/springadvanced/autowiring/annotations/config.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
        Employee2 employee2 = (Employee2) context.getBean("employee2");
        System.out.println(employee2);
    }
}
