package com.bharath.spring.constructorinjection.ambiguity;

import com.bharath.spring.constructorinjection.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/constructorinjection/ambiguity/config.xml");
        Addition addition = (Addition) context.getBean("addition");
        Addition2 addition2 = (Addition2) context.getBean("addition2");
    }
}
