import java.util.Scanner;
public class Tugas2 {
    static int penjumlahan_rekursif(int f) {
        if (f == 1) {
            System.out.print(f);
            return 1;
        } else {
            int output = penjumlahan_rekursif(f - 1);
            System.out.print(" + " + f);
            return f + output;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka batas akhir penjumlahan: ");
        int angka = sc.nextInt();
        int output = penjumlahan_rekursif(angka);
        System.out.println(" = " + output);
        sc.close();
    }
}