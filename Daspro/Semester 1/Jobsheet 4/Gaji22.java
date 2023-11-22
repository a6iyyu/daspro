import java.util.Scanner;
public class Gaji22 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jumlah_masuk, jumlah_tidak_masuk, total_gaji;
            int gaji = 40000, potongan_gaji = 25000;

            System.out.println("Masukkan jumlah hari masuk kerja Anda: ");
            jumlah_masuk = input.nextInt();
            System.out.println("Masukkan jumlah hari tidak masuk kerja Anda: ");
            jumlah_tidak_masuk = input.nextInt();

            total_gaji = (jumlah_masuk * gaji) - (jumlah_tidak_masuk * potongan_gaji);
            System.out.println("Gaji yang Anda terima adalah " + total_gaji);
        }
    }
}