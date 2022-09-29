package org.example.composite;

import org.example.composite.Exceptions.FieldLengthLimitException;
import org.example.composite.Exceptions.IncorrectSalaryException;

public class CompositeFactorDemo {
    public static void main(String[] args) {
        try{
            Manager ceo = new Manager("Marco Ferry","CEO",500000,2000);
            Employee marketingHead= new Employee("Eugene Solovey","Marketing Head",125000,ceo.getId());
            Employee financeHead = new Employee("Alex Bergman","Finance Head",150000,ceo.getId());
            Employee employee1 =  new Employee("Olexiy Shevchenko","Finance Manager",60000,financeHead.getId());
            Employee employee2=  new Employee("John Terry","Finance Analyst",70000,financeHead.getId());
            Employee employee3=  new Employee("Max Berry","Marketing Online-Marketing",60000,marketingHead.getId());


            ceo.add(marketingHead);
            ceo.add(financeHead);
            marketingHead.add(employee3);
            financeHead.add(employee1);
            financeHead.add(employee2);

            System.out.println(ceo.toString());
            for(Employee employee: ceo.getSubordinates()){
                System.out.println(employee.toString());

                for (Employee subordinate: employee.getSubordinates()){
                    System.out.println(subordinate.toString());
                }
            }

        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        }

    }
}