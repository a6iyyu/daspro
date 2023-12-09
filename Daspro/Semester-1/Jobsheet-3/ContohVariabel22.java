public class ContohVariabel22 {
    public static void main(String[] args) {
        String hobi = "Berlari, pemrograman, menulis, dan fotografi";
        boolean is_pandai = true;
        char jenis_kelamin = 'L';
        byte umur_saya_sekarang = 18;
        double ipk = 3.8, tinggi = 1.69;

        System.out.println(hobi);
        System.out.println("Apakah saya pandai?" + is_pandai);
        System.out.println("Jenis kelamin saya adalah" + jenis_kelamin);
        System.out.println("Umurku saat ini adalah" + umur_saya_sekarang);
        System.out.println(String.format("Saya ber-IPK %s, dengan tinggi badan %s", ipk, tinggi));
    }
}