import java.util.Scanner;
public class Tugas3 {
    static boolean prima_rekursif(int x, int y) {
        if (y == 1) {
            return true;
        } else {
            if (x % y == 0) {
                return false;
            } else {
                return prima_rekursif(x, y - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int bilangan = sc.nextInt();
        boolean cek_prima = prima_rekursif(bilangan, bilangan / 2);
        if (cek_prima) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        } sc.close();
    }
}