import java.util.Scanner;
public class Ucapan_22 {
    public static String penerima_ucapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan nama orang yang Anda ingin beri ucapan: ");
        String nama_orang = sc.nextLine();
        System.out.println(nama_orang);
        sc.close();
        return nama_orang;
    }
    public static void main(String[] args) {
        System.out.println("Thank You " + penerima_ucapan() + "\nMay the peace be with you.");
    }
}