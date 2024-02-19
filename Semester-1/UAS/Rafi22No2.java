import java.util.Scanner;
public class Rafi22No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();
        int jumlah_vokal = 0, jumlah_konsonan = 0, jumlah_khusus = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            if (Character.isLetter(karakter) && vokal(karakter)) {
                jumlah_vokal++;
            }
            else if (Character.isLetter(karakter)) {
                jumlah_konsonan++;
            }
            else {
                jumlah_khusus++;
            }
        }
        System.out.println("Jumlah vokal: " + jumlah_vokal);
        System.out.println("Jumlah konsonan: " + jumlah_konsonan);
        System.out.println("Jumlah karakter khusus: " + jumlah_khusus);
        sc.close();
    }
    private static boolean vokal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}