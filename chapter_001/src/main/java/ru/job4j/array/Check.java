package ru.job4j.array;

// Массив заполнен true или false

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int f = 1; f < data.length; f++) {
            if (data[f] != data[f - 1]) {
                result = false;
                break;
            }
  }
        return result;
    }
}