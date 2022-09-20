package com.training.day4_assignment;


public class EmployeeFactory {
    public Employee getEmployee(String employeeType, String name, double basicPay){
        if(employeeType == null){
            return null;
        }
        if(employeeType.equalsIgnoreCase("permanent")){
            return new PermanentEmployee(name, basicPay);

        } else if(employeeType.equalsIgnoreCase("contractual")){
            return new ContractualEmployee(name, basicPay);

        }

        return null;
    }
}
