package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean example = data[0];

        for (int index = 0; index < data.length - 1; index++) {
            if (example != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
