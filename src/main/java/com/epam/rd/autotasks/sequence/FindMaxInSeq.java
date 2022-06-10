package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner scaner = new Scanner(System.in);
        int minValue = 0;
        int maxValue = 0;
        boolean zero = false;

        while(!zero){
            int userNumber = scaner.nextInt();
            if(userNumber == 0){
                zero = true;
            }else if(userNumber > 0 && userNumber > maxValue ){
                maxValue =  userNumber;
            } else if (userNumber < 0 && userNumber >= -1|| userNumber < -900000 ) {
                minValue = userNumber;
            }
        }
       if (maxValue == 0){
           return minValue;
       }else{
           return maxValue;
       }
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
