# Pengerjaan Test Programing Menggunakan Bahasa Java dan MySQL

## Author

Nama    : Alex Sander Hutapea
##
Tanggal : 26 Juni 2024

## Description
Pengerjaan test programing menggunakan bahasa java dan mySQL. Terdapat 4 package yang dimana package tersebut berisi codingan dari tiap soal yang telah dikerjan.

## Requirements

- Menggunakan openJDK 22 (Oracle OpenJDK 22.01)
- Intellij Idea

## How to run

1. Clone repository
2. Buka project pada Intellij Idea atau menggunakan Visual Studio Code yang telah terinstal JDK.
3. Jalankan aplikasi.


## Hasil keluaran ( Output ) dari soal no 1.
  
  - Command
    ```bash
    n = 15
    ```
  - Output
    ```bash
     1 2 OK YES 5 OK 7 YES OK 10 11 OKYES 13 14 OK
    ```

## Hasil keluaran ( Output ) dari soal no 2a.
  
  - Command
    ```bash
    n = 5
    ```
  - Output
    ```bash
    1
    22
    333
    4444
    55555
    ```
## Hasil keluaran ( Output ) dari soal no 2b.
  
  - Command
    ```bash
    n = 5
    ```
  - Output
    ```bash
    1 
    2 1 
    3 2 1 
    4 3 2 1 
    5 4 3 2 1
    ```

  ## Hasil keluaran ( Output ) dari soal no 2c.
  
  - Command
    ```bash
    n = 5
    ```
  - Output
    ```bash
    1
    23
    454
    3212
    34543
    ```
    
  ## Hasil keluaran ( Output ) dari soal no 2d.
  
  - Command
    ```bash
    n = 5
    ```
  - Output
    ```bash
    1 10 11 20 21 
    2 9 12 19 22 
    3 8 13 18 23 
    4 7 14 17 24 
    5 6 15 16 25
    ```
  ## Hasil keluaran ( Output ) dari soal no 3.
  
  - Command
    ```bash
    n = {12, 9, 13, 6, 10, 4, 7, 2}
    ```
  - Output
    ```bash
     n = [2, 4, 7, 10, 13]
    ```

  ## Hasil keluaran ( Output ) dari soal no 4.
  Untuk soal No. 4 menggunakan mySQL, query untuk membuat database : 
 ```bash   
 CREATE TABLE pelanggan (
    kode VARCHAR(11) PRIMARY KEY,
    nama VARCHAR(255),
    alamat VARCHAR(255)
);

 CREATE TABLE transaksi (
    kode VARCHAR(11) PRIMARY KEY,
    tanggal DATE,
    kode_pelanggan  VARCHAR(11),
    kode_barang  VARCHAR(11),
    jumlah_barang DOUBLE(255,0),
    FOREIGN KEY (kode_pelanggan) REFERENCES pelanggan(kode),
    FOREIGN KEY (kode_barang) REFERENCES barang(kode)
);
CREATE TABLE barang (
    kode VARCHAR(11) PRIMARY KEY,
    nama VARCHAR(255),
    harga DOUBLE(255, 0)
);
  ```

