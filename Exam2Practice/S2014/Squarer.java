import java.util.Scanner;
public class Squarer {
    public static void sumsq(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result = i * i + result;
        }
        System.out.print("The sum of 1+2*2+3*3+...+n*n for n = " + n + " is " + result);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print("Enter an int- ");
            int input = sc.nextInt();
            if (input < 1) {
                check = false;
            }
            else {
                sumsq(input);
            }
        } while (check);
    }
}