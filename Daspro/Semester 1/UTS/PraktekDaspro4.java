import java.util.Scanner;
public class PraktekDaspro4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah baris piramida yang diinginkan: ");
            int baris = input.nextInt();

            for (int i = 1; i <= baris; i++) {
                for (int j = 0; j <= baris - i; j++) {
                    System.out.print("    ");
                } for (int j = 1; j <= i; j++) {
                    System.out.print(j + "   ");
                } for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + "   ");
                } System.out.println();
            }
        }
    }
}