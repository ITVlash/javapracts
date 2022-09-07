package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] integers = new int[10];
        int summaFor, summaWhile, summaDoWhile;
        summaFor = 0;
        summaWhile = 0;
        summaDoWhile = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < integers.length; i++) {
            System.out.print("Enter " + (int)(i+1) + " element: ");
            integers[i] = in.nextInt();
            summaFor += integers[i];
        }
        System.out.println("For: " + summaFor);

        int i = 0;
        while (i < integers.length) {
            System.out.print("Enter " + (int)(i+1) + " element: ");
            integers[i] = in.nextInt();
            summaWhile += integers[i];
            i++;
        }
        System.out.println("While: " + summaWhile);

        i = 0;
        do {
            System.out.print("Enter " + (int)(i+1) + " element: ");
            integers[i] = in.nextInt();
            summaDoWhile += integers[i];
            i++;
        } while(i < integers.length);
        System.out.println("Do while: " + summaDoWhile);
    }
}
