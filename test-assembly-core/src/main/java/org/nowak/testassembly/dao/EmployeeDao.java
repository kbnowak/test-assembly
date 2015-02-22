package org.nowak.testassembly.dao;

import org.nowak.testassembly.entity.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by kabeen on 2015-02-21.
 */
public class EmployeeDao {
    List<Employee> employeeList;

    public EmployeeDao(List<Employee> employeeList) {
        this.employeeList = employeeList;
        setupJdbc();
    }

    public void setupJdbc() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.execute("select * from tralala;");
    }
}
