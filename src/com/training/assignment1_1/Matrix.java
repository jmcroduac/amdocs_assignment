package com.training.assignment1_1;

public class Matrix {
    public static void main(String[] args){

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        int row = arr.length - 1;
        int col = arr[0].length - 1;
        int start_row = 0;
        int start_col = 0;

        while(start_row < row && start_col < col){
            for(int i = start_col; i <= col; i++){
                System.out.print(arr[start_row][i] + " ");
            }
            start_row += 1;

            for(int i = start_row; i <= row; i++){
                System.out.print(arr[i][col] + " ");
            }
            col -= 1;

            if(start_row < row){
                for(int i = col; i >= start_col; i--){
                    System.out.print(arr[row][i] + " ");
                }
                row -= 1;
            }

            if(start_col < col){
                for(int i = row; i >= start_row; i--){
                    System.out.print(arr[i][start_col] + " ");
                }
                start_col += 1;
            }
        }
    }
}
