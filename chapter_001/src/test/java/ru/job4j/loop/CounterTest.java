package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int a = counter.add(0, 10);
        int expected = 30;
        assertThat(a, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFromOneToFiveToFifteenThenFifty() {
        Counter counter = new Counter();
        int a = counter.add(5, 15);
        int expected = 50;
        assertThat(a, is(expected));
    }
}