package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int middle) {
        return left > max(left, middle) ? left : max(left, middle);
    }

    public static void main(String[] args) {
        int rsl = Max.max(21, 22);
        System.out.println(rsl);
    }
}
