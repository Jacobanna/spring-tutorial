package com.bharath.spring.jdbc.assignment.dao.mapper;

import com.bharath.spring.jdbc.assignment.dto.PassengerDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PassengerRowMapper implements RowMapper<PassengerDto> {
    @Override
    public PassengerDto mapRow(ResultSet resultSet, int i) throws SQLException {
        PassengerDto passengerDto = new PassengerDto();
        passengerDto.setId(resultSet.getInt(1));
        passengerDto.setFirstName(resultSet.getString(2));
        passengerDto.setLastName(resultSet.getString(3));
        return passengerDto;
    }
}
