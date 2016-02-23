//Trevor Hayes
//CSE002
//hw04-ToHex

//This program recieves an RBG color code input from the user and returns the value in hexadecimal form

import java.util.Scanner;
public class ToHex {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in); //initiates the scanner
        
        //declares red green and blue variables to be used later
        int red = 0;
        int green = 0;
        int blue = 0;
        
        System.out.println("Please enter three numbers representing RGB values:"); //Prompts user for the RGB values
        
        if (!myScanner.hasNextInt()) { //checks to see that the first input is an integer
            System.out.println("Sorry, your input must consist of integers."); //if not, display the warning message
            System.exit(0); //ends the program
        }
        else if (myScanner.hasNextInt()) { //program proceeds if the first input is an integer
            red = myScanner.nextInt(); //first input is stored as the red value
            if (!myScanner.hasNextInt()) { //checks to see that the second input is an integer
                System.out.println("Sorry, your input must consist of integers."); //if not, display the warning message
                System.exit(0); //ends the program
            }
            else if (myScanner.hasNextInt()) { //program proceeds if the second input is an integer
                green = myScanner.nextInt(); //second input is stored as the green value
                if(!myScanner.hasNextInt()) { //checks to see if the third input is an integer
                    System.out.println("Sorry, your input must consist of integers."); //if not, display the warning message
                    System.exit(0); //ends the program
                }
                else { //program proceeds if the third input is an integer
                    blue = myScanner.nextInt(); //third input is stored as the blue value
                }
            }
        }
        
        if ((red<0 || red>255) || (green<0 || green>255) || (blue<0 || blue>255)) { //checks to see that all the integers are between 0 and 255 inclusive
            System.out.println("Sorry, you must enter values between 0-255."); //displays error if they are outside the range
            System.exit(0); //ends the program
        }
        
        //finds the number of times the integer can be divided evenly by 16 and the remainder that is left after the division
        int red1 = (red/16); //stores value to be referenced for the first digit in the red hexadecimal value
        int red2 = (red%16); //stores value to be referenced for the second digit in the the red hexadecimal value
        //repeat for green and blue inputs
        int green1 = (green/16);
        int green2 = (green%16);
        int blue1 = (blue/16);
        int blue2 = (blue%16);
        
        //declares the variables that will hold the final values of the hexadecimals
        char redHex1 = '0';
        char redHex2 = '0';
        char greenHex1 = '0';
        char greenHex2 = '0';
        char blueHex1 = '0';
        char blueHex2 = '0';
        
        if (red1 > 9) { //if the red integer can be divided evenly by 16 more than 9 times, the left hexadecimal value for the red integer must be assigned a letter
            switch (red1) {
                case (10):
                    redHex1 = 'A'; //if the red integer can be divided by 16 10 times, the left hexadecimal value becomes an A
                    break;
                case (11):
                    redHex1 = 'B'; //if the red integer can be divided by 16 11 times, the left hexadecimal value becomes a B
                    break;
                case (12):
                    redHex1 = 'C'; //if the red integer can be divided by 16 12 times, the left hexadecimal value becomes a C
                    break;
                case (13):
                    redHex1 = 'D'; //if the red integer can be divided by 16 13 times, the left hexadecimal value becomes a D
                    break;
                case (14):
                    redHex1 = 'E'; //if the red integer can be divided by 16 14 times, the left hexadecimal value becomes an E
                    break;
                case (15):
                    redHex1 = 'F'; //if the red integer can be divided by 16 15 times, the left hexadecimal value becomes an F
                    break;
            }
        }
        else {
            redHex1 = (char) (red1 + '0'); //if the red integer can be divided evenly by 16 less than ten times at most, then the left hexadecimal value for the red integer is the same as the number of times the red integer can be divided evenly by 16
        }
        
        if (red2 > 9) { //if the remainder of the red integer after being divided by 16 is greater than 9, the right hexadecimal value for the red integer must be assigned a letter
            switch (red2) {
                case (10):
                    redHex2 = 'A'; //if the red integer has a remainder of 10 after being divided by 16, the right hexadecimal value becomes an A
                    break;
                case (11):
                    redHex2 = 'B'; //if the red integer has a remainder of 11 after being divided by 16, the right hexadecimal value becomes a B
                    break;
                case (12):
                    redHex2 = 'C'; //if the red integer has a remainder of 12 after being divided by 16, the right hexadecimal value becomes a C
                    break;
                case (13):
                    redHex2 = 'D'; //if the red integer has a remainder of 13 after being divided by 16, the right hexadecimal value becomes a D
                    break;
                case (14):
                    redHex2 = 'E'; //if the red integer has a remainder of 14 after being divided by 16, the right hexadecimal value becomes an E
                    break;
                case (15):
                    redHex2 = 'F'; //if the red integer has a remainder of 15 after being divided by 16, the right hexadecimal value becomes an F
                    break;
            }
        }
        else {
            redHex2 = (char) (red2 + '0'); // if the remainder of the red integer after being divided by 16 is less than 10, then the right hexadecimal value for the red integer is the same as the remainder
        }
        
        //repeat process for the green integer
        if (green1 > 9) {
            switch (green1) {
                case (10):
                    greenHex1 = 'A';
                    break;
                case (11):
                    greenHex1 = 'B';
                    break;
                case (12):
                    greenHex1 = 'C';
                    break;
                case (13):
                    greenHex1 = 'D';
                    break;
                case (14):
                    greenHex1 = 'E';
                    break;
                case (15):
                    greenHex1 = 'F';
                    break;
            }
        }
        else {
            greenHex1 = (char) (green1 + '0');
        }
        if (green2 > 9) {
            switch (green2) {
                case (10):
                    greenHex2 = 'A';
                    break;
                case (11):
                    greenHex2 = 'B';
                    break;
                case (12):
                    greenHex2 = 'C';
                    break;
                case (13):
                    greenHex2 = 'D';
                    break;
                case (14):
                    greenHex2 = 'E';
                    break;
                case (15):
                    greenHex2 = 'F';
                    break;
            }
        }
        else {
            greenHex2 = (char) (green2 + '0');
        }
        
        //repeat process for the blue integer
        if (blue1 > 9) {
            switch (blue1) {
                case (10):
                    blueHex1 = 'A';
                    break;
                case (11):
                    blueHex1 = 'B';
                    break;
                case (12):
                    blueHex1 = 'C';
                    break;
                case (13):
                    blueHex1 = 'D';
                    break;
                case (14):
                    blueHex1 = 'E';
                    break;
                case (15):
                    blueHex1 = 'F';
                    break;
            }
        }
        else {
            blueHex1 = (char) (blue1 + '0');
        }
        if (blue2 > 9) {
            switch (blue2) {
                case (10):
                    blueHex2 = 'A';
                    break;
                case (11):
                    blueHex2 = 'B';
                    break;
                case (12):
                    blueHex2 = 'C';
                    break;
                case (13):
                    blueHex2 = 'D';
                    break;
                case (14):
                    blueHex2 = 'E';
                    break;
                case (15):
                    blueHex2 = 'F';
                    break;
            }
        }
        else {
            blueHex2 = (char) (blue2 + '0');
        }
        
        System.out.println("The decimal numbers R:" + red + ", G:" + green + ", B:" + blue + ", is represented in hexadecimal as : " +redHex1+redHex2+greenHex1+greenHex2+blueHex1+blueHex2); //display the final hexadeciaml form fo the provided integers for the user
    }
}