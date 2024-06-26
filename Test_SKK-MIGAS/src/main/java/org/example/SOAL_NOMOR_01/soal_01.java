package org.example.SOAL_NOMOR_01;

public class soal_01 {
    public static void main(String[] args) {
        int n = 15;
        printNumbers(n);
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print("OKYES ");
            } else if (i % 3 == 0) {
                System.out.print("OK ");
            } else if (i % 4 == 0) {
                System.out.print("YES ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
