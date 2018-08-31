package ru.job4j.dop;

public class Dop1 {
    public static boolean isSorted(int[] a, boolean array) {
        if (array == false) {
            for (int i = 0; i < a.length - 1; ++i) {
                if (a[i] > a[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < a.length - 1; ++i) {
                if (a[i] < a[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}