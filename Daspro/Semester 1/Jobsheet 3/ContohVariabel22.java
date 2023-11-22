public class ContohVariabel22 {
    public static void main(String[] args) {
        String salah_satu_hobi_saya_adalah = "Bermain petak umpet";
        boolean is_pandai = true;
        char jenis_kelamin = 'L';
        byte umur_saya_sekarang = 20;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println(salah_satu_hobi_saya_adalah);
        System.out.println("Apakah saya pandai?" + is_pandai);
        System.out.println("Jenis kelamin saya adalah" + jenis_kelamin);
        System.out.println("Umurku saat ini adalah" + umur_saya_sekarang);
        System.out.println(String.format("Saya ber-IPK %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
