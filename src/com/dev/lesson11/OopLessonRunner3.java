package com.dev.lesson11;

public class OopLessonRunner3 {

    public static void main(String[] args) {
        /**Computer laptop = new Laptop(new Ssd(512), new Ram(1024), 2);
         laptop.load();
         System.out.println();
         Computer mobile = new Mobile(new Ssd(128), new Ram(256));
         mobile.load();*/

        double value = 2.5;
        int intValue = (int) value;

        Computer laptop = new Laptop(new Ssd(512), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(128), new Ram(256));

        Laptop laptop1 = new Laptop(new Ssd(4096), new Ram(8192), 5);

        //loadComputer(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile, laptop1});
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            /** Ключевое слово instanceof - Проверка принадлежности к классу */
            /** Ключевое слово instanceof - Проверка ведет ли ссылка computer на объект типа Laptop. */
            if (computer instanceof Laptop) {
                Laptop laptop = (Laptop) computer;
                laptop.open();
            }
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
