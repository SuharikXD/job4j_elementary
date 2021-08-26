package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void dayMonday() {
        String name = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void dayMonday2() {
        String name = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void dayFriday() {
        String name = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

}