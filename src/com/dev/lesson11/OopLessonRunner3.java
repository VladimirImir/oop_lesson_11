package com.dev.lesson11;

public class OopLessonRunner3 {

    public static void main(String[] args) {
        /**Computer laptop = new Laptop(new Ssd(512), new Ram(1024), 2);
        laptop.load();
        System.out.println();
        Computer mobile = new Mobile(new Ssd(128), new Ram(256));
        mobile.load();*/

        Computer laptop = new Laptop(new Ssd(512), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(128), new Ram(256));

        loadComputer(laptop,mobile);
        printInformation(new Computer[]{laptop,mobile});
    }

    public static void printInformation(Computer[] computers){
        for (Computer computer : computers) {
            computer.print();
            System.out.println();
        }
    }

    public static void loadComputer(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
