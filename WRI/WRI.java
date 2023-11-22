import java.util.Scanner;

public class WRI{
    public static void main(String[] args) {
        //Print Result
        System.out.print("***** IDENTITAS DIRI *****\nNama\t: Rafi Abiyyu Airlangga\nAbsen\t: 22\nKelas\t: 1D\nProdi\t: D-IV Teknik Informatika\nJurusan\t: Teknologi Informasi");
        
        //Declaration
        int a = 2;
        int b = 12;
        int c = b + a;
        System.out.println("\nHasil dari penjumlahan di atas adalah " + c);

        //Data Type
        int myNum = 12;
        float myFloat = myNum;
        System.out.println(myFloat);

        char myChara = 'b';
        int myNum2 = (int) myChara;
        System.out.println(myNum2);

        //Operator
        int myNum3 = 1034;
        System.out.println(--myNum3);

        float myNum4 = 9.32f;
        System.out.println(++myNum4);

        int Try = 1;
        System.out.println('t' + Try);
        System.out.println('h' + 'h');
        System.out.println('a' + "hh");

        //Boolean
        int myNum5 = 100;
        System.out.println(myNum5 > 3 || myNum5 > 101);

        int myNum6 = 27;
        System.out.println(myNum6 > 5 && myNum6 < 20);

        //Length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        System.out.println("Panjang dari String di atas adalah " + txt.length());

        //Concatinate
        String firstName = "Rafi ";
        String centerName = "Abiyyu ";
        String lastName = "Airlangga";
        System.out.println(firstName.concat(centerName + lastName));
        System.out.println(firstName + centerName + lastName);

        //If Else
        float myNum7 = 1.13f;
        if (myNum7 >= 1 && myNum7 <= 2) {
            System.out.println(myNum7 + " terletak diantara angka 1 dan 2.");
        } else {
            System.out.println(myNum7 + " tidak terletak diantara angka 1 dan 2.");
        }

        int myNum8 = 1644;
        if (myNum8 > 100 && myNum8 < 999) {
            System.out.println(myNum8 + " terletak diantara angka 1 dan 1000.");
        } else if (myNum8 > 1000 && myNum8 < 2000) {
            System.out.println(myNum8 + " terletak diantara angka 1000 hingga 2000.");
        } else {
            System.out.println(myNum8 + " terletak diantara lebih dari angka 2000.");
        }

        int money = 15000;
        String result;
        result = (money < 20000) ? money + " setara dengan 1 dollar AS." : money + " tidak setara dengan 1 dollar AS.";
        System.out.println(result);

        int time = 21;
        String result2;
        result2 = (time < 12) ? "Good morning" : "Good night";
        System.out.println(result2);

        //Switch Case
        String day = "Selamat Datang";
        switch (day) {
            case "Halo":
                System.out.println("Aku hari ini bahagia.");
                break;
            case "Selamat Datang":
                System.out.println("Aku hari ini belajar pemrograman bersama WRI.");
                break;
            case "selamat datang":
                System.out.println("Ini salah tulis hehehe.");
                break;
            default:
                System.out.println("Kepepet katanya.");
        }

        //Scanner
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan angka yang diinginkan: ");
        int myNum9 = masukkan.nextInt();
        if (myNum9 % 2 == 0) {
            System.out.println("Ini bilangan genap");
        } else {
            System.out.println("Ini bilangan ganjil");
        }
    }
}
