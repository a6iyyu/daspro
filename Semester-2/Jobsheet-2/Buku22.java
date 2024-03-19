public class Buku22 {
    String judul, pengarang;
    int halaman, stok, harga;
    void TampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);

    }
    void Terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Jumlah stok habis");
        }
    }
    void Restock(int jml) {
        stok += jml;
    }
    void GantiHarga(int hrg) {
        harga = hrg;
    }
    int HitungHargaTotal(int jml) {
        return harga * jml;
    }
    int HitungDiskon(int jml) {
        int diskon = 0;
        int hargaTotal = HitungHargaTotal(jml);
        if (hargaTotal > 150000) {
            diskon = (int) (0.12 * hargaTotal);
        } else if (hargaTotal < 150000 && hargaTotal >= 75000) {
            diskon = (int) (0.05 * hargaTotal);
        } else
            diskon = 0;
        return diskon;
    }
    int HitungHargaBayar(int jml) {
        return HitungHargaTotal(jml) - HitungDiskon(jml);
    }
    public Buku22(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
        
    }
}