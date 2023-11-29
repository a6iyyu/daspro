import java.util.Scanner;

public class Pemilihan2Percobaan122 {
    public static void main(String[] args) {
        try (Scanner input22 = new Scanner(System.in)) {
            System.out.print("Masukkan tahun: ");
            long tahun = input22.nextLong();

            if ((tahun % 4) == 0) {
                if ((tahun % 100) != 0) {
                    System.out.println(tahun + " adalah tahun kabisat.");
                } else if ((tahun % 400) == 0) {
                    System.out.println(tahun + " adalah tahun kabisat.");
                } else {
                    System.out.println(tahun + " adalah bukan tahun kabisat.");
                }
            } else {
                System.out.println(tahun + " adalah bukan tahun kabisat.");
            }
        }
    }
}