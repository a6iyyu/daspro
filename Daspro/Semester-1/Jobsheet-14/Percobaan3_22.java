import java.util.Scanner;
public class Percobaan3_22 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Jumlah saldo awal: ");
            double saldo_awal = sc.nextDouble();
            System.out.print("Lamanya investasi (tahun): ");
            int tahun = sc.nextInt();
            System.out.print("Jumlah saldo setelah " + tahun + " tahun" + " : ");
            System.out.print(hitungLaba(saldo_awal, tahun));
        }
    }
}