package com.bharath.spring.orm.assignment.dao;

import com.bharath.spring.orm.assignment.dto.PassengerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class PassengerDaoImpl implements PassengerDao {
    @Autowired
    HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create(PassengerDto passengerDto) {
        Integer result = (Integer) hibernateTemplate.save(passengerDto);
        return result;
    }

    @Override
    @Transactional
    public void update(PassengerDto passengerDto) {
        hibernateTemplate.update(passengerDto);
    }

    @Override
    @Transactional
    public void delete(PassengerDto passengerDto) {
        hibernateTemplate.delete(passengerDto);
    }

    @Override
    public PassengerDto find(int id) {
        PassengerDto passengerDto = hibernateTemplate.get(PassengerDto.class, id);
        return passengerDto;
    }

    @Override
    public List<PassengerDto> findAll() {
        List<PassengerDto> passengerDtoList = hibernateTemplate.loadAll(PassengerDto.class);
        return passengerDtoList;
    }
}
