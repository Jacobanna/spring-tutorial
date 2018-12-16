package com.bharath.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/dbConfig.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        String sql = "INSERT INTO employee VALUES(?,?,?)";
        int result = jdbcTemplate.update(sql, 1, "John", "Snow");
        System.out.println("Number of records inserted: " + result);
    }
}
