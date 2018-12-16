package com.bharath.spring.jdbc.dao.mapper;

import com.bharath.spring.jdbc.dto.EmployeeDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<EmployeeDto> {
    @Override
    public EmployeeDto mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(resultSet.getInt(1));
        employeeDto.setFirstName(resultSet.getString(2));
        employeeDto.setLastName(resultSet.getString(3));
        return employeeDto;
    }
}
