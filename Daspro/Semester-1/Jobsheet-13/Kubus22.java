import java.util.Scanner;
public class Kubus22 {
    static int volume_kubus(int s) {
        int rumus_volume = s * s * s;
        return rumus_volume;
    }
    static int luas_kubus(int s) {
        int rumus_luas = 6 * s * s;
        return rumus_luas;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Panjang kubus: ");
        int s = scanner.nextInt();
        System.out.println("Volume kubus tersebut adalah " + volume_kubus(s));
        System.out.println("Luas permukaan kubus tersebut adalah " + luas_kubus(s));
        scanner.close();
    }
}