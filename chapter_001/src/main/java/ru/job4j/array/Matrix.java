package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int f = 0; f < size; f++) {
                table[i][f] = (i + 1) * (f + 1);
            }
        }
        return table;
    }
}
