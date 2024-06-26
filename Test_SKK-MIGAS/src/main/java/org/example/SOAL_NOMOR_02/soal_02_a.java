package org.example.SOAL_NOMOR_02;

public class soal_02_a {

    public static void main(String[] args) {
        int n = 5;
       printNilai(n);
    }
    public static void printNilai(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
