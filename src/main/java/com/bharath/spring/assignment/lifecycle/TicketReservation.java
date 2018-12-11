package com.bharath.spring.assignment.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
    boolean isReserved;

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Initializing");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Closing");
    }

    @Override
    public String toString() {
        return "TicketReservation{" +
                "isReserved=" + isReserved +
                '}';
    }
}
