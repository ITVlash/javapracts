package com.company;

public class Shape {

        private String form;
        private int mass;
        private String color;

        public Shape() {
            this.form = "square";
            this.mass = 2;
            this.color = "green";
        }
        //Параметризированный конструктор
        public Shape(String form, int mass, String color) {
            this.form = form;
            this.mass = mass;
            this.color = color;
        }
        //Возврат полной информации о форме
        public String toString() {
            return "Информация о форме:" +
                    "\nФорма: " + this.form +
                    "\nМасса: " + this.mass +
                    "\nЦвет: " + this.color;
        }
        //Ввод отдельной информации о форме
        public void setForm(String form) {
            this.form = form;
        }
        public void setMass(int mass) {
            this.mass = mass;
        }
        public void setColor(String color) {
            this.color = color;
        }
        //Возврат отдельной информации о форме
        public String getForm() {
            return this.form;
        }
        public int getMass() {
            return this.mass;
        }
        public String getColor() {
            return this.color;
        }

}