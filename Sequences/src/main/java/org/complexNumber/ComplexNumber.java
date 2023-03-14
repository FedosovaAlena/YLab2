package org.complexNumber;

public class ComplexNumber {
    public double real;
    public double imaginary;

    ComplexNumber(double real) {
        this.real = real;
    }

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber Addition(ComplexNumber complex) {
        ComplexNumber complex_new = this;
        double real_new = complex_new.real + complex.real;
        double imag_new = complex_new.imaginary + complex.imaginary;
        return new ComplexNumber(real_new, imag_new);
    }

    public ComplexNumber Subtraction(ComplexNumber complex) {
        ComplexNumber complex_new = this;
        double real_new = complex_new.real - complex.real;
        double imag_new = complex_new.imaginary - complex.imaginary;
        return new ComplexNumber(real_new, imag_new);
    }

    public ComplexNumber Multiplication(ComplexNumber complex) {
        ComplexNumber complex_new = this;
        double real_new = complex_new.real * complex.real - complex_new.imaginary * complex.imaginary;
        double imag_new = complex_new.real * complex.imaginary + complex_new.imaginary * complex.real;
        return new ComplexNumber(real_new, imag_new);
    }

    public ComplexNumber Modulus(ComplexNumber complex) {
        ComplexNumber complex_new = this;
        double real_new = complex_new.real * complex.real - complex_new.imaginary * complex.imaginary;
        double imag_new = complex_new.real * complex.imaginary + complex_new.imaginary * complex.real;
        return new ComplexNumber(real_new, imag_new);
    }

    public double abs() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public String toString() {
        if (imaginary == 0) return real + "";
        if (real == 0) return imaginary + "i";
        if (imaginary < 0) return real + " - " + (-imaginary) + "i";
        return real + " + " + imaginary + "i";
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
}
