//Trevor Hayes
//CSE002
//hw3-Pyramid

//This program asks the user to input the dimensions of a pyramid and returns the volume enclosed by the pyramid.

import java.util.Scanner;
public class Pyramid {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("The square side of the pyramid is (input length): ");
            double side = myScanner.nextDouble();
        System.out.print("The height of the pyramid is (input height): ");
            double height = myScanner.nextDouble();
        double volume = side*side*height/3;
        System.out.printf("The volume inside the pyramid is: %.2f",volume);
        System.out.println();
    }
}