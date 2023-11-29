import java.util.Scanner;
public class LatihanIndividu3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nilai a: ");
            double a = input.nextDouble();
            System.out.print("Masukkan nilai b: ");
            double b = input.nextDouble();
            System.out.print("Masukkan nilai c: ");
            double c = input.nextDouble();

            double d = b * b - 4 * a * c;

            if (d >= 0) {
                double akar_1 = (-b + Math.sqrt(d)) / (2 * a);
                double akar_2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Akar 1 adalah " + akar_1 + " dan akar 2 adalah " + akar_2);
            } else {
                double imajiner_1 = -b / (2 * a);
                double imajiner_2 = Math.sqrt(-d) / (2 * a);
                System.out.println("Akar 1 (real) adalah " + imajiner_1 + " + " + imajiner_2 + "i");
                System.out.println("Akar 2 (real) adalah " + imajiner_1 + " - " + imajiner_2 + "i");
            }
        }
    }
}