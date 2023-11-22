import java.util.Scanner;

public class Selection1 {
    public static void main(String[] args) {
        // Checking a number is this odd or even
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String output = (number % 2 ==0) ? "Even number." : "Odd number.";
        System.out.println(output);
    }
}