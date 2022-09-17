package com.training.assignment1_1;

public class RepeatingChar {
    public static void main(String[] args){


        String input = "aabbbbeeeeffggg";
        char[] inputarr = input.toCharArray();

        char current = input.charAt(0);
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(i == input.length()-1){
                if(inputarr[i] == current){
                    count++;
                    System.out.print(current);
                    System.out.print(count);
                }
            } else if(inputarr[i] == current && inputarr[i+1] != inputarr[i]){
                count++;
                System.out.print(current);
                System.out.print(count);
                current = inputarr[i+1];
                count = 0;
            } else{
                count++;
            }
        }
    }
}
