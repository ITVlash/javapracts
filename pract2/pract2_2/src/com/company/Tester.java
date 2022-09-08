package com.company;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Вводить информацию о мяче? (1 - да; 0 - нет): ");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.print("Радиус: ");
            int radius = in.nextInt();

            System.out.print("Масса: ");
            int mass = in.nextInt();

            System.out.print("Цвет: ");
            String color = in.next();

            Ball bl = new Ball(radius, mass, color);
            System.out.println(bl.toString());
        } else {
            Ball bl = new Ball();
            System.out.println(bl.toString());
        }
    }
}
