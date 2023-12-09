import java.util.Scanner;
public class HargaBayar22 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double diskon = 0.1, total, bayar, jumlah_diskon;
            System.out.print("Masukkan harga barang yang dibeli: ");
            int harga = input.nextInt();
            System.out.print("Masukkan jumlah barang yang dibeli: ");
            int jumlah = input.nextInt();
            total = harga * jumlah;
            jumlah_diskon = total * diskon;
            bayar = total - jumlah_diskon;   
            System.out.println("Diskon yang Anda dapatkan sebesar " + jumlah_diskon);
            System.out.println("Jumlah yang harus dibayar sebesar " + bayar);
        }
    }
}