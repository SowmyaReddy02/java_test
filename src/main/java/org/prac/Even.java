package org.prac;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2==0&&i!=0){
                System.out.println(i);
            }
        }
    }
}
