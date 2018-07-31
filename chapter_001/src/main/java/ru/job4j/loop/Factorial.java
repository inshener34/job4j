package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
            int calc = 1;
            for (int f = 1; f <= n; f++) {
                calc *= f;
            }
            return calc;
    }
}



