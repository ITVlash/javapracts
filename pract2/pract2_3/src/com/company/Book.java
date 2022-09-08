package com.company;

import java.lang.Math;

public class Book {
    private String name;
    private String author;
    private int date;
    private int pages;

    public Book() {
        this.name = "Тестовая книга";
        this.author = "Неизвестен";
        this.date = 2005;
        this.pages = 193;
    }
    //Параметризированный конструктор
    public Book(String name, String author, int date, int pages) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.pages = pages;
    }
    //Возврат полной информации о мяче
    public String toString() {
        return "Информация о книге:" +
                "\nНазвание: " + this.name +
                "\nАвтор: " + this.author +
                "\nГод издания: " + this.date +
                "\nКол-во страниц: " + this.pages;
    }
    //Ввод отдельной информации о мяче
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    //Возврат отдельной информации о мяче
    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getDate() {
        return this.date;
    }
    public int getPages() {
        return this.pages;
    }
}
