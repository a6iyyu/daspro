import java.util.Scanner;
public class Pemilihan2Percobaan222 {
    public static void main(String[] args) {
        try (Scanner input22 = new Scanner(System.in)) {
            System.out.print("Sudut 1: ");
            int sudut_1 = input22.nextInt();
            System.out.print("Sudut 2: ");
            int sudut_2 = input22.nextInt();
            System.out.print("Sudut 3: ");
            int sudut_3 = input22.nextInt();
            int total_sudut = sudut_1 + sudut_2 +sudut_3;
            if (total_sudut == 180) {
                if (sudut_1 == 90 || sudut_2 == 90 || sudut_3 == 90) {
                    System.out.println("Segitiga tersebut adalah segitiga siku-siku.");
                } else if (sudut_1 == sudut_2 || sudut_2 == sudut_3 || sudut_1 == sudut_3) {
                    System.out.println("Segitiga tersebut adalah segitiga sama kaki.");
                } else if (sudut_1 == 60 && sudut_2 == 60 && sudut_3 == 60) {
                    System.out.println("Segitiga tersebut adalah segitiga sama sisi.");
                } else {
                    System.out.println("Segitiga tersebut adalah segitiga sembarang");
                }
            } else {
                System.out.println("Bukan segitiga");
            }
        }
    }
}