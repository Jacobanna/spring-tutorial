package com.bharath.spring.jdbc.assignment.test;

import com.bharath.spring.jdbc.assignment.dao.PassengerDao;
import com.bharath.spring.jdbc.assignment.dto.PassengerDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PassengerTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/jdbc/assignment/jdbcConfig.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDaoImpl");
        PassengerDto passengerDto = new PassengerDto();
        passengerDto.setId(10);
        passengerDto.setFirstName("TestName2");
        passengerDto.setLastName("TestSurname2");
//        int result = passengerDao.create(passengerDto);
//        int result = passengerDao.update(passengerDto);
//        int result = passengerDao.delete(10);

//        PassengerDto passengerDto2 = passengerDao.read(1);
//        System.out.println(passengerDto2);

        List<PassengerDto> result = passengerDao.read();
        System.out.println(result);
    }
}
