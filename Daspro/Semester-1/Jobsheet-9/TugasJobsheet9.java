import java.util.Scanner;

public class TugasJobsheet9 {
    public static void main(String[] args) {
        try (Scanner input22 = new Scanner(System.in)) {
            int total = 0, biggest = 0, least = 0;
            System.out.print("Masukkan banyak elemen array: ");
            byte x = input22.nextByte();
            int[] nilai = new int[x];
            for (int i = 0; i < nilai.length; i++) {
                System.out.print("Masukkan nilai elemen " + i + ": ");
                nilai[i] = input22.nextInt();
                total += nilai[i];
            }
            for (int i = 0; i < nilai.length; i++) {
                if (biggest < nilai[i]) {
                    biggest = nilai[i];
                } else {
                    least = nilai[i];
                }
            }
            double avg = total / nilai.length;
            System.out.println("Nilai tertinggi adalah " + biggest);
            System.out.println("Nilai terendah adalah " + least);
            System.out.println("Nilai rata-rata adalah " + avg);
            input22.close();
        }
    }
}