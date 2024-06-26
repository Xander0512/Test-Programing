package org.example.SOAL_NOMOR_02;

public class soal_02_b {
    public static void main(String[] args) {
        int n = 5;
        printNilai(n);
    }

    public static void printNilai(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

