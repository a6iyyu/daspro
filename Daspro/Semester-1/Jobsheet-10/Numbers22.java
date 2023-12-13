import java.util.Arrays;
public class Numbers22 {
    public static void main(String[] args) {
        int max_length = 9;
        int[][] my_numbers = new int[6][max_length];
        for (int i = 0; i < my_numbers.length; i++) {
            System.out.println(Arrays.toString(my_numbers[i]));
        }
        for (int i = 0; i < my_numbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + my_numbers[i].length);
        }
    }
}