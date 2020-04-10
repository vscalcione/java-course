package it.intersistemi.corsojava.springframework.rowmapper.dao;

import it.intersistemi.corsojava.springframework.rowmapper.model.Employee;

import java.util.Collection;

public interface EmployeeDao {

    public Employee findById(int employeeId);
    public Collection<Employee> findAll();
}
