public class BukuMain22 {
    public static void main(String[] args) {
        // Buku22 bk1 = new Buku22();
        // bk1.judul = "Today Ends Tomorrow Comes";
        // bk1.pengarang = "Denanda Pratiwi";
        // bk1.halaman = 198;
        // bk1.stok = 13;
        // bk1.harga = 71000;

        // bk1.TampilInformasi();
        // bk1.Terjual(5);
        // bk1.GantiHarga(60000);
        // bk1.TampilInformasi();

        Buku22 bk2 = new Buku22("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.TampilInformasi();
        System.out.println("Harga yang terjual: " + bk2.HitungHargaTotal(5));
        System.out.println("Diskon: " + bk2.HitungDiskon(5));
        System.out.println("Harga bayar: " + bk2.HitungHargaBayar(5));

        // Buku22 rafi = new Buku22("About Star", "Rafi", 256, 20, 88000);
        // rafi.Terjual(18);
        // rafi.TampilInformasi();
    }
}