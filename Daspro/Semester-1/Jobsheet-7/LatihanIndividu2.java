import java.util.Scanner;
public class LatihanIndividu2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            long correct_username = 123456, correct_password = 456789, username, password;
            
            System.out.print("Masukkan username: ");
            username = input.nextLong();
            System.out.print("Masukkan password: ");
            password = input.nextLong();

            if (username == correct_username && password == correct_password) {
                System.out.println("Anda berhasil login.");
            } else {
                System.out.println("Error: Anda salah memasukkan username atau password!");
            }
        }
    }
}