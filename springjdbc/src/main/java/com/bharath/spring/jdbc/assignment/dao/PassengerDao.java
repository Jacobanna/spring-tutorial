package com.bharath.spring.jdbc.assignment.dao;

import com.bharath.spring.jdbc.assignment.dto.PassengerDto;

import java.util.List;


public interface PassengerDao {
    int create(PassengerDto passengerDto);
    int update(PassengerDto passengerDto);
    int delete(int id);

    PassengerDto read(int id);
    List<PassengerDto> read();
}
