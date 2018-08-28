package ru.job4j.calculatora;

// простые программы по сложению. вычитанию. умножению и делению

public class Calculatora {
    private double result;
    public void add(double first, double second) {
        this.result = first + second;
    }
    public void subtract(double first, double second)  {
        this.result = first - second;
    }
    public void div(double first, double second) {
        this.result = first / second;
    }
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    public double getResult() {
        return this.result;
    }
}
