package org.example.composite;

import org.example.composite.Exceptions.FieldLengthLimitException;
import org.example.composite.Exceptions.IncorrectSalaryException;

import java.util.ArrayList;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, String department, double salary, double bonus)
            throws FieldLengthLimitException, IncorrectSalaryException {
        setName(name);
        setSalary(salary);
        this.id = nextId++;
        this.department = department;
        this.bonus = bonus;
        this.subordinates = new ArrayList<Employee>();
    }
    @Override
    public String toString(){
        return "ID: " + id + " Name: " + name  +
                " Department: " + department +  " Salary: "
                + salary + " USD" +" Bonus:  " + bonus + " USD";
    }
    public double getBonus() {
        return bonus;
    }
}
