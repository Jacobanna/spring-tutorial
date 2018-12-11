package com.bharath.spring.reftypes;

import com.bharath.spring.properties.CountriesAndLanguages;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/reftypes/reftypesconfig.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
