public class Pegawai {
    public String nama;
    public int masa_kerja_tahun, gaji_pokok;
    public double gaji_lembur;

    public Pegawai(String n, int m, int g, double l) {
        nama = n;
        masa_kerja_tahun = m;
        gaji_pokok = g;
        gaji_lembur = l;
    }

    public String nama() {
        return nama;
    }

    public double hitung_gaji_lembur() {
        if (masa_kerja_tahun < 5) {
            return 0.05 * gaji_pokok;
        } else {
            return 0.1 * gaji_pokok;
        }
    }

    public double hitung_tunjangan() {
        if (masa_kerja_tahun < 5) {
            return gaji_pokok * 0.25;
        } else {
            return gaji_pokok * 0.5;
        }
    }
    
    public double hitung_gaji_total() {
        return gaji_pokok + hitung_gaji_lembur() + hitung_tunjangan();
    }
}