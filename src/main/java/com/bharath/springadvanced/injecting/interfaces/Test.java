package com.bharath.springadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/springadvanced/injecting/interfaces/config.xml");
        OrderBo orderBo = (OrderBo) context.getBean("orderBo");
        orderBo.placeOrder();
        OrderBo orderBo2 = (OrderBo) context.getBean("orderBo2");
        orderBo2.placeOrder();
    }
}
