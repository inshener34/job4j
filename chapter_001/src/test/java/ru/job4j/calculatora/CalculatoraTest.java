package ru.job4j.calculatora;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatoraTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Сalculatora calc = new Сalculatora();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}