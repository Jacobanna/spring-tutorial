package com.bharath.spring.jdbc.dao;

import com.bharath.spring.jdbc.dto.EmployeeDto;

import java.util.List;

public interface EmployeeDao {
    int create(EmployeeDto employeeDto);
    int update(EmployeeDto employeeDto);
    int delete(int id);

    EmployeeDto read(int id);
    List<EmployeeDto> read();
}
