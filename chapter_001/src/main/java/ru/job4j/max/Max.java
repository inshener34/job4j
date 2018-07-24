package ru.job4j.max;

public class Max {
    public int max(int first, int second) {
        int max = first > second ? first : second;
        return max;
    }
    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        temp = max (max(first, second), max(second, third));
        return temp;
    }
}