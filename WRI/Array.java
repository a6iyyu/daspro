public class Array {
    public static void main(String[] args) {
        int[][] number = new int[2][4];
        number[0][0] = 12;
        number[0][1] = 14;
        number[0][2] = 34;
        number[0][3] = 69;
        number[1][0] = 20;
        number[1][1] = 24;
        number[1][2] = 67;
        number[1][3] = 420;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(number[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}