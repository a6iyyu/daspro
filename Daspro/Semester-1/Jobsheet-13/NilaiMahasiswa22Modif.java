import java.util.Scanner;
public class NilaiMahasiswa22Modif {
    static Scanner sc = new Scanner(System.in);
    static int jumlah_mahasiswa;
    static int jumlah_minggu;
    static String[] nama_mahasiswa;
    static double[][] nilai_mahasiswa;
    static void input_nama() {
        sc.nextLine();
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama_mahasiswa[i] = sc.nextLine();
        }
    }
    static void input_nilai() {
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.println("Masukkan nilai Mahasiswa atas nama " + nama_mahasiswa[i] + " (Minggu ke-1 hingga ke-"
                    + jumlah_minggu + "): ");
            for (int j = 0; j < jumlah_minggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + " : ");
                nilai_mahasiswa[i][j] = sc.nextDouble();
            }
        }
    }
    static void data_nilai_mahasiswa() {
        System.out.println("Nilai Tugas Lima Mahasiswa dari Minggu 1 hingga 7 berturut-turut:");
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.print("Mahasiswa " + nama_mahasiswa[i] + ": ");
            for (int j = 0; j < jumlah_minggu; j++) {
                System.out.print(nilai_mahasiswa[i][j] + ", ");
            }
            System.out.println();
        }
    }
    static int minggu_tertinggi() {
        double nilai_tertinggi = 0;
        int minggu_tertinggi = 0;
        for (int j = 0; j < 7; j++) {
            double totalNilaiMinggu = 0;
            for (int i = 0; i < 5; i++) {
                totalNilaiMinggu += nilai_mahasiswa[i][j];
            }
            if (totalNilaiMinggu > nilai_tertinggi) {
                nilai_tertinggi = totalNilaiMinggu;
                minggu_tertinggi = j;
            }
        }
        return minggu_tertinggi;
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah Mahasiswa: ");
        jumlah_mahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah Minggu: ");
        jumlah_minggu = sc.nextInt();
        nama_mahasiswa = new String[jumlah_mahasiswa];
        nilai_mahasiswa = new double[jumlah_mahasiswa][jumlah_minggu];
        input_nama();
        input_nilai();
        System.out.println();
        data_nilai_mahasiswa();
        nilai_tertinggi_mahasiswa();
    }
    static void nilai_tertinggi_mahasiswa() {
        double nilai_tertinggi = 0;
        int mahasiswa = 0;
        int Minggu = 0;
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            for (int j = 0; j < jumlah_minggu; j++) {
                if (nilai_mahasiswa[i][j] > nilai_tertinggi) {
                    nilai_tertinggi = nilai_mahasiswa[i][j];
                    mahasiswa = i;
                    Minggu = j;
                }
            }
        }
        System.out.println("\nNilai tertinggi diperoleh mahasiswa atas nama " + nama_mahasiswa[mahasiswa]);
        System.out.println("Nilai tertinggi terdapat pada minggu ke-" + (Minggu + 1) + " dengan nilai " + nilai_tertinggi);
    }
}