package com.bharath.spring.jdbc.test;

import com.bharath.spring.jdbc.dao.EmployeeDao;
import com.bharath.spring.jdbc.dto.EmployeeDto;
import com.bharath.springadvanced.autowiring.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/dbConfig.xml");
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(2);
        employeeDto.setFirstName("Morty");
        employeeDto.setLastName("Slop");
//        int result = employeeDao.create(employeeDto);
//        int result = employeeDao.update(employeeDto);
//        int result = employeeDao.delete(2);

        EmployeeDto employeeDto1 = employeeDao.read(1);
        System.out.println("Employee Record: " + employeeDto1);

        List<EmployeeDto> result = employeeDao.read();
        System.out.println(result);
    }
}
