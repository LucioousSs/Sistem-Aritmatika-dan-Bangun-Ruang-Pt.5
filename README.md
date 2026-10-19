# Sistem Aritmatika dan Bangun Ruang

Aplikasi console Java untuk latihan OOP: perhitungan aritmatika dan menggambar bentuk dengan perulangan. Dibuat sebagai tugas mata kuliah.

## Fitur

Menu berjalan di console:

1. **Proses Aritmatika** — penjumlahan, pengurangan, perkalian, pembagian
2. **Proses Logika Bentuk** — menggambar bentuk dari karakter `*`
   - Kotak
   - Segitiga siku-siku
   - Segitiga sama kaki
   - Lingkaran
3. Keluar

## Struktur File

| File | Isi |
| --- | --- |
| `Looping.java` | Program utama, menu interaktif memakai `Scanner` |
| `kelasAritmatika.java` | Operasi hitung dasar |
| `kelasLogikabentuk.java` | Logika menggambar bentuk |
| `listMobil.java` | Latihan class dengan constructor dan method overloading |
| `classDiagram.java` | Memakai `listMobil` untuk menampilkan data mobil |

## Menjalankan

```bash
javac Looping.java kelasAritmatika.java kelasLogikabentuk.java
java Looping
```

Untuk latihan class mobil:

```bash
javac classDiagram.java listMobil.java
java classDiagram
```

## Catatan

File `.class` hasil kompilasi ikut ter-commit di repo ini. Sebaiknya ditambahkan ke `.gitignore` karena file itu dihasilkan ulang saat kompilasi.
