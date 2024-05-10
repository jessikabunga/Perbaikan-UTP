public class VIP extends TiketKonser {
    //Do your magic here...

    // // Konstruktor untuk memanggil konstruktor dari super class 'TiketKonser'
    public VIP() {
        super("VIP");
    }

    // Method untuk mengembalikan nilai harga tiket VIP
    public double getHarga() {
        return 3.56;
    }
 }