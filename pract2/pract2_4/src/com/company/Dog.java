package com.company;

public class Dog {
    private String name;
    private int age;

    //Параметризированный конструктор
    public Dog(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    //Возврат полной информации о собаке
    public String toString() {
        return "Информация о собаке:" +
                "\nИмя: " + this.name +
                "\nВозраст: " + this.age +
                "\nЧеловеческий возраст: " + this.getHumanAge();
    }
    //Ввод информации о собаке
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Возврат отдельной информации о собаке
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getHumanAge() {
        return this.age * 7;
    }
}