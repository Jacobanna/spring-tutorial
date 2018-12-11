package com.bharath.spring.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext
                ("com/bharath/spring/lc/annotations/annotationsconfig.xml");
        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient);
        context.registerShutdownHook();
    }
}
