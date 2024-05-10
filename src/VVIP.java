public class VVIP extends TiketKonser {
  //Do your magic here...

  // Konstruktor untuk memanggil konstruktor dari super class 'TiketKonser'
  public VVIP() {
    super("UNLIMITED EXPERIENCE");
  }

  // Method untuk mengembalikan nilai harga tiket VVIP
  public double getHarga() {
    return 3.98;
  }
}