package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n = ");
        int n = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count<n){
            if (check(i)){
                System.out.println(i+" ");
                count++;
            }
            i++;
        }
    }

    public static boolean check(int n) {
        if (n<2){
            return false;
        }
        for (int i =2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
