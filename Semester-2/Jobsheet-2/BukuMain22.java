public class BukuMain22 {
    public static void main(String[] args) {
        Buku22 bk2 = new Buku22("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.TampilInformasi();
        System.out.println("Harga yang terjual: " + bk2.HitungHargaTotal(5));
        System.out.println("Diskon: " + bk2.HitungDiskon(5));
        System.out.println("Harga Bayar: " + bk2.HitungHargaBayar(5));
    }
}