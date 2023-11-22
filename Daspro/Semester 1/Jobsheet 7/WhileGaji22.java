import java.util.Scanner;
public class WhileGaji22 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int jumlah_karyawan, jumlah_jam_lembur;
            double gaji_lembur = 0, total_gaji_lembur = 0;
            String jabatan;
            System.out.print("Masukkan jumlah karyawan: ");
            jumlah_karyawan = scan.nextInt();
            int i = 0;
            while (i < jumlah_karyawan) {
                System.out.println("Pilihan jabatan:\n1. Direktur\n2. Manajer\n3. Karyawan");
                System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
                jabatan = scan.next();
                if (jabatan.equalsIgnoreCase("direktur")) {
                    System.out.println("Direktur tidak menerima gaji lembur.");
                } else if (jabatan.equalsIgnoreCase("manajer")) {
                    System.out.print("Masukkan jumlah jam lembur: ");
                    jumlah_jam_lembur = scan.nextInt();
                    gaji_lembur = jumlah_jam_lembur * 100000;
                } else if (jabatan.equalsIgnoreCase("karyawan")) {
                    System.out.print("Masukkan jumlah jam lembur: ");
                    jumlah_jam_lembur = scan.nextInt();
                    gaji_lembur = jumlah_jam_lembur * 75000;
                } else {
                    System.out.println("Jabatan tidak valid. Silakan pilih jabatan yang sesuai.");
                    continue;
                }
                total_gaji_lembur += gaji_lembur;
                System.out.println("Total gaji lembur: " + total_gaji_lembur);
                i++;
            }
        }
    }
}