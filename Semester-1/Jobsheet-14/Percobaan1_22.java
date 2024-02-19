public class Percobaan1_22 {
    static int faktorial_rekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorial_rekursif(n - 1));
        }
    }
    static int faktorial_iteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        } return faktor;
    }
    public static void main(String[] args) {
        System.out.println(faktorial_rekursif(5));
        System.out.println(faktorial_iteratif(5));
    }
}