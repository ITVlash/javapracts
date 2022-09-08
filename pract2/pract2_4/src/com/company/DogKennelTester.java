package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennelTester {
    public static void main(String[] args) {
        ArrayList<Dog> dgs = new ArrayList<>();
        //Добавим 2 собак:
        dgs.add(new Dog("Шарик", 3));
        dgs.add(new Dog("Чапа", 4));
        int exit = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Добавить информацию о ещё одной собаке(1) или нет(-1)?");
            exit = in.nextInt();
            if (exit != -1) {
                System.out.print("Кличка: ");
                String name = in.next();
                System.out.print("Возраст: ");
                int age = in.nextInt();
                dgs.add(new Dog(name, age));
            }
        } while (exit != -1);
        exit = 0;
        do {
            System.out.println("Узнайте информацию о собаке № 0..n или напишите -1, чтобы завершить программу");
            exit = in.nextInt();
            System.out.println(dgs.get(exit));
        } while (exit != -1);
        System.out.println(dgs);
    }
}
