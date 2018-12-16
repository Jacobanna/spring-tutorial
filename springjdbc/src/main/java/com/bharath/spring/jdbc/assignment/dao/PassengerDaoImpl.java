package com.bharath.spring.jdbc.assignment.dao;

import com.bharath.spring.jdbc.assignment.dao.mapper.PassengerRowMapper;
import com.bharath.spring.jdbc.assignment.dto.PassengerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PassengerDaoImpl implements PassengerDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int create(PassengerDto passengerDto) {
        String sql = "INSERT INTO passenger VALUES(?,?,?)";
        int result = jdbcTemplate.update(sql, passengerDto.getId(), passengerDto.getFirstName(), passengerDto.getLastName());
        return result;
    }

    @Override
    public int update(PassengerDto passengerDto) {
        String sql = "UPDATE passenger SET firstName=?, lastName=? WHERE id=?";
        int result = jdbcTemplate.update(sql, passengerDto.getFirstName(), passengerDto.getLastName(), passengerDto.getId());
        return result;
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM passenger WHERE id=?";
        int result = jdbcTemplate.update(sql, id);
        return result;
    }

    @Override
    public PassengerDto read(int id) {
        String sql = "SELECT * FROM passenger WHERE id=?";
        PassengerRowMapper passengerRowMapper = new PassengerRowMapper();
        PassengerDto passengerDto = jdbcTemplate.queryForObject(sql, passengerRowMapper, id);
        return passengerDto;
    }

    @Override
    public List<PassengerDto> read() {
        String sql = "SELECT * FROM passenger";
        PassengerRowMapper passengerRowMapper = new PassengerRowMapper();
        List<PassengerDto> passengerDtoList = jdbcTemplate.query(sql, passengerRowMapper);
        return passengerDtoList;
    }
}
