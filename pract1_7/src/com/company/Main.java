package com.company;
import java.util.Scanner;

public class Main {

    public static int fac(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return (result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(fac(a));
    }
}
