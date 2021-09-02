package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int index2 = count; index2 < array.length; index2++) {
                    if (array[index2] != null) {
                        int point2 = index2;
                        String temp = array[point];
                        array[point] = array[point2];
                        array[point2] = temp;
                        break;
                    }
                }

            }
            count++;
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}