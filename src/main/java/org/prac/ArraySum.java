package org.prac;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0;i<=arr.length-1;i++){
           arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i=0;i<=arr.length-1;i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of the elements : "+sum);
        System.out.println("average : "+sum/2);
    }
}
