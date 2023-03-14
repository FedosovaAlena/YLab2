package org.sequences;

public class SequencesImpl implements Sequences {

    @Override
    public void a(int n) {
        System.out.print("A. ");
        for (int i = 2; i < n * 2 + 1; i = i + 2) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
            if (i != (n * 2)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    @Override
    public void b(int n) {
        System.out.print("B. ");
        for (int i = 1; i < n * 2; i = i + 2) {
            System.out.print(i);
            if (i != (n * 2 - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    @Override
    public void c(int n) {
        System.out.print("C. ");
        for (int i = 1; i < n + 1; i++) {
            System.out.print(String.format("%.0f", Math.pow(i, 2)));
            if (i != (n)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    @Override
    public void d(int n) {
        System.out.print("D. ");
        for (int i = 1; i < n + 1; i++) {
            System.out.print(String.format("%.0f", Math.pow(i, 3)));
            if (i != (n)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    @Override
    public void e(int n) {
        System.out.print("E. ");
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0) {
                System.out.print(1);
            } else {
                System.out.print(-1);
            }
            if (i != (n)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    @Override
    public void f(int n) {
        System.out.print("F. ");
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            } else {
                System.out.print(-i);
            }
            if (i != (n)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    @Override
    public void g(int n) {
        System.out.print("G. ");
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0) {
                System.out.print(String.format("%.0f", Math.pow(i, 2)));
            } else {
                System.out.print(String.format("-%.0f", Math.pow(i, 2)));
            }
            if (i != (n)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    @Override
    public void h(int n) {
        System.out.print("H. ");
        int indicator = 1;
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0) {
                System.out.print(indicator);
                indicator++;
            } else {
                System.out.print(0);
            }
            if (i != (n)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    @Override
    public void i(int n) {
        System.out.print("I. ");
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                myArray[i] = (i + 1) * myArray[i - 1];
            } else {
                myArray[i] = i + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != (n - 1)) {
                System.out.print(myArray[i] + ", ");
            } else {
                System.out.print(myArray[i]);
            }
        }
        System.out.println();
    }

    @Override
    public void j(int n) {
        System.out.print("J. ");
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != 0 && i != 1) {
                myArray[i] = myArray[i - 2] + myArray[i - 1];
            } else {
                myArray[i] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != (n - 1)) {
                System.out.print(myArray[i] + ", ");
            } else {
                System.out.print(myArray[i]);
            }
        }
        System.out.println();
    }
}
