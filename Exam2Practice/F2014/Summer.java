import java.util.Scanner;
public class Summer {
    public static void sum(int x, int y) {
        int start = x;
        int z = 0;
        for (x = x; x <= y; x++) {
            z = z + x;
        }
        System.out.println("" + start + " +...+ " + y + " = " + z);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check1 = true, check2 = true;
        System.out.print("Enter an int: ");
        while (check1) {
            if (sc.hasNextInt()) {
                int first = sc.nextInt();
                check1 = false;
                while (check2) {
                    System.out.print("Enter an int greater than " + first + ": ");
                    if (sc.hasNextInt()) {
                        int second = sc.nextInt();
                        if (second > first) {
                            check2 = false;
                            sum(first, second);
                        }
                        else {
                            System.out.println("Sorry, you entered " + second + " <= " + first + "; try again");
                            sc.nextLine();
                        }
                    }
                    else {
                        System.out.print("Please enter an integer greater than " + first + ":");
                        sc.nextLine();
                    }
                }
            }
            else {
                System.out.print("Please enter an integer: ");
                sc.nextLine();
            }
        }
    }
}