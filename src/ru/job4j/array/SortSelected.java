package ru.job4j.array;

import java.util.Collections;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i <= data.length; i++) {
            if (i == data.length - 1) {
                break;
            }
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
