package it.intersistemi.corsojava.springframework.rowmapper.mapper;

import it.intersistemi.corsojava.springframework.rowmapper.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper {

    public Employee mapRow(ResultSet rs, int numRow) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
        employee.setEmployeeName(rs.getString("EMPLOYEE_FULLNAME"));
        employee.setEmployeeDesignation(rs.getString("EMPLOYEE_DESIGNATION"));
        employee.setEmployeeSalary(rs.getFloat("EMPLOYEE_SALARY"));
        return employee;
    }
}
