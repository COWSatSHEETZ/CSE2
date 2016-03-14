//Trevor Hayes
//CSE002
//hw07-Twisty

//This program receives the length and width inputs from the user and produces a helix shape with the specified dimensions in the terminal 

import java.util.Scanner;
public class Twisty {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true; //Declare boolean 'check' and set it equal to false
        int length = 0, width = 0; //Declare integers 'length' and 'width'
        
        System.out.print("Input your desired length: "); //Prompts user to input the length of the twist
        while (check) { //Runs while 'check' is true
            if (sc.hasNextInt()) { //Runs if the user input is an integer
                length = sc.nextInt(); //User's integer input is stored into 'length'
                if (length > 1 && length < 81) { //If the value 
                    check = false; //'check' is set equal to false
                }
                else {
                    System.out.printf("  Error: please input an integer between 2 and 80.\nInput your desired length: "); //Tells user their input is invalid and asks again
                    sc.nextLine(); //Next user input is prepared
                }
            }
            else { 
                System.out.printf("  Error: please input an integer between 2 and 80.\nInput your desired length: "); //Tells user their input is invalid and asks again
                sc.nextLine(); //Next user input is prepared
            }
        }
        check = true; //'check' is reset to false
        System.out.print("Input your desired width: "); //Prompts user to input the width of the twist
        while (check) { //Runs while 'check' is true
            if (sc.hasNextInt()) { //Runs if the user input is an integer
                width = sc.nextInt(); //User's integer input is stored into 'width'
                if (width < length && width > 0) { //Runs if 'width' is greater than 'length' 
                    check = false; //'check' is set equal to false
                }
                else {
                    System.out.printf("  Error: please input a positive integer smaller than the length.\nInput your desired width: "); //Tells user their input is invalid and asks again
                    sc.nextLine(); //Next user input is prepared
                }
            }
            else { 
                System.out.printf("  Error: please input a positive integer smaller than the length.\nInput your desired width: "); //Tells user their input is invalid and asks again
                sc.nextLine(); //Next user input is prepared
            }
        }
        
        for (int i = 0; i < width; i++) { //Declares a dummy variable 'i' and runs as long as 'i' is less than 'width'
            for (int j = 0; j < length; j++) { //Declares a dummy variable 'i' and runs as long as 'i' is less than 'width'
                if (width%2 == 1 && i == width/2 && j%(2*width) == 1 + 3*i) { //Condition that replaces a # with a \ when the slash helix doubles back
                    System.out.print("\\"); //Prints a \
                }
                else if (j%(2*width) == i) { //Prints a # if the remainder of 'j' divided by 2 times 'width' is equal to 'i'
                    System.out.print("#");
                }
                else if (j%(2*width) == (2*width - (i + 1))) { //Prints a # if the remainder of 'j' divided by 2 times 'width' is equal to 2 times 'width' minus 'i' plus 1
                    System.out.print("#");
                }
                else if (j%(2*width) == width + i) { //Prints a \ if the remainder of 'j' divided by 2 times 'width' is equal to 'width' plus 'i'
                    System.out.print("\\");
                }
                else if (j%(2*width) == (width - (i + 1))) { //Prints a / if the remainder of 'j' divided by 2 times 'width' is equal to 'width' minus 'i' plus 1
                    System.out.print("/");
                }
                else {
                    System.out.print(" "); //Otherwise a space is printed
                }
            }
            System.out.println(); //Starts a new line in the terminal
        }
    }
}