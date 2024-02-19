import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N (minimal 3): ");
        int N = sc.nextInt();
        if (N < 3) {
            System.out.println("Masukkan angka lebih dari 3");
        } else {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                } System.out.println();
            }
        } sc.close();
    }
}