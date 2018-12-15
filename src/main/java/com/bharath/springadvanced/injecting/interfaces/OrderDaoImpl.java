package com.bharath.springadvanced.injecting.interfaces;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void createOrder() {
        System.out.println("Inside OrderDaoImpl");
    }
}
