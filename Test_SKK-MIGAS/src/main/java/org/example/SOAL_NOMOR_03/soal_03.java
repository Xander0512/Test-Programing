package org.example.SOAL_NOMOR_03;

import java.util.ArrayList;
import java.util.Collections;

public class soal_03 {
    public static void main(String[] args) {
        int[] n = {12, 9, 13, 6, 10, 4, 7, 2};
        int[] result = removeMultiplesOfThree(n);

        // Cetak hasil akhir
        System.out.print("n = [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] removeMultiplesOfThree(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        // Memasukkan nilai yang bukan kelipatan tiga ke dalam ArrayList
        for (int value : arr) {
            if (value % 3 != 0) {
                list.add(value);
            }
        }

        // Mengurutkan ArrayList secara ascending
        Collections.sort(list);

        // Mengubah ArrayList menjadi array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
