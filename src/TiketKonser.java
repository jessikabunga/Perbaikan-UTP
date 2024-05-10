abstract class TiketKonser implements HargaTiket {
    // Do your magic here...

    /*
      Menggunakan variable 'protected' yang berarti hanya 
      bisa diakses di kelas turunan dari 'TiketKonser'
     */
    protected String namaTiket;

    // Konstruktor untuk menginisialisasi nilai 'namaTiket'
    public TiketKonser(String namaTiket) {
        this.namaTiket = namaTiket;
    }

    // Method untuk mengembalikan nilai 'namaTiket'
    public String getNamaTiket() {
        return namaTiket;
    }
 }