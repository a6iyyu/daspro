public class TerimaKasih_22 {
    static void ucapanTerimaKasih() {
        System.out.println("Thank you for being best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like i could ask you anithing.");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args) throws Exception {
        ucapanTerimaKasih();
        String ucapan = "Terima Kasih Pak... Bu... Semoga sehat selalu";
        UcapanTambahan(ucapan);
    }
}