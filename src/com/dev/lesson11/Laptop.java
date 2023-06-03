package com.dev.lesson11;

public class Laptop extends Computer {

    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
        /** super - ключевое слово через какое мы вызываем конструктор нашего базового класса. */
        /** super - ключевое слово через какое мы мы можем обращаться ко всему из базового класса. */
    }

    public void open() {
        System.out.println("Открыл крышку!");
    }

    public int getWeight() {
        return weight;
    }
}
