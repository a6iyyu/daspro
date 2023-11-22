import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element of the array: ");
        byte count = input.nextByte();
        byte[] final_score = new byte[count];
        for (byte i = 0; i < final_score.length; i++) {
            System.out.print("Enter the student's score " + (i + 1) + ": ");
            final_score[i] = input.nextByte();
        } System.out.println("===================");
        for (byte i = 0; i < final_score.length; i++) {
            if (final_score[i] > 75 && final_score[i] <= 100) {
                System.out.println("Student " + (i + 1) + " succeed.");
            } else if (final_score[i] >=0 && final_score[i] <= 75) {
                System.out.println("Student " + (i + 1) + " failed.");
            } else {
                System.out.println("Error: Invalid score!");
            }
        }
    }
}