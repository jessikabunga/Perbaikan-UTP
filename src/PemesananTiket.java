class PemesananTiket {
    // Do your magic here...

    // Menggunakan deklarasi private yang berarti objek hanya bisa diakses di kelas ini
    private String namaPemesan;
    private TiketKonser tiket;
    private String kodeBooking;
    private String tanggalPemesanan;

    // Konstruktor dengan parameter 'namaPemesan' dan 'tiket'
    public PemesananTiket(String namaPemesan, TiketKonser tiket) {
        this.namaPemesan = namaPemesan;
        this.tiket = tiket;
        this.kodeBooking = Main.generateKodeBooking(); // Memanggil method dari kelas Main
        this.tanggalPemesanan = Main.getCurrentDate(); // Memanggil method dari kelas Main
    }

    // Method untuk mencetak nota
    public void cetakNotaPemesanan() {
        System.out.println("\n----- Detail Pemesanan -----");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Kode Booking: " + kodeBooking);
        System.out.println("Tanggal Pesanan: " + tanggalPemesanan);
        System.out.println("Tiket Yang Dipesan: " + tiket.getNamaTiket());
        System.out.println("Total Harga: " + tiket.getHarga() + " USD");
    }
  }