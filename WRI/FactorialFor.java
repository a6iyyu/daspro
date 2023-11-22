import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, factorial, i;

        System.out.println("Enter a number: ");
        number = input.nextInt();

        factorial = 1;
        for (i = 2; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.printf("The factorial of %d is %d\n", number, factorial);
    }
}
