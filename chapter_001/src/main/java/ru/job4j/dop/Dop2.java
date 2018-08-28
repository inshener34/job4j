package ru.job4j.dop;

public class Dop2 {
    public void merge(int[] left, int[] right) {
        int[] a = {};
        int[] b = {};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < c.length / 2; i++) {
            if (a[i] > b[i]) {
                c[i + i] = b[i];
                c[i + i + 1] = a[i];
            } else {
                c[i + i] = a[i];
                c[i + i + 1] = b[i];
            }
        }
        for (int i = 0; i < c.length - 1; i++) {
            int t = c[i];
            if (c[i] > c[i + 1]) {
                c[i] = c[i + 1];
                c[i + 1] = t;
            }
        }
    }
}