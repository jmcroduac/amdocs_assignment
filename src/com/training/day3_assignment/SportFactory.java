package com.training.day3_assignment;

public class SportFactory {
    public Sport getSport(String sportType){
        if(sportType == null){
            return null;
        }
        if(sportType.equalsIgnoreCase("BADMINTON")){
            return new Badminton();

        } else if(sportType.equalsIgnoreCase("FOOTBALL")){
            return new Football();

        }

        return null;
    }
}
