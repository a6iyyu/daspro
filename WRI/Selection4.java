import java.util.Scanner;

public class Selection4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number_1, number_2, result;

        System.out.print("Enter the first number: ");
        number_1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        number_2 = input.nextDouble();
        System.out.print("Enter ab operator (+ - * /): ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                result = number_1 + number_2;
                System.out.println(number_1 + " + " + number_2 + " = " + result);
                break;
            case '-':
                result = number_1 - number_2;
                System.out.println(number_1 + " - " + number_2 + " = " + result);
                break;
            case '*':
                result = number_1 * number_2;
                System.out.println(number_1 + " * " + number_2 + " = " + result);
                break;
            case '/':
                result = number_1 / number_2;
                System.out.println(number_1 + " / " + number_2 + " = " + result);
                break;
            default:
                System.out.println("Error: The operator you entered is wrong!");
        }
    }
}
