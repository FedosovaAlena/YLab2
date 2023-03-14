package org.complexNumber;

public class Main {
    public static void main(String[] args) {

        ComplexNumber a = new ComplexNumber(7.0, 3.0);
        ComplexNumber b = new ComplexNumber(-9.0, 2.0);
        ComplexNumber c = new ComplexNumber(5.0);

        System.out.println("Сложение: " + a.Addition(b));
        System.out.println("Вычитание: " + a.Subtraction(b));
        System.out.println("Умножение: " + a.Multiplication(b));
        System.out.println("Модуль: " + a.abs());
        System.out.println("Преобразование в строку c: " + b.toString());
    }
}