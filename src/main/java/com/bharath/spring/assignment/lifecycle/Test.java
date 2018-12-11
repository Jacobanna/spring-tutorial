package com.bharath.spring.assignment.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/assignment/lifecycle/lifecycleconfig.xml");
        TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketreservation");
        System.out.println(ticketReservation);
        context.registerShutdownHook();
    }
}
