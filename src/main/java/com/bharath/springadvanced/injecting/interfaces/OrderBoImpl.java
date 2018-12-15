package com.bharath.springadvanced.injecting.interfaces;

public class OrderBoImpl implements OrderBo {
    private OrderDao orderDao;

    @Override
    public void placeOrder() {
        System.out.println("Inside OrderBoImpl");
        orderDao.createOrder();
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
