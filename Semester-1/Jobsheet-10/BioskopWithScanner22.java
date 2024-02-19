import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Masukkan data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan.");
                        } else {
                            System.out.println("Kursi sudah terisi, pilih kuris lain!");
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil dimasukkan.");
                            } else {
                                System.out.println("Maaf, kursi sudah terisi. Pembatalan input.");
                            }
                        }
                    } else {
                        System.out.println("Nomor baris atau kolom tidak valid, silakan coba lagi!");
                    }
                    break;
                case 2:
                    System.out.println("Daftar penonton: ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            String nilai = penonton[i][j];
                            if (nilai == null) {
                                System.out.println("Baris ke-" + (i + 1) + ", kolom ke-" + (j + 1) + ": ***");
                            } else {
                                System.out.println("Baris ke-" + (i + 1) + ", kolom ke-" + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih sudah menggunakan layanan kami!\nKeluar dari program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    break;
            }
            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}