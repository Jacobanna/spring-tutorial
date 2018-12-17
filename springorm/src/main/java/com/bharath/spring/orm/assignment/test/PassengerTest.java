package com.bharath.spring.orm.assignment.test;

import com.bharath.spring.orm.assignment.dao.PassengerDao;
import com.bharath.spring.orm.assignment.dto.PassengerDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PassengerTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/orm/assignment/ormAssignmentConfig.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDaoImpl");
        PassengerDto passengerDto = new PassengerDto();
        passengerDto.setId(1);
//        passengerDto.setFirstName("TestName3");
//        passengerDto.setLastName("TestSurname3");

//        Integer result = passengerDao.create(passengerDto);
//        System.out.println(result);

//        passengerDao.update(passengerDto);

//        passengerDto = passengerDao.find(2);
//        System.out.println(passengerDto);

        List<PassengerDto> passengerDtoList = passengerDao.findAll();
        System.out.println(passengerDtoList);
    }
}
