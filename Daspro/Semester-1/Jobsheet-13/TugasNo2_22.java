import java.util.Scanner;
public class TugasNo2_22 {
    static Scanner sc = new Scanner(System.in);
    static String[] namaMhswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
    static double[][] nilaiMhswa = new double[5][7];
    static void inputNilai() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nilai Mahasiswa atas nama " + namaMhswa[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Minggu ke-" + (j + 1) + " : ");
                nilaiMhswa[i][j] = sc.nextDouble();
            }
        }
    }
    static void dataNilaiMhswa() {
        System.out.println("Nilai Tugas Lima Mahasiswa dari Minggu 1 hingga 7 berturut-turut :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Mahasiswa " + namaMhswa[i] + "\t: ");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilaiMhswa[i][j] + ", ");
            }
            System.out.println();
        }
    }
    static int mingguTertinggi() {
        double nilaiTertinggi = 0;
        int MingguTertinggi = 0;
        for (int j = 0; j < 7; j++) {
            double totalNilaiMinggu = 0;
            for (int i = 0; i < 5; i++) {
                totalNilaiMinggu += nilaiMhswa[i][j];
            }
            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                MingguTertinggi = j;
            }
        }
        return MingguTertinggi;
    }
    public static void main(String[] args) {
        inputNilai();
        System.out.println();
        dataNilaiMhswa();
        printNilaiTertinggiMhswa();
    }
    static void printNilaiTertinggiMhswa() {
        double nilaiTertinggi = 0;
        int Mhswa = 0;
        int Minggu = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilaiMhswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMhswa[i][j];
                    Mhswa = i;
                    Minggu = j;
                }
            }
        }
        System.out.println("\nNilai tertinggi diperoleh mahasiswa atas nama " + namaMhswa[Mhswa]);
        System.out
                .println("Nilai tertinggi terdapat pada minggu ke-" + (Minggu + 1) + " dengan nilai " + nilaiTertinggi);
    }
}