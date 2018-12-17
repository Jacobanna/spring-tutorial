package com.bharath.spring.orm.assignment.dao;

import com.bharath.spring.orm.assignment.dto.PassengerDto;

import java.util.List;


public interface PassengerDao {
    int create(PassengerDto passengerDto);
    void update(PassengerDto passengerDto);
    void delete(PassengerDto passengerDto);

    PassengerDto find(int id);
    List<PassengerDto> findAll();
}
