package ru.job4j.max;

public class Max {
    public int max(int first, int second) {
        int max = first > second ? first : second;
        return max;
    }
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}