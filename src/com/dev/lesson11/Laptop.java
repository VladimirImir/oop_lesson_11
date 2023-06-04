package com.dev.lesson11;

/**
 * Laptop <- Computer -< Object
 */

public class Laptop extends Computer {

    private int weight;

    {
        System.out.println("init block laptop");
    }

    static {
        System.out.println("static block laptop");
    }

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super();
        this.weight = weight;
        /** super - ключевое слово через какое мы вызываем конструктор нашего базового класса. */
        /** super - ключевое слово через какое мы мы можем обращаться ко всему из базового класса. */
    }

    public Laptop() {
        System.out.println("Constructor laptop!");
    }

    public void open() {
        System.out.println("Открыл крышку!");
    }

    public int getWeight() {
        return weight;
    }
}
