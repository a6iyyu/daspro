import java.util.Scanner;
public class Pemilihan2Percobaan322 {
    public static void main(String[] args) {
        try (Scanner input22 = new Scanner(System.in)) {
            String kategori;
            int penghasilan, gaji_bersih;
            double pajak = 0;

            System.out.print("Masukkan kategori: ");
            kategori = input22.nextLine();
            System.out.print("Masukkan besar penghasilan: ");
            penghasilan =input22.nextInt();
            
            if (kategori.equalsIgnoreCase("pekerja")) {
                if (penghasilan <= 2000000)
                    pajak = 0.1;
                else if (penghasilan <= 3000000)
                    pajak = 0.15;
                else
                    pajak = 0.2;
                gaji_bersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.print("Penghasilan bersihnya adalah " + gaji_bersih);
            } else if (kategori.equalsIgnoreCase("pebisnis")) {
                if (penghasilan <= 2500000)
                    pajak = 0.15;
                else if (penghasilan <= 3500000)
                    pajak = 0.2;
                else
                    pajak = 0.25;
                gaji_bersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.print("Penghasilan bersihnya adalah " + gaji_bersih);
            } else {
                System.out.println("Error: Anda salah memasukkan karakter!");
            }
        }
    }
}