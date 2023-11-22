import java.util.Scanner;

public class FactorialDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int factorial = 1;
        int i = 1;
        do {
            factorial = factorial * i;
            i++;
        } while (i <= number);

        System.out.printf("The factorial of %d is %d\n", number, factorial);
    }
}