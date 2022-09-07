package com.company;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Main {

    public static int random_() {
        return  (int) ((Math.random()-0.5)*100000000);
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = random_();
        }
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
