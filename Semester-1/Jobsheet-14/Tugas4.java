import java.util.Scanner;
public class Tugas4 {
    static int hitung_pasangan_marmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else if (bulan < 1) {
            return 0;
        } else {
            return hitung_pasangan_marmut(bulan - 2) + hitung_pasangan_marmut(bulan - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bulan: ");
        int bulan = sc.nextInt();
        System.out.println("========================================================================================");
        System.out.println("|Bulan|\t\t|Pasangan Produktif|\t|Pasangan Belum produktif|\t|Total Pasangan|");
        System.out.println("========================================================================================");
        for (int i = 0; i <= bulan; i++) {
            int total = hitung_pasangan_marmut(i);
            int jumlah_pasangan = hitung_pasangan_marmut(i - 1);
            int belum_produktif = hitung_pasangan_marmut(i - 2);
            sc.close();
            System.out.println(i + "\t\t\t" + belum_produktif + "\t\t\t" + jumlah_pasangan + "\t\t\t" + total);
        }
    }
}