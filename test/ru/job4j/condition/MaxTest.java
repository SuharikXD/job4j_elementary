package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100To22Then100() {
        int left = 100;
        int right = 22;
        int result = Max.max(left, right);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To233Then233() {
        int left = 1;
        int right = 233;
        int result = Max.max(left, right);
        int expected = 233;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax111To111Then111() {
        int left = 111;
        int right = 111;
        int result = Max.max(left, right);
        int expected = 111;
        Assert.assertEquals(result, expected);
    }
}