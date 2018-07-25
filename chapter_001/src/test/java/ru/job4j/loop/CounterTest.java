package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public int add() {
        Counter counter = new Counter();
        counter.add(1);
        int expected = 30;
        assertThat(is(expected));
    }
}