package com.dev.lesson11;

public abstract class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        super();
        this.ssd = ssd;
        this.ram = ram;
    }


    public abstract void load();

    public void print() {
        System.out.println("Ssd: " + ssd.getValue() + ", Ram: " + ram.getValue());
    }

    /*public void load() {
        System.out.println("Я загрузился!");
    }*/

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
