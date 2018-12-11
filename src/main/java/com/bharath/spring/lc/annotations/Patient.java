package com.bharath.spring.lc.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside setId() method");
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

    @PostConstruct
    public void hi() {
        System.out.println("Inside hi() method");
    }

    @PreDestroy
    public void bye() {
        System.out.println("Inside bye() method");
    }
}
