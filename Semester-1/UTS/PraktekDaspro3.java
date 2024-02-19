import java.util.Scanner;
public class PraktekDaspro3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah mahasiswa: ");
            byte jumlah_mahasiswa = input.nextByte();
            int i = 1;
            while (i <= jumlah_mahasiswa) {
                System.out.print("Masukkan nilai tes potensi akademik (0 - 100): ");
                double tpa = input.nextDouble();
                System.out.print("Masukkan nilai tes bahasa Inggris (0 - 100): ");
                double bing = input.nextDouble();
                System.out.print("Masukkan nilai tes wawancara (0 - 100): ");
                double wawancara = input.nextDouble();

                if (tpa < 0 || tpa > 100 || bing < 0 || bing > 100 || wawancara < 0 || wawancara > 100) {
                    System.out.println("Error: Salah memasukkan nilai!");
                } else {
                    double nilai_akhir = (tpa + bing + wawancara) / 3;
                    System.out.println("Nilai akhir mahasiswa/i ke-" + i++ + " adalah " + nilai_akhir + ".\n");
                }
            } i++;
        }
    }
}