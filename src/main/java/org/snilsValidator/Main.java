package org.snilsValidator;

public class Main {
    public static void main(String[] args) {
        SnilsValidatorImpl snils = new SnilsValidatorImpl();
        Boolean valid = snils.validate("13449251761");
        if (valid) {
            System.out.println("Ваш СНИЛС валидный");
        } else {
            System.out.println("Ваш СНИЛС невалидный");
        }
    }
}