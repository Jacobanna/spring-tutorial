package com.bharath.spring.assignment.depcheckandscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/assignment/depcheckandscopes/config.xml");
        University university = (University) context.getBean("university");
        System.out.println(university);
    }
}
