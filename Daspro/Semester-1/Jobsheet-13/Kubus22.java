import java.util.Scanner;
public class Kubus22 {
    static int volKbs(int s) {
        int volKbs = s * s * s;
        return volKbs;
    }
    static int LpKbs(int s) {
        int lpKbs = 6 * s * s;
        return lpKbs;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Panjang kubus : ");
        int s = scanner.nextInt();
        System.out.println("Volume kubus tersebut adalah : " + volKbs(s));
        System.out.println("Luas permukaan kubus tersebut adalah : " + LpKbs(s));
        scanner.close();
    }
}