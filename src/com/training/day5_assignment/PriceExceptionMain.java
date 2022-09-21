package com.training.day5_assignment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PriceExceptionMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int itemNo = 0;

        try{
            itemNo = scanner.nextInt();
            int[] itemArr = new int[itemNo];
            for(int i = 0; i < itemNo; i++){
                System.out.print("Enter price for item # " + (i+1) + ": ");
                itemArr[i] = scanner.nextInt();
            }

            System.out.print("Enter item # to see the price detail: ");
            int index = scanner.nextInt();
            System.out.println("The price of item # " + index + " is: " + itemArr[index-1]);

        }catch(InputMismatchException e){
            System.out.println("Only integer values are accepted.");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Item # not valid. There is only " + itemNo + " item/s in the list.");
        }

    }
}
