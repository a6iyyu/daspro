public class programKu {
    public static void TampilHinggaKeiI(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
            System.out.println();
        }
    }
    public static int Jumlah(int bil1, int bil2) {
        return (bil1 + bil2);
    }
    public static void TampilJumlah (int bil1, int bil2) {
        TampilHinggaKeiI(Jumlah(bil1, bil2));
    }
    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        TampilJumlah(temp, 5);
    }
}