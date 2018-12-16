package com.bharath.spring.jdbc.dao.implementation;

import com.bharath.spring.jdbc.dao.EmployeeDao;
import com.bharath.spring.jdbc.dao.mapper.EmployeeRowMapper;
import com.bharath.spring.jdbc.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(EmployeeDto employeeDto) {
        String sql = "INSERT INTO employee VALUES(?,?,?)";
        int result = jdbcTemplate.update(sql, employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getLastName());
        return result;
    }

    @Override
    public int update(EmployeeDto employeeDto) {
        String sql = "UPDATE employee SET firstname=?, lastname=? where id=?";
        int result = jdbcTemplate.update(sql, employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getId());
        return result;
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM employee WHERE id=?";
        int result = jdbcTemplate.update(sql, id);
        return result;
    }

    @Override
    public EmployeeDto read(int id) {
        String sql = "SELECT * FROM employee WHERE id=?";
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        EmployeeDto employeeDto = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return employeeDto;
    }

    @Override
    public List<EmployeeDto> read() {
        String sql = "SELECT * FROM employee";
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        List<EmployeeDto> employeeDtoList = jdbcTemplate.query(sql, rowMapper);
        return employeeDtoList;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
