//Trevor Hayes
//CSE002
//hw3-Convert

//This program asks the user to input any length in meters and calculates, then outputs the length converted to inches. 

import java.util.Scanner;
public class Convert {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in); //Declare and construct the scanner for user input
        System.out.print("Enter the distance in meters: "); //Asks the user to input the length they want to convert
            double lengthmeters = myScanner.nextDouble(); //User input is stored as a double
        double lengthin = 39.3701*lengthmeters; //Converts meters to inches
        //Displays result on one line
        System.out.printf("%.2f",lengthmeters);
        System.out.printf(" meters is %.2f",lengthin);
        System.out.println(" inches.");
    }    
}