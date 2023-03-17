package org.sequences;

import java.util.Scanner;
public class SequencesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int n = scanner.nextInt();

        SequencesImpl sequences = new SequencesImpl();
        sequences.a(n);
        sequences.b(n);
        sequences.c(n);
        sequences.d(n);
        sequences.e(n);
        sequences.f(n);
        sequences.g(n);
        sequences.h(n);
        sequences.i(n);
        sequences.j(n);
    }
}
