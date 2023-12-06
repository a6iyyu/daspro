import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        String nama, next;
        int baris, kolom;
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data berhasil disimpan");

                    } else {
                        System.out.println("Kursi sudah diisi oleh " + nama + " Silahkan mengisi kursi lain");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.next();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
            sc.nextLine();
        }
    }
}