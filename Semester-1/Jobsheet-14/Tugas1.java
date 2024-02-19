import java.util.Scanner;
public class Tugas1 {
    static void deret_rekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deret_rekursif(n - 1);
        }
    }
    static void deret_iteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan awal deret: ");
        int n = sc.nextInt();
        System.out.println("Deret Descending Rekursif: ");
        deret_rekursif(n);
        System.out.println();
        System.out.println("Deret Descending Iteratif: ");
        deret_iteratif(n);
        System.out.println();
        sc.close();
    }
}