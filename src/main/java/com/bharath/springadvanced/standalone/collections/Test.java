package com.bharath.springadvanced.standalone.collections;

import com.bharath.springadvanced.autowiring.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/springadvanced/standalone/collections/config.xml");
        ProductsList productsList = (ProductsList) context.getBean("productsList");
        System.out.println(productsList);
    }
}
