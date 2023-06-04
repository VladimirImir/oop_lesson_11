package com.dev.lesson11;

/**
 * Laptop <- Computer -< Object
 * <p>
 * final - показывает что это константа и её нельзя переопределить.
 */

/**
 * final - показывает что это константа и её нельзя переопределить.
 */

/** Нельзя переопредилять static методы. */
public final class Laptop extends Computer {

    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
        /** super - ключевое слово через какое мы вызываем конструктор нашего базового класса. */
        /** super - ключевое слово через какое мы мы можем обращаться ко всему из базового класса. */
    }

    /**
     * @Override - эта аннотация показывает что метод переопределен из нашего базового класаа.
     */
    @Override
    public void load() {
        open();
        System.out.println("Я загрузился!");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Weight: " + weight);
    }

    public void open() {
        System.out.println("Открыл крышку!");
    }

    public int getWeight() {
        return weight;
    }
}
