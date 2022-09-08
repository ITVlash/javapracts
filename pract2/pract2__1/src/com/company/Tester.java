package com.company;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Вводить информацию о фигуре? (1 - да; 0 - нет): ");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.print("Форма: ");
            String form = in.next();

            System.out.print("Масса: ");
            int mass = in.nextInt();

            System.out.print("Цвет: ");
            String color = in.next();

            Shape Fig = new Shape(form, mass, color);
            System.out.println(Fig.toString());
        }
        else {
            Shape Fig = new Shape();
            System.out.println(Fig.toString());
        }
    }
}
