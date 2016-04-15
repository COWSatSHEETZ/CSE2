public class Cascade {
    public static void main (String[] args) {
        int num = 9;
        int placeHolder = num;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < placeHolder; j++) {
                System.out.print(" ");
            }
            System.out.println(placeHolder);
            placeHolder--;
        }
    }
}