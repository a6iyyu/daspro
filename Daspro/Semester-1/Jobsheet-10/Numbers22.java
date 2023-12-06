import java.util.Arrays;
public class Numbers22 {
    public static void main(String[] args) {
        int[][] my_numbers = new int[3][];
        my_numbers[0] = new int[5];
        my_numbers[1] = new int[3];
        my_numbers[2] = new int[1];
        for (int i = 0; i < my_numbers.length; i++) {
            System.out.println(Arrays.toString(my_numbers[i]));
        } for (int i = 0; i < my_numbers.length; i++){
            System.out.println("Panjang baris ke-" + (i+1) + ": " + my_numbers[i].length);
        }
}
}