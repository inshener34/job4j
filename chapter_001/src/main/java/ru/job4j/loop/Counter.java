package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int add = 1;
        for (int i = 0; i <= 10; i -= 2) {
            add += i;
        }
        return add;
    }
}