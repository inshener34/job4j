package ru.job4j.array;

// Заполнить массив степенями чисел

public class Square {
    public int[] calculatora(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}




