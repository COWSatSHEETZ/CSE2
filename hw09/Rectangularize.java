//Trevor Hayes
//CSE002
//hw09-Rectangle

//This program receives input from the user in the form of an integer or a 
//string. If an integer is input, a square of % signs is printed that has side 
//length of the input integer. If a string of characters is input, the string is 
//printed as many times as there is characters within the string.

import java.util.Scanner; //Import scanner
public class Rectangularize {
    public static void printer(String wordInput) { //Method 'printer' that runs if a string is input
        System.out.println(); //New line
        int length = wordInput.length(); //Length of input string is determined
        for (int i = 0; i < length; i++) { //As long as dummy variable 'i' is less than the length, the string will be printed followed by a new line
            System.out.println(wordInput);
        }
    }
    public static void printer(int numInput) { //Method 'printer' that runs if an integer is input
        System.out.println(); //New line
        for (int i = 0; i < numInput; i++) { //Starts the next loop as long as the dummy variable 'i' is less than the magnitude of the integer input
            for(int j = 0; j < numInput; j++) { //Prints a '%' on one line as long as dummy variable 'j' is less than the magnitude of the integer input
                System.out.print("%"); //Prints '%'
            }
            System.out.println(); //New line
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //New scanner
        System.out.println("Please enter an input"); //Prompts user to enter an input
        boolean check = true; //Boolean 'check' is declared for while loop
        while (check) { //Runs while 'check' is true
            if (sc.hasNextInt()) { //Runs if user inputs an integer
                int x = sc.nextInt(); //Integer value is stored into variable 'x'
                if (x > 0) { //Runs is 'x' is greater than 0
                    printer(x); //Calls method 'printer'
                    check = false; //'check' is changed to false
                }
                else { //Runs if integer is less than 0
                    System.out.println("Invalid input. Try again"); //Tells user to try again
                    sc.nextLine(); //Next scanner line is called
                }
            }
            else { //Runs if input is not an integer
                String y = sc.nextLine(); //Input is stored as a string
                printer(y); //Calls method 'printer'
                check = false; //'check' is changed to false
            }
        }
    }
}