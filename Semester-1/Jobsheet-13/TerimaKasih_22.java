public class TerimaKasih_22 {
    public static void ucapan_terima_kasih() {
        System.out.println("Thank you for being best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anithing.");
    }
    public static void ucapan_tambahan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        ucapan_terima_kasih();
        String ucapan = "Terima Kasih Pak... Bu... Semoga sehat selalu";
        ucapan_tambahan(ucapan);
    }
}