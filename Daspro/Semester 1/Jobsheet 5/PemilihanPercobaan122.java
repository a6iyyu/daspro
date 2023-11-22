import java.util.Scanner;
public class PemilihanPercobaan122 {
    public static void main(String[] args) {
        try (Scanner input22 = new Scanner(System.in)) {
            System.out.print("Masukkan angka: ");
            int angka = input22.nextInt();

            String output = (angka % 2 == 0) ? "Angka " + angka + " bilangan genap." : "Angka " + angka + " bilangan ganjil.";
            System.out.println(output);
        }
    }
}