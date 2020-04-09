package it.intersistemi.corsojava.lambdaexpressions.exercises.library;

public class Employee {

    private String id;
    private double salary;
    private double extraordinary;

    public Employee() {
    }

    public Employee(String id, double salary, double extraordinary) {
        this.id = id;
        this.salary = salary;
        this.extraordinary = extraordinary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExtraordinary() {
        return extraordinary;
    }

    public void setExtraordinary(double extraordinary) {
        this.extraordinary = extraordinary;
    }

    public double pay(int extraordinaryHours){
        return extraordinaryHours * extraordinary + salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", extraordinary=" + extraordinary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("163829", 1200.0, 10.0);

        System.out.println(employee1.toString());
        System.out.println("Total pay: " + employee1.pay(10));

        EmployeeA employee1A = new EmployeeA("163829", 1200.0, 10.0, 5 );

        System.out.println(employee1A.toString());
        System.out.println("Total pay: " + employee1A.pay(10));
    }
}
