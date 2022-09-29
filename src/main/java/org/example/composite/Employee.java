package org.example.composite;



import org.example.composite.Exceptions.FieldLengthLimitException;
import org.example.composite.Exceptions.IncorrectSalaryException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    protected int id;
    protected static int nextId = 0;
    protected String name;

    protected String department;
    protected double salary;
    protected int managerID;
    protected List<Employee>  subordinates;
    public Employee() {

    }

    public Employee(String name, String department, double salary, int managerID) throws FieldLengthLimitException, IncorrectSalaryException {
        setName(name);
        setSalary(salary);
        this.id = nextId++;
        this.department = department;
        this.managerID = managerID;
        this.subordinates = new ArrayList<Employee>();
    }
    // Add new employee in the list
    public void add(Employee employee){
        subordinates.add(employee);
    }
    // Remove employee from subordinates
    public void remove(Employee employee){
        subordinates.remove(employee);
    }

    @Override
    public String toString() {
        return  "ID: " + id + " Name: " + name +
                " Department: " + department + " Salary: "
                + salary + " USD" + " Manager ID: " + managerID;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 50) {
            try {
                throw new FieldLengthLimitException("Name has more than 50 symbols!");
            } catch (FieldLengthLimitException e) {
                System.out.println(e.getMessage());
            }
        } else {
            this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            try {
                throw new IncorrectSalaryException("Salary is negative!");
            } catch (IncorrectSalaryException e) {
                System.out.println(e.getMessage());
            }
        } else {
            this.salary = salary;
        }
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public int getManagerID() {
        return managerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && managerID == employee.managerID && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary, managerID);
    }
}
