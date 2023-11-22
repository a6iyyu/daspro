import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }

        System.out.printf("The factorial of %d is %d\n", number, factorial);
    }
}
