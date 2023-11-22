import java.util.Scanner;
public class PraktekDaspro2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nilai tes potensi akademik (0 - 100): ");
            double tpa = input.nextDouble();
            System.out.print("Masukkan nilai tes bahasa Inggris (0 - 100): ");
            double bing = input.nextDouble();
            System.out.print("Masukkan nilai tes wawancara (0 - 100): ");
            double wawancara = input.nextDouble();
            double nilai_akhir = (tpa + bing + wawancara) / 3;
            System.out.println("Mahasiswa/i tersebut mendapatkan nilai akhir sebesar " + nilai_akhir);

            if (tpa < 0 || tpa > 100 || bing < 0 || bing > 100 || wawancara < 0 || wawancara > 100) {
                System.out.println("Error: Salah memasukkan nilai!");
            } else if (bing > 70 && wawancara > 80) {
                System.out.println("Mahasiswa/i tersebut masuk di jurusan Sistem Informasi.");
            } else if (tpa > 70 && bing > 70 && wawancara > 70 || tpa == 100 || bing == 100 || wawancara == 100) {
                System.out.println("Mahasiswa/i tersebut masuk di jurusan Ilmu Komputer.");
            } else if (nilai_akhir >= 75 && bing < 50) {
                System.out.println("Mahasiswa/i tersebut masuk di jurusan Bisnis Manajemen.");
            } else if (tpa > 60 || tpa == 100 && bing == 100) {
                System.out.println("Mahasiswa/i tersebut masuk di jurusan Teknik Informatika.");
            } else {
                System.out.println("Maaf, Anda tidak masuk ke jurusan manapun.");
            }
        }
    }
}