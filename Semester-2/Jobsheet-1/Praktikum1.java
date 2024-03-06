import java.util.Scanner;

public class Praktikum1 {
    public static String KonversiNilaiKeHuruf(double rata_rata) {
        String nilai_huruf;
        if (rata_rata > 80 && rata_rata <= 100) {
            nilai_huruf = "A";
        } else if (rata_rata > 73 && rata_rata <= 80) {
            nilai_huruf = "B+";
        } else if (rata_rata > 65 && rata_rata <= 73) {
            nilai_huruf = "B";
        } else if (rata_rata > 60 && rata_rata <= 65) {
            nilai_huruf = "C+";
        } else if (rata_rata > 50 && rata_rata <= 60) {
            nilai_huruf = "C";
        } else if (rata_rata > 39 && rata_rata <= 50) {
            nilai_huruf = "D";
        } else {
            nilai_huruf = "E";
        }
        return nilai_huruf;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Program Menghitung Nilai Akhir");
            System.out.println("=========================");
            System.out.print("Masukkan Nilai Tugas: ");
            double tugas = sc.nextDouble();
            System.out.print("Masukkan Nilai Kuis: ");
            double kuis = sc.nextDouble();
            System.out.print("Masukkan Nilai UTS: ");
            double uts = sc.nextDouble();
            System.out.print("Masukkan Nilai UAS: ");
            double uas = sc.nextDouble();
            System.out.println("=========================");
            System.out.println("=========================");
            if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
                System.out.println("Nilai tidak valid!");
            } else {
                double rata_rata = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.3 * uas;
                System.out.println("Nilai Akhir: " + rata_rata);
                System.out.print("Nilai Huruf: " + KonversiNilaiKeHuruf(rata_rata));
                System.out.println();
            }
            System.out.println("=========================");
            System.out.println("=========================");
        }
    }
}