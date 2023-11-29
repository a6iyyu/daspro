import java.util.Scanner;
public class Bank22 {
    public static void main(String[] args) {
        try (Scanner bank = new Scanner(System.in)) {
            int jml_tabungan_awal, lama_menabung;
            double jml_tabungan_akhir, bunga, presentase_bunga = 0.02;

            System.out.print("Masukkan nominal tabungan awal Anda: ");
            jml_tabungan_awal = bank.nextInt();
            System.out.print("Masukkan lama Anda menabung (bulan): ");
            lama_menabung = bank.nextInt();

            bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
            jml_tabungan_akhir = bunga + jml_tabungan_awal;

            System.out.println("Anda mendapatkan bunga sebesar: " + bunga);
            System.out.println("Jumlah tabungan akhir Anda adalah: " + jml_tabungan_akhir);
        }
    }
}