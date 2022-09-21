package com.training.day5_assignment.CandidateException;

public class CandidateMain {
    public static void main(String[] args) {

        try{
            new Candidate("Elizabeth","Female",11000);
        }catch(InvalidSalaryException e){
            System.out.println(e);
        }
    }
}
