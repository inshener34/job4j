package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int f = 0; f < data.length; f++) {
            if (data[1][1] != data[f][f] || data[1][1] != data[data.length - 1 - f][f]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
