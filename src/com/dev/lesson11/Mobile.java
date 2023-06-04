package com.dev.lesson11;

/**
 * public class Mobile extends Laptop - так как класс Laptop final - мы его не можем наследовать.
 */
public class Mobile extends Computer {

    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("Я включился!");
    }
}
