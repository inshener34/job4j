package ru.job4j.dop;

public class Dop2 {
    public static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int fstIndex = 0;
        int sndIndex = 0;
        int index = 0;

        while (fstIndex < first.length && sndIndex < second.length) {

            if (first[fstIndex] < second[sndIndex]) {
                result[index] = first[fstIndex];
                fstIndex++;
            } else {
                result[index] = second[sndIndex];
                sndIndex++;
            }
            index++;
        }

        while (fstIndex < first.length) {
            result[index] = first[fstIndex];
            fstIndex++;
            index++;
        }

        while (sndIndex < second.length) {
            result[index] = second[sndIndex];
            sndIndex++;
            index++;
        }
        return result;
    }
}