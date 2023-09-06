package org.prac;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        String[] arr = new String[num];
        for(int i=0;i<num;i++){
            arr[i]=scanner.next();
        }

        for(int j=0;j<num;j++){
           for(int k=arr[j].length()-1;k>=0;k--){
               System.out.print(arr[j].charAt(k));
           }
           System.out.println();
        }
    }
}
