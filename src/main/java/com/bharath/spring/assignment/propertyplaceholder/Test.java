package com.bharath.spring.assignment.propertyplaceholder;

import com.bharath.spring.propertyplaceholder.MyDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/assignment/propertyplaceholder/config.xml");
        DbPropertiesDao dbPropertiesDao = (DbPropertiesDao) context.getBean("dbpropertiesdao");
        System.out.println(dbPropertiesDao);
    }
}
