import java.util.Scanner;
public class DoWhileCuti22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int jatah_cuti, jumlah_hari;
            String konfirmasi;
            System.out.print("Jatah cuti: ");
            jatah_cuti = sc.nextInt();
            do {
                System.out.print("Apakah Anda ingin mengambil cuti (y/t): ");
                konfirmasi = sc.next();
                if (konfirmasi.equalsIgnoreCase("y")) {
                    System.out.print("Jumlah hari: ");
                    jumlah_hari = sc.nextInt();
                    if (jumlah_hari > jatah_cuti) {
                        System.out.println("Jumlah hari yang Anda inginkan melebihi jatah cuti.");
                        break;
                    } else {
                        jatah_cuti -= jumlah_hari;
                        System.out.println("Sisa jatah cuti Anda adalah " + jatah_cuti + " hari.");
                    }
                } else {
                    System.out.println("Anda tidak ingin mengambil cuti.");
                    break;
                }
            } while (jatah_cuti > 0 && konfirmasi.equalsIgnoreCase("y"));
        }
    }
}