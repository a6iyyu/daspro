import java.util.Scanner;
public class UcapanTerimaKasih_22 {
    public static String penerima_ucapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan nama orang yang ingin Anda beri ucapan: ");
        String nama_orang = sc.nextLine();
        sc.close();
        return nama_orang;
    }
    public static String ucapan_tambahan() {
        String tambahan_kalimat = "Semoga Anda tetap menjadi orang yang saya kenal selama ini kedepannya.\n";
        return tambahan_kalimat;
    }
    public static void ucapan_terima_kasih() {
        String nama = penerima_ucapan();
        String tambahan = ucapan_tambahan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world. \n" + tambahan +
                "You inspired in me love for learning and made me feel like I could ask you anything");
    }
    public static void main(String[] args) {
        ucapan_terima_kasih();
    }
}