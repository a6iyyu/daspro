import java.util.Scanner;
public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai_mahasiswa;
        int lulus = 0, tidak_lulus = 0, jumlah_nilai_lulus = 0;
        double total = 0, rata_nilai_lulus = 0, rata_nilai_tidak_lulus = 0;
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = sc.nextInt();
        nilai_mahasiswa = new int[n];
        for (int i = 0; i < nilai_mahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai_mahasiswa[i] = sc.nextInt();
        }
        for (int i = 0; i < nilai_mahasiswa.length; i++) {
            total += nilai_mahasiswa[i];
            if (nilai_mahasiswa[i] > 70) {
                jumlah_nilai_lulus += nilai_mahasiswa[i];
                lulus++;
            } else
                tidak_lulus++;
        }
        rata_nilai_lulus = jumlah_nilai_lulus / lulus;
        rata_nilai_tidak_lulus = (total - jumlah_nilai_lulus) / tidak_lulus;
        System.out.println("Rata-rata nilai lulus = " + rata_nilai_lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata_nilai_tidak_lulus);
        sc.close();
    }
}