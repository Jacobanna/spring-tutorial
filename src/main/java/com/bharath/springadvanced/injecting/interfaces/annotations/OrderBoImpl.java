package com.bharath.springadvanced.injecting.interfaces.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderBoImpl implements OrderBo {
    @Autowired
    @Qualifier("dao2")
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
