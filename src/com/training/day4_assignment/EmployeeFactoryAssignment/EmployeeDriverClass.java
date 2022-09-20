package com.training.day4_assignment.EmployeeFactoryAssignment;

public class EmployeeDriverClass {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee e1 = employeeFactory.getEmployee("permanent", "Harry",25000);
        e1.calculateSalary();
        e1.calculateLoan();

        Employee e2 = employeeFactory.getEmployee("contractual","Meghan",15000);
        e2.calculateSalary();
        e2.calculateLoan();

    }
}
