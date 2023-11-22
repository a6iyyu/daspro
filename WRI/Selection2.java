import java.util.Scanner;

public class Selection2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a score: ");
    int score = input.nextInt();

    if (score >= 100) {
        System.out.println(score += 10);
    } else {
        System.out.println(score -= 10);
    }

    System.out.println("Your final score is " + score);
    }
}
