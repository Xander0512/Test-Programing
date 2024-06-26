package org.example.SOAL_NOMOR_02;

public class soal_02_d {
    public static void main(String[] args) {
        int n = 5; // Ubah nilai n sesuai keinginan
        printPattern(n);
    }

    public static void printPattern(int n) {
        int[][] matrix = new int[n][n];
        int value = 1;

        // Mengisi matriks dengan nilai sesuai pola yang diminta
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // Baris ganjil
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = value++;
                }
            } else { // Baris genap
                for (int j = n - 1; j >= 0; j--) {
                    matrix[j][i] = value++;
                }
            }
        }

        // Mencetak matriks ke layar sesuai format
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
