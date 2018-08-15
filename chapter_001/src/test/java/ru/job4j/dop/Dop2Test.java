package ru.job4j.dop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class Dop2Test {
    @Test
    public void WhenSort() {
        Dop1 turner = new Dop1();
        int[] input = new int[]{1, 2, 3, 4};
        int[] result = turner.sort(input);
        int[] expect = new int[]{1, 2, 3, 4};
        assertThat(result, is(expect));

    }
}