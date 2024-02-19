import java.util.Scanner;
public class Rafi22No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();
        if (palindrome(kalimat)) {
            System.out.println("Kalimat tersebut termasuk palindrome.");
        } else {
            System.out.println("Kalimat tersebut bukanlah palindrome.");
        } sc.close();
    }
    private static boolean palindrome(String validasi) {
        validasi = validasi.replaceAll(" ", "").toLowerCase();
        return validasi.equals(new StringBuilder(validasi).reverse().toString());
    }
}