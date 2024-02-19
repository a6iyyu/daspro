import java.util.Scanner;
public class PemilihanPercobaan222 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        System.out.print("Nilai UAS\t: ");
        float uas = input22.nextFloat();
        System.out.print("Nilai UTS\t: ");
        float uts = input22.nextFloat();
        System.out.print("Nilai Kuis\t: ");
        float kuis = input22.nextFloat();
        System.out.print("Nilai Tugas\t: ");
        float tugas = input22.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        if (total > 80) {
            char nilai_huruf = 'A';
            System.out.println("Nilai akhir = " + total + " dengan nilai huruf = " + nilai_huruf);
        } else if (total > 73) {
            String nilai_huruf = "B+";
            System.out.println("Nilai akhir = " + total + " dengan nilai huruf = " + nilai_huruf);
        } else if (total > 65) {
            char nilai_huruf = 'B';
            System.out.println("Nilai akhir = " + total + " dengan nilai huruf = " + nilai_huruf);
        } else if (total > 60) {
            String nilai_huruf = "C+";
            System.out.println("Nilai akhir = " + total + " dengan nilai huruf = " + nilai_huruf);
        } else if (total > 50) {
            char nilai_huruf = 'C';
            System.out.println("Nilai akhir = " + total + " dengan nilai huruf = " + nilai_huruf);
        } else if (total > 39) {
            char nilai_huruf = 'D';
            System.out.println("Nilai akhir = " + total + " dengan nilai huruf = " + nilai_huruf);
        } else if (total > 0) {
            char nilai_huruf = 'E';
            System.out.println("Nilai akhir = " + total + " dengan nilai huruf = " + nilai_huruf);
        } else {
            System.out.println("Error: Input nilai Anda invalid!");
        }
        input22.close();
    }
}