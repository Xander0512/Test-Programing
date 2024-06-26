/* BAGIAN a */



SELECT kode, nama, harga
FROM barang
WHERE harga > 10000
ORDER BY harga ASC;

/* BAGIAN b */

SELECT kode, nama, alamat
FROM pelanggan
WHERE nama LIKE '%g%' AND alamat = 'Bandung';


/* BAGIAN c */

SELECT
    t.kode AS kode_transaksi,
    t.tanggal AS tanggal_transaksi,
    p.nama AS nama_pelanggan,
    b.nama AS nama_barang,
    t.jumlah_barang,
    b.harga AS harga_satuan,
    t.jumlah_barang * b.harga AS total_harga
FROM
    transaksi t
        JOIN
    pelanggan p ON t.kode_pelanggan = p.kode
        JOIN
    barang b ON t.kode_barang = b.kode;



/* BAGIAN d */
SELECT
    p.nama AS nama_pelanggan,
    SUM(t.jumlah_barang) AS total_barang,
    SUM(t.jumlah_barang * b.harga) AS total_harga
FROM
    transaksi t
        JOIN
    pelanggan p ON t.kode_pelanggan = p.kode
        JOIN
    barang b ON t.kode_barang = b.kode
GROUP BY
    p.nama;
