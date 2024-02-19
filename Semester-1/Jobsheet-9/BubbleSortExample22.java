public class BubbleSortExample22 {
    public static void main(String[] args) {
        int[] int_data = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;
        for (int i = 0; i < int_data.length; i++) {
            for (int j = 1; j < int_data.length - i; j++) {
                if (int_data[j - 1] < int_data[j]) {
                    temp = int_data[j];
                    int_data[j] = int_data[j - 1];
                    int_data[j - 1] = temp;
                }
            }
        }
        System.out.println("Hasil pengurutan:");
        for (int i = 0; i < int_data.length; i++) {
            System.out.println(int_data[i]);
        }
    }   
}