package com.company;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Вводить информацию о книге? (1 - да; 0 - нет): ");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.print("Название: ");
            String name = in.next();

            System.out.print("Автор: ");
            String author = in.next();

            System.out.print("Год издания: ");
            int date = in.nextInt();

            System.out.print("Кол-во страниц: ");
            int pages = in.nextInt();

            Book bk = new Book(name, author, date, pages);
            System.out.println(bk.toString());
        } else {
            Book bk = new Book();
            System.out.println(bk.toString());
        }
    }
}
