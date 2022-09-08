package com.company;

import java.lang.Math;

public class Ball {
    private int radius;
    private int mass;
    private String color;

    public Ball() {
        this.radius = 3;
        this.mass = 2;
        this.color = "red";
    }
    //Параметризированный конструктор
    public Ball(int radius, int mass, String color) {
        this.radius = radius;
        this.mass = mass;
        this.color = color;
    }
    //Возврат полной информации о мяче
    public String toString() {
        return "Информация о мяче:" +
                "\nРадиус: " + this.radius +
                "\nМасса: " + this.mass +
                "\nЦвет: " + this.color +
                "\nОбъём: " + this.getSphereVolume();
    }
    //Ввод отдельной информации о мяче
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //Возврат отдельной информации о мяче
    public int getRadius() {
        return this.radius;
    }
    public int getMass() {
        return this.mass;
    }
    public String getColor() {
        return this.color;
    }
    public double getSphereVolume() {
        System.out.println(4/3);
        return (4.0/3)*(Math.PI)*(Math.pow(this.radius, 3));
    }
}
