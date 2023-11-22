import java.util.Scanner;

public class Selection3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age > 65) {
            System.out.println("Elderly");
        } else if (age > 18) {
            System.out.println("Adults");
        } else if (age > 12) {
            System.out.println("Teens");
        } else if (age > 5) {
            System.out.println("Children");
        } else {
            System.out.println("Toddler");
        }
    }
}
