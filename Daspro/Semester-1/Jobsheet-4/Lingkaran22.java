import java.util.Scanner;

public class Lingkaran22 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int r;
            double phi = 3.14, keliling, luas;

            System.out.print("Masukkan jari-jari lingkaran: ");
            r = input.nextInt();

            keliling = phi * 2 * r;
            luas = phi * r * r;
            System.out.println("Keliling lingkarannya adalah " + keliling);
            System.out.println("Luas lingkarannya adalah " + luas);
        }
    }
}