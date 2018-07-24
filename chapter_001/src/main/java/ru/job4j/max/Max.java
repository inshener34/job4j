package ru.job4j.max;

public class Max {
    public int max(int first, int second) {
        int maxim = first > second ? first : second;
        return maxim;
    }
    public int max(int first, int second, int third){
        int temp = this.max(first, second);
        temp = Math.max(Math.max(first, second), Math.max(second, third));
        return temp;
    }
}