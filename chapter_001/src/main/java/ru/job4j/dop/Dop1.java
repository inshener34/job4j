package ru.job4j.dop;

public class Dop1 {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                break;
            }
        }
        return array;
    }
}