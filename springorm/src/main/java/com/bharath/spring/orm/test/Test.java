package com.bharath.spring.orm.test;

import com.bharath.spring.orm.dao.ProductDao;
import com.bharath.spring.orm.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/orm/test/ormConfig.xml");
        ProductDao productDao = (ProductDao) context.getBean("productDaoImpl");
        Product product = new Product();
        product.setId(1);
//        product.setName("Iphone");
//        product.setDesc("Description");
//        product.setPrice(502.70);
//        productDao.create(product);

//        product.setId(1);
//        product.setName("Iphone");
//        product.setDesc("Description");
//        product.setPrice(800.0);
//        productDao.update(product);

        productDao.delete(product);
    }
}
