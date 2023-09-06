package org.prac;

import java.util.Arrays;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<50){
        for(int number: arr){
            if(number==n)
                System.out.println("BINGO");
        }
         }
        else{
            System.out.println("Value greater than 50.");
        }

}
}
