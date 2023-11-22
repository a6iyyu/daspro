import java.util.Scanner;

public class PemilihanPercobaan322 {
    public static void main(String[] args) {
        try (Scanner input22 = new Scanner(System.in)) {
            double angka_1, angka_2, hasil;
            char operator;

            System.out.print("Masukkan angka pertama: ");
            angka_1 = input22.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            angka_2 = input22.nextDouble();
            System.out.print("Masukkan operator (+ - * /): ");
            operator = input22.next().charAt(0);

            switch (operator) {
                case '+':
                    hasil = angka_1 + angka_2;
                    System.out.println(angka_1 + " + " + angka_2 + " = " + hasil);
                case '-':
                    hasil = angka_1 - angka_2;
                    System.out.println(angka_1 + " - " + angka_2 + " = " + hasil);
                    break;
                case '*':
                    hasil = angka_1 * angka_2;
                    System.out.println(angka_1 + " * " + angka_2 + " = " + hasil);
                    break;
                case '/':
                    hasil = angka_1 / angka_2;
                    System.out.println(angka_1 + " / " + angka_2 + " = " + hasil);
                    break;
            }
        }
    }
}
