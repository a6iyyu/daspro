import java.util.Scanner;
public class Percobaan6_22 {
    static int hitung_luas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
    static int hitung_volume(int tinggi, int a, int b) {
        int volume = hitung_luas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, volume;
        System.out.print("Masukkan panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah : " + L);

        volume = p * l * t;
        System.out.println("Volume balok adalah : " + volume);
        input.close();
    }
}