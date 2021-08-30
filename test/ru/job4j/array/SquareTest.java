package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void bound4() {
        int[] expected = new int[] {0, 1, 4, 9};
        int[] result = Square.calculate(4);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void bound5() {
        int[] expected = new int[] {0, 1, 4, 9, 16};
        int[] result = Square.calculate(5);
        Assert.assertArrayEquals(expected, result);
    }

}