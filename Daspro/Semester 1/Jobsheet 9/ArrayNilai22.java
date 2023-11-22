import java.util.Scanner;
public class ArrayNilai22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nilai_akhir = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Masukkan nilai akhir ke-" + i + " : ");
                nilai_akhir[i] = sc.nextInt();
            } for (int i = 0; i < nilai_akhir.length; i++) {
                if (nilai_akhir[i] > 70) {
                    System.out.println("Mahasiswa ke-" + i + " lulus!");
                } else {
                    System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
                }
            }
        }
    }
}