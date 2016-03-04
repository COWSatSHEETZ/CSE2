//Trevor Hayes
//CSE002
//lab06-TwistGenerator

//This program asks the user for a positive integer and prints out a text image in the form of a twist that is as long as the user input. 

import java.util.Scanner; //Import scanner tool
public class TwistGenerator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //Declare new scanner
        int length = 0; //Initiates an integer with the name 'length' to be used later
        
        do {
            System.out.print("Enter the length of the twist as a positive integer: "); //Prompts the user for the length of the twist
            while (!sc.hasNextInt()) { //Checks if the user input was not an integer
                System.out.print("Please enter a positive integer: "); //Prompts the user again if the input is not an integer
                sc.next(); //Returns next scanner input
            }
            length = sc.nextInt(); //Stores the input of the user into 'length' if it is an integer
        } while (length < 0); //Repeats the do loop as long as 'length' is negative
        
        int counter = 0; //Declares integer variable 'counter'
        while (counter < length) { //While loop repeats as long as 'counter' is less than 'length'
            if (counter%3 == 0) { //If the remainder of 'counter' divided by 3 is 0
                System.out.print("\\"); //Prints a \
                counter++; //Iterates 'counter'
            }
            else if (counter%3 == 1) { //If the remainder of 'counter' divided by 3 is 1
                System.out.print(" "); //Prints a space
                counter++; //Iterates 'counter'
            }
            else { //If no other condition is met (therefore, the remainder of 'counter' divided by 3 is 2)
                System.out.print("/"); //Prints a /
                counter++; //Iterates 'counter'
            }
        }
        
        System.out.println(); //Starts a new line in the terminal
        counter = 0; //Resets 'counter' to 0
        while (counter < length) { //While loop repeats as long as 'counter' is less than 'length'
            if (counter%3 == 0 || counter%3 == 2) { //If the remainder of 'counter' divided by 3 is 0 or 2
                System.out.print(" "); //Prints a space
                counter++; //Iterates counter
            }
            else { //If no other condition is met (therefore, the remainder of 'counter' divided by 3 is 1)
                System.out.print("X"); //Prints an X
                counter++; //Iterates counter
            }
        }
        
        System.out.println(); //Starts a new line in the terminal
        counter = 0; //Resets 'counter' to 0
        while (counter < length) { //While loop repeats as long as 'counter' is less than 'length'
            if (counter%3 == 0) { //If the remainder of 'counter' divided by 3 is 0
                System.out.print("/"); //Prints a /
                counter++; //Iterates counter
            }
            else if (counter%3 == 1) { //If the remainder of 'counter' divided by 3 is 1
                System.out.print(" "); //Prints a space
                counter++; //Iterates counter
            }
            else { //If no other condition is met (therefore, the remainder of 'counter' divided by 3 is 2)
                System.out.print("\\"); //Prints a \
                counter++; //Iterates counter
            }
        }
        System.out.println(); //Starts a new line in the terminal
    }
}