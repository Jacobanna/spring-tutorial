package com.bharath.springadvanced.injecting.interfaces;

public class OrderDaoImpl2 implements OrderDao {
    @Override
    public void createOrder() {
        System.out.println("Inside OrderDaoImpl2");
    }
}
