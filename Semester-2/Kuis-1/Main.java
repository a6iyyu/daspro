import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah pegawai: ");
            int jumlahPegawai = scanner.nextInt();
            scanner.nextLine();

            List<Pegawai> daftar_pegawai = new ArrayList<>();

            for (int i = 0; i < jumlahPegawai; i++) {
                System.out.println("\nMasukkan data pegawai ke-" + (i + 1) + ":");
                System.out.print("Masukkan nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan masa kerja tahun: ");
                int masa_kerja_tahun = scanner.nextInt();
                System.out.print("Masukkan jam lembur: ");
                double jam_lembur = scanner.nextDouble();
                System.out.print("Masukkan gaji pokok: ");
                int gaji_pokok = scanner.nextInt();

                Pegawai pegawai = new Pegawai(nama, masa_kerja_tahun, gaji_pokok, jam_lembur);
                daftar_pegawai.add(pegawai);
                scanner.nextLine();
            }

            System.out.println("\n=========================================");

            System.out.println("\nDaftar Gaji Pegawai:");
            for (int i = 0; i < jumlahPegawai; i++) {
                Pegawai pegawai = daftar_pegawai.get(i);
                System.out.println("Pegawai " + pegawai.nama() + " mendapatkan gaji total sebesar " + pegawai.hitung_gaji_total());
            }
        }
    }
}