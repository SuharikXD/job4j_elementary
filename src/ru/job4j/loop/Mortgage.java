package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double amountPercent;
        while (amount >= 0) {
            amountPercent = amount * (percent / 100);
            amount += amountPercent;
            amount -= salary;
            year++;
        }
        return year;
    }
}
