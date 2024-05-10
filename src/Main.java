/*
   Jessika Bunga Amalia
   235150701111005
   TI - A
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Do your magic here...
        Scanner input = new Scanner(System.in); // Objek untuk menerima input dari user

        System.out.println("Selamat datang di Pemesanan Tiket!");

        System.out.print("Masukkan nama pemesan: ");
        String nama = input.nextLine(); // Variable untuk menyimpan input 'nama'

        System.out.println("Pilih jenis tiket:");
        System.out.println("1. CAT8");
        System.out.println("2. CAT1");
        System.out.println("3. FESTIVAL");
        System.out.println("4. VIP");
        System.out.println("5. UNLIMITED EXPERIENCE");

        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt(); // Variable untuk menyimpan input 'pilihan'

        TiketKonser tiket = null; // Menginisialisasi variable 'tiket' bernilai null

        // Membuat objek berdasarkan pilihan yang dimasukkan oleh user
        switch (pilihan) {
            case 1:
                tiket = new CAT8();
                break;
            case 2:
                tiket = new CAT1();
                break;
            case 3:
                tiket = new FESTIVAL();
                break;
            case 4:
                tiket = new VIP();
                break;
            case 5:
                tiket = new VVIP();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0); // User akan keluar dari program apabila pililhan tidak valid
        }

        // Membuat objek baru dalam 'PemesananTiket' dengan parameter 'nama' dan 'tiket'
        PemesananTiket pesanan = new PemesananTiket(nama, tiket);
        pesanan.cetakNotaPemesanan(); // Memanggil method 'cetakNotaPemesanan'

        input.close();
    }


    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}