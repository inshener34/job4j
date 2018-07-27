package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
            int calc = 1;
            for (int f = 1; f <= n; f++) {
                calc *= f;
            }
            return calc;
    }
}



