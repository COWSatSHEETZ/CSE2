public class WeirdPyramid {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(k);
            }
            System.out.println();
            k++;
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(k);
            }
            System.out.println();
            k++;
        }
    }
}