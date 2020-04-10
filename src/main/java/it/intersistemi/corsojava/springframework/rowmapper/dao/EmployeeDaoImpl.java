package it.intersistemi.corsojava.springframework.rowmapper.dao;

import it.intersistemi.corsojava.springframework.rowmapper.mapper.EmployeeRowMapper;
import it.intersistemi.corsojava.springframework.rowmapper.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collection;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public Employee findById(int employeeId) {
        Employee employee = (Employee) getTemplate().queryForObject("SELECT * FROM EMPLOYEE_TABLE WHERE EMPLOYEE_ID = ?", new Object[] { employeeId }, new EmployeeRowMapper());
        return employee;
    }

    @Override
    public Collection<Employee> findAll() {
        List<Employee> employeeList = getTemplate().query("SELECT * FROM EMPLOYEE_TABLE", new EmployeeRowMapper());
        return employeeList;
    }
}
