package org.example.SOAL_NOMOR_02;

public class soal_02_c {
    public static void main(String[] args) {
        int n = 5; // Ganti dengan nilai n yang diinginkan
        System.out.println(printNilai(n));
    }

    public static String printNilai(int n) {
        StringBuilder container = new StringBuilder();
        int cekking = 1;
        boolean flag = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                container.append(cekking);

                if (cekking == n) {
                    cekking--;
                    flag = false;
                } else if (cekking == 1 && !flag) {
                    cekking++;
                    flag = true;
                } else if (!flag) {
                    cekking--;
                } else if (flag) {
                    cekking++;
                }

                if (j == i) {
                    container.append("\n");
                    break;
                }
            }
        }

        return container.toString();
    }
}