import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double total = 0;
            System.out.print("Enter the count of student's grade: ");
            byte count = input.nextByte();
            byte[] score = new byte[count];
            for (byte i = 0; i < score.length; i++) {
                System.out.print("Enter student's score: " + (i + 1) + ": ");
                score[i] = input.nextByte();
            } for (byte i = 0; i < score.length; i++) {
                total += score[i];
            }
            double average = total / score.length;
            if (average > 75 && average <= 100) {
                System.out.println("The student is succeed and the average score is " + average);
            } else if (average >= 0 && average <= 75) {
                System.out.println("The student is failed and the average score is " + average);
            } else {
                System.out.println("Error: Invalid number!");
            }
        }
    }
}