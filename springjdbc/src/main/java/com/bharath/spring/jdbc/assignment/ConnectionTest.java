package com.bharath.spring.jdbc.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/jdbc/assignment/jdbcConfig.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate2");
        String sql = "INSERT INTO passenger VALUES(?,?,?)";
        int result = jdbcTemplate.update(sql, 4, "TestName", "TestSurname");
        System.out.println("Number of records inserted: " + result);
    }
}
