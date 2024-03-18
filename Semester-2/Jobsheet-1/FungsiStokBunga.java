public class FungsiStokBunga {
    public static void main(String[] args) {
        int[][] StokBunga = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
        };
        int[] HargaBunga = { 75000, 50000, 60000, 10000 };
        System.out.println("Penghasilan dari tiap cabang jika seluruh bunga terjual:");
        TampilPendapatan(StokBunga, HargaBunga);
        System.out.println("\nStok tiap bunga di Royal Garden Cabang 4:");
        TampilStok(StokBunga, 3);
        System.out.println("\nPenyesuaian stok tiap bunga di Royal Garden Cabang 4:");
        kurangiStok(StokBunga, 3, -1, -2, 0, -5);
        TampilStok(StokBunga, 3);
    }
    public static void TampilPendapatan(int[][] StokBunga, int[] HargaBunga) {
        for (int i = 0; i < StokBunga.length; i++) {
            int penghasilan = 0;
            for (int j = 0; j < StokBunga[i].length; j++) {
                penghasilan += StokBunga[i][j] * HargaBunga[j];
            }
            System.out.printf("Cabang %d: Rp. %d\n", i + 1, penghasilan);
        }
    }
    public static void TampilStok(int[][] StokBunga, int cabang) {
        for (int i = 0; i < StokBunga[cabang].length; i++) {
            System.out.printf("Bunga %d: %d\n", i + 1, StokBunga[cabang][i]);
        }
    }
    public static void kurangiStok(int[][] StokBunga, int cabang, int... pengurangan) {
        for (int i = 0; i < pengurangan.length; i++) {
            StokBunga[cabang][i] += pengurangan[i];
        }
    }
}