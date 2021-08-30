package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Semen Semenov";
        names[1] = "Ivan Ivanov";
        names[2] = "Alexey Pokrov";
        names[3] = "Evgeny Simonov";

        System.out.println("Первое имя: " + names[0]);
        System.out.println("Второе имя: " + names[1]);
        System.out.println("Третье имя: " + names[2]);
        System.out.println("Четвертое имя: " + names[3]);

        System.out.println("Размер массива равен ages: " + ages.length);
        System.out.println("Размер массива равен surnames: " + surnames.length);
        System.out.println("Размер массива равен prices: " + prices.length);
    }
}