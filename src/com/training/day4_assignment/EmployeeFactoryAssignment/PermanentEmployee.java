package com.training.day4_assignment.EmployeeFactoryAssignment;

public class PermanentEmployee implements Employee{
    double basicPay;
    double pf;
    double netPay;
    double loanAmount;
    String name;

    public PermanentEmployee(String name, double basicPay){
        this.name = name;
        this.basicPay = basicPay;
        pf = basicPay * 0.12;
        netPay  = basicPay - pf;
        loanAmount = netPay * 0.15;
    }

    @Override
    public double calculateSalary() {
        System.out.println("The net salary for permanent employee " +  name + " is: " + netPay);
        return netPay;
    }

    @Override
    public double calculateLoan() {
        System.out.println("The maximum loan amount that is available for permanent employee " +  name + " is: " + loanAmount);
        return loanAmount;
    }
}
