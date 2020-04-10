package it.intersistemi.corsojava.springframework.rowmapper.model;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeDesignation;
    private float employeeSalary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeDesignation, float employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
