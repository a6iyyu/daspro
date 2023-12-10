import java.util.Scanner;
public class LatihanIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String weapon;
        System.out.print("Masukkan jarak: ");
        byte jarak = input.nextByte();
        if (jarak > 0 && jarak <= 5) {
            weapon = "melee weapon.";
        } else {
            weapon = "ranged weapon.";
        }
        System.out.println("Di jarak " + jarak + " meter, sebaiknya Anda memakai " + weapon);
        input.close();
    }
}