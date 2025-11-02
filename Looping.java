import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        int pilihan;
        int prosesAritmatika;
        int prosesLogikaBentuk;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Proses Aritmatika");
            System.out.println("2. Proses Logika Bentuk");
            System.out.println("3. keluar");
            System.out.print("masukan pilihan anda: ");
            pilihan = scanner.nextInt();

        if (pilihan == 1) {
            do {
                System.out.println("Anda memilih Proses Aritmatika:");
                System.out.println("1. Penambahan 2 bilangan");
                System.out.println("2. Pengurangan 2 bilangan");
                System.out.println("3. Perkalian 2 bilangan");
                System.out.println("4. Pembagian 2 bilangan");
                System.out.println("5. Kembali ke menu utama");

                System.out.print("masukan pilihan anda: ");
                prosesAritmatika = scanner.nextByte();
                    
                switch (prosesAritmatika) {
                case 1:
                System.out.print("Masukan bilangan pertama: ");
                int a = scanner.nextInt();
                System.out.print("Masukan bilangan kedua: ");
                int b = scanner.nextInt();
                int hasil = a + b;
                System.out.println("Hasil dari penambahan " + a + " + " + b + " = " + hasil);
                break;
                case 2:
                System.out.print("Masukan bilangan pertama: ");
                int c = scanner.nextInt();
                System.out.print("Masukan bilangan kedua: ");
                int d = scanner.nextInt();
                int hasil2 = c - d;
                System.out.println("Hasil dari pengurangan " + c + " - " + d + " = " + hasil2);
                break;
                case 3:
                System.out.print("Masukan bilangan pertama: ");
                int e = scanner.nextInt();
                System.out.print("Masukan bilangan kedua: ");
                int f = scanner.nextInt();
                int hasil3 = e * f;
                System.out.println("Hasil dari perkalian " + e + " * " + f + " = " + hasil3);
                break;
                case 4:
                System.out.print("Masukan bilangan pertama: ");
                int g = scanner.nextInt();
                System.out.print("Masukan bilangan kedua: ");
                int h = scanner.nextInt();
                int hasil4 = g / h;
                System.out.println("Hasil dari pembagian " + g + " / " + h + " = " + hasil4);
                break;
                default:
                if (prosesAritmatika != 5) {
                    System.out.println("Terima kasih");
                }
            }

            } while (prosesAritmatika != 5);
        } else if (pilihan == 2) {
            do {
                System.out.println("Anda memilih Proses Logika Bentuk:");
                System.out.println("1. Cetak Kotak");
                System.out.println("2. Cetak Segitiga Siku-Siku");
                System.out.println("3. Cetak Segitiga Sama Sisi");
                System.out.println("4. Cetak Lingkaran");
                System.out.println("5. Kembali ke menu utama");

                System.out.print("masukan pilihan anda: ");
                prosesLogikaBentuk = scanner.nextByte();
                switch (prosesLogikaBentuk) {
                    case 1:
                        kelasLogikabentuk KlB = new kelasLogikabentuk();
                        System.out.print ("Masukkan N: ");
                        int n = scanner.nextByte();
                        KlB.bentukKotak(n);
                        break;
                        // System.out.print("Masukan ukuran sisi kotak: ");
                        // int sisi = scanner.nextInt();
                        // for (int i = 0; i < sisi; i++) {
                        //     for (int j = 0; j < sisi; j++) {
                        //         System.out.print("* ");
                        //     }
                        //     System.out.println();
                        // }
                        // break;
                    case 2:
                        kelasLogikabentuk KlS = new kelasLogikabentuk();
                        System.out.print ("Masukkan N: ");
                        int a = scanner.nextByte();
                        KlS.bentukSegitigasiku(a);
                        break; 

                        // System.out.print("Masukan tinggi segitiga siku-siku: ");
                        // int tinggi = scanner.nextInt();
                        // for (int i = 1; i <= tinggi; i++) {
                        //     for (int j = 1; j <= i; j++) {
                        //         System.out.print("* ");
                        //     }
                        //     System.out.println();
                        // }
                        // break;
                    case 3:
                        kelasLogikabentuk KlSs = new kelasLogikabentuk();
                        System.out.print ("Masukkan N: ");
                        int b = scanner.nextByte();
                        KlSs.bentukSegitigakaki(b);

                        // System.out.print("Masukan tinggi segitiga sama sisi: ");
                        // int tinggiSamaSisi = scanner.nextInt();
                        // for (int i = 1; i <= tinggiSamaSisi; i++) {
                        //     for (int j = i; j < tinggiSamaSisi; j++) {
                        //         System.out.print(" ");
                        //     }
                        //     for (int k = 1; k <= (2 * i - 1); k++) {
                        //         System.out.print("*");
                        //     }
                        //     System.out.println();
                        // }
                        break;
                    case 4:
                         System.out.print("Masukan jari-jari lingkaran: ");
                            int radius = scanner.nextInt();
                            for (int y = -radius; y <= radius; y++) {
                                for (int x = -radius; x <= radius; x++) {
                                    if (x * x + y * y <= radius * radius) {
                                        System.out.print("* ");
                                    } else {
                                        System.out.print("  ");
                                    }
                                }
                                System.out.println();
                            }
                        }
            } while (prosesLogikaBentuk != 5);
        } else if (pilihan == 3) {
            System.out.println("Terima kasih telah menggunakan program ini.");
            break;
        }
    }
}
}