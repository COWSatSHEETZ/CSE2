//Trevor Hayes
//CSE002
//hw3-Pyramid

//This program asks the user to input the dimensions of a pyramid and returns the volume enclosed by the pyramid.

import java.util.Scanner;
public class Pyramid {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in); //Declare and construct the scanner for user input
        System.out.print("The square side of the pyramid is (input length): "); //Prompt user to input the length of the side of the pyramid
            double side = myScanner.nextDouble(); //User input is stored as a double
        System.out.print("The height of the pyramid is (input height): "); //Prompt user to input the length of the height of the pyramid
            double height = myScanner.nextDouble(); //User input is stored as a double
        double volume = side*side*height/3; //Calculates the volume within the pyramid
        //Displays the answer
        System.out.printf("The volume inside the pyramid is: %.2f",volume);
        System.out.println();
    }
}