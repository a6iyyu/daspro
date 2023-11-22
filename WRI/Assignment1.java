import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of array element: ");
        byte count = input.nextByte();
        byte number [] = new byte [count];
        for (byte i = 0; i < number.length; i++) {
            System.out.print("Enter value of the element " + (i + 1) + " : ");
            number[i] = input.nextByte();
        } System.out.println("====================================="); 
        System.out.print("Even number: "); 
        for (byte i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.print(number[i] + " ");
            }
        } System.out.print("\nOdd number: ");
        for (byte i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1) {
                System.out.print(number[i] + " ");
            }
        }
    }
}