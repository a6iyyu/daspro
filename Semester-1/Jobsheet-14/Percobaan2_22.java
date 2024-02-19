import java.util.Scanner;
public class Percobaan2_22 {
    static int hitung_pangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1 = ");
            return 1;
        } else {
            if (y == 0) {
                System.out.print(x);
                return x;
            } else {
                System.out.print(x + " x ");
                return (x * hitung_pangkat(x, y - 1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        System.out.print("Bilangan " + bilangan + " dengan pangkat " + pangkat + " dicetak dengan hasil ");
        System.out.println(hitung_pangkat(bilangan, pangkat));
        sc.close();
    }
}