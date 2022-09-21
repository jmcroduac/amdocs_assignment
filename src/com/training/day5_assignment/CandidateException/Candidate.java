package com.training.day5_assignment.CandidateException;

public class Candidate {
    String name;
    String gender;
    int expectedSalary;

    Candidate(String name, String gender, int expectedSalary) throws InvalidSalaryException {
        this.name = name;
        this.gender = gender;

        if(expectedSalary < 10000){
            throw new InvalidSalaryException("Salary cannot be less than 10000");
        }else{
            this.expectedSalary = expectedSalary;
            System.out.println("CANDIDATE DETAILS");
            System.out.println("Name: " + this.name);
            System.out.println("Gender: " + this.gender);
            System.out.println("Expected Salary: " + this.expectedSalary);
        }

    }


}
