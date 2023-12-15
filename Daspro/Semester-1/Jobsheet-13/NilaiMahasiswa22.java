import java.util.Scanner;
public class NilaiMahasiswa22 {
    static Scanner sc = new Scanner(System.in);
    static String[] nama_mahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
    static double[][] nilai_mahasiswa = new double[5][7];
    static void input_nilai() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nilai Mahasiswa atas nama " + nama_mahasiswa[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilai_mahasiswa[i][j] = sc.nextDouble();
            }
        }
    }
    static void data_nilai_mahasiswa() {
        System.out.println("Nilai Tugas Lima Mahasiswa dari Minggu 1 hingga 7 berturut-turut :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Mahasiswa " + nama_mahasiswa[i] + "\t: ");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilai_mahasiswa[i][j] + ", ");
            } System.out.println();
        }
    }
    static int mingguTertinggi() {
        double nilaiTertinggi = 0;
        int MingguTertinggi = 0;
        for (int j = 0; j < 7; j++) {
            double totalNilaiMinggu = 0;
            for (int i = 0; i < 5; i++) {
                totalNilaiMinggu += nilai_mahasiswa[i][j];
            }
            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                MingguTertinggi = j;
            }
        } return MingguTertinggi;
    }
    public static void main(String[] args) {
        input_nilai();
        System.out.println();
        data_nilai_mahasiswa();
        printNilaiTertinggiMhswa();
    }
    static void printNilaiTertinggiMhswa() {
        double nilaiTertinggi = 0;
        int Mhswa = 0;
        int Minggu = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilai_mahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai_mahasiswa[i][j];
                    Mhswa = i;
                    Minggu = j;
                }
            }
        }
        System.out.println("\nNilai tertinggi diperoleh mahasiswa atas nama " + nama_mahasiswa[Mhswa]);
        System.out.println("Nilai tertinggi terdapat pada minggu ke-" + (Minggu + 1) + " dengan nilai " + nilaiTertinggi);
    }
}