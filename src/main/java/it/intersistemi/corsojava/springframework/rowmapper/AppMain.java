package it.intersistemi.corsojava.springframework.rowmapper;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.springframework.rowmapper.dao.EmployeeDao;
import it.intersistemi.corsojava.springframework.rowmapper.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

public class AppMain {

    public static void main(String[] args) throws IOException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("employeeDao");
        int employeeFindId = ConsoleInputInt.readInt(console, "ID to search: ");

        // Find by ID
        Employee employees = employeeDao.findById(1);
        System.out.println("--------- Find by ID -------------- ");
        System.out.println(employees.toString());

        // Find all
        Collection<Employee> employeeList = employeeDao.findAll();
        System.out.println(" --------- Find all ----------------- ");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }

        // Closing the application context
        ((AbstractApplicationContext) applicationContext).close();
    }
}
