import java.util.Arrays;
import java.util.Scanner;

public class PlatNomor {
    private static final char[] kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] kota = new char[10][12];
        kota[0] = "BANTEN".toCharArray();
        kota[1] = "JAKARTA".toCharArray();
        kota[2] = "BANDUNG".toCharArray();
        kota[3] = "CIREBON".toCharArray();
        kota[4] = "BOGOR".toCharArray();
        kota[5] = "PEKALONGAN".toCharArray();
        kota[6] = "SEMARANG".toCharArray();
        kota[7] = "SURABAYA".toCharArray();
        kota[8] = "MALANG".toCharArray();
        kota[9] = "TEGAL".toCharArray();

        System.out.println("Kode Plat tersedia:  A   B   D   E   F   G   H   L   N   T");
        System.out.println("============================================================");
        System.out.print("Masukkan kode plat: ");
        String KodePlat = sc.next().toUpperCase();

        int indexKode = findIndexKode(KodePlat);
        if (indexKode == -1) {
            System.out.println("Kode plat tidak ditemukan!");
        } else {
            if (KodePlat.charAt(0) == 'A') {
                System.out.println("Kota: " + Arrays.toString(kota[0]));
            } else if (KodePlat.charAt(0) == 'B') {
                System.out.println("Kota: " + Arrays.toString(kota[1]));
            } else if (KodePlat.charAt(0) == 'D') {
                System.out.println("Kota: " + Arrays.toString(kota[2]));
            } else if (KodePlat.charAt(0) == 'E') {
                System.out.println("Kota: " + Arrays.toString(kota[3]));
            } else if (KodePlat.charAt(0) == 'F') {
                System.out.println("Kota: " + Arrays.toString(kota[4]));
            } else if (KodePlat.charAt(0) == 'G') {
                System.out.println("Kota: " + Arrays.toString(kota[5]));
            } else if (KodePlat.charAt(0) == 'H') {
                System.out.println("Kota: " + Arrays.toString(kota[6]));
            } else if (KodePlat.charAt(0) == 'L') {
                System.out.println("Kota: " + Arrays.toString(kota[7]));
            } else if (KodePlat.charAt(0) == 'N') {
                System.out.println("Kota: " + Arrays.toString(kota[8]));
            } else if (KodePlat.charAt(0) == 'T') {
                System.out.println("Kota: " + Arrays.toString(kota[9]));
            } else {
                System.out.println("Kota Tidak Diketahui.");
            }
            System.out.println("=================================");
        }
        sc.close();
    }
    private static int findIndexKode(String KodePlat) {
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == KodePlat.charAt(0)) {
                return i;
            }
        }
        return -1;
    }
}