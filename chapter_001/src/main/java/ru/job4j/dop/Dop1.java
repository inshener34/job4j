package ru.job4j.dop;

public class Dop1 {
    int[] isSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                break;
            }
        }
        return array;
    }
}