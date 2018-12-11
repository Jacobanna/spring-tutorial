package com.bharath.spring.properties;

import com.bharath.spring.map.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/properties/propertiesconfig.xml");
        CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) context.getBean("countriesAndLanguages");
        System.out.println(countriesAndLanguages);
    }
}
