import java.util.Scanner;
public class BillingWarnet {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Selamat Datang di Warnet SDR!\nMasukkan jumlah jam: ");
            byte jam = input.nextByte();
            int total = 3000 * jam;
            System.out.println("Jumlah yang harus dibayar sebesar Rp" + total);
        }
    }
}