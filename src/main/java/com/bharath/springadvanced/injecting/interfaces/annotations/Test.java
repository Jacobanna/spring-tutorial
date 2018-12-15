package com.bharath.springadvanced.injecting.interfaces.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/springadvanced/injecting/interfaces/annotations/config.xml");
        OrderBo orderBo = (OrderBo) context.getBean("orderBoImpl");
        orderBo.placeOrder();
    }
}
