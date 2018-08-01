package ru.job4j.array;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculatora(bound);
        int[] expect = new int[] {1, 4, 9 };
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculatora(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25 };
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound5Then14916253649() {
        int bound = 7;
        Square square = new Square();
        int[] rst = square.calculatora(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36, 49 };
        assertThat(rst, is(expect));
    }


}