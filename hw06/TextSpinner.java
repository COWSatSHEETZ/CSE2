//Trevor Hayes
//CSE002
//hw06-TextSpinner

//This program runs an infinite loop that displays an animation of a spinning line

import java.util.concurrent.TimeUnit; //Imports TimeUnit in order to allow the program to pause for periods of time
public class TextSpinner {
    public static void main (String[] args) throws InterruptedException{ //Throws an exception allowing the program to pause
        while (true) { //Initiates an infinite loop
            System.out.print("/\b"); //Prints a /, then a backspace
            TimeUnit.MILLISECONDS.sleep(100); //Pauses the program for 100 milliseconds
            System.out.print("-\b"); //Prints a -, then a backspace
            TimeUnit.MILLISECONDS.sleep(100); //Pauses the program for 100 milliseconds
            System.out.print("\\\b"); //Prints a \, then a backspace
            TimeUnit.MILLISECONDS.sleep(100); //Pauses the program for 100 milliseconds
            System.out.print("|\b"); //Prints a |, then a backspace
            TimeUnit.MILLISECONDS.sleep(100); //Pauses the program for 100 milliseconds
        }
    }
}