package com.bharath.springadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/springadvanced/stereotype/annotations/config.xml");
        Instructor instructor = (Instructor) context.getBean("inst");
        System.out.println(instructor);
        Instructor instructor2 = (Instructor) context.getBean("inst");
        System.out.println(instructor2);
    }
}
