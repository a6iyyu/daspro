import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();
        for (int i_outer = 1; i_outer <= N; i_outer++) {
            for (int i = 0; i <= N; i++) {
                System.out.print("*");
            } System.out.println();
        } sc.close();
    }
}