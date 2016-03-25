//Trevor Hayes
//CSE002
//lab07-Bowtie

//This program uses various loop types to perform the same task of printing out a bowtie of varying size in the terminal

import java.util.Scanner; //Import Scanner to read user input
public class Bowtie {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //Declare the scanner
        
        while (true) {
        
        int nStars = 0; //Declare integer 'nStars' for user input
        System.out.println("Please enter an odd integer that is between 3 and 33:"); //Prompts user to input an integer between 3 and 33
        if (!sc.hasNextInt() || (nStars = sc.nextInt()) < 3 || nStars > 33 || nStars%2 != 1) { //Runs if the user input is not an integer or if it is not between 3 and 33. Also, user input is stored in variable 'nStars'
            sc.nextLine(); //Next scanner input is propmted
            do {
                System.out.println("Invalid input, enter again!"); //Tells user their input is invalid
                while (!sc.hasNextInt()) { //Runs if user's next input is not an integer
                    System.out.println("Invalid input, enter again!"); //Tells user that their input is invalid
                    sc.next(); //Next scanner input is prompted
                }
                nStars = sc.nextInt(); //Stores user's provided integer into 'nStars'
            } while (nStars < 3 || nStars > 33 || nStars%2 != 1); //Continues the do loop while 'nStars' is not between 9 and 16
        }
        System.out.println(); //Starts a new line in the terminal
        
        //int nStars = 9; //Declare integer 'nStars'
        
        //-----------------------------------------------------------While Loops
        /*
        int i = 0; //Declares integer 'i' for the while loop
        while (i <= nStars/2) { //Runs as long as 'i' is less than or equal to 'nStars' divided by 2
            int numSpaces = i*2; //Declares integer 'numSpaces' and sets it equal to 'i' times 2
            int numStars = nStars - numSpaces; //Declares integer 'numStars' and sets it equal to 'nStars' minus 'numSpaces'
            int j = 0; //Declares integer 'j' for the while loops
            while (j < i) { //Runs as long as 'j' is less than 'i'
                System.out.print(" "); //Prints an empty space
                j++; //Iterates 'j'
            }
            j = 0; //Resets 'j' to 0
            while (j < nStars - numSpaces) { //Runs while 'j' is less than 'nStars' minus 'numSpaces'
                System.out.print("*"); //Prints a *
                j++; //Iterates 'j'
            }
            j = 0; //Resets 'j' to 0
            while (j < nStars - i - numStars) { //Runs while 'j' is less than 'nStars' minus 'i' minus 'numStars'
                System.out.print(" "); //Prints an empty space
                j++; //Iterates 'j'
            }
            i++; //Iterates 'i'
            System.out.println(); //Starts a new line in the terminal
        }
        i = nStars/2 - 1; //'i' is set equal to the quantity 'nStars' divided by two subtracted by 1
        while (i >= 0) { //Runs while 'i' is less than or equal to 0
            int numSpaces = i*2; //Declares integer 'numSpaces' and sets it equal to 'i' times 2
            int numStars = nStars - numSpaces; //Declares integer 'numStars' and sets it equal to 'nStars' minus 'numSpaces'
            int j = 0; //Declares integer 'j' for while loops
            while (j < i) { //Runs while 'j' is less than 'i'
                System.out.print(" "); //Prints an empty space
                j++; //Iterates 'j'
            }
            j = 0; //Resets 'j' to 0
            while (j < nStars - numSpaces) { //Runs while 'j' is less than 'nStars' minus 'numSpaces'
                System.out.print("*"); //Prints a *
                j++; //Iterates 'j'
            }
            j = 0; //Resets 'j' to 0
            while (j < nStars - i - numStars) { //Runs while 'j' is less than 'nStars' minus 'i' minus 'numStars'
                System.out.print(" "); //Prints an empty space
                j++; //Iterates 'j'
            }
            i--; //Subtracts 1 from 'i'
            System.out.println(); //Starts a new line in the terminal
        }
        */
        //-------------------------------------------------------------For Loops
        /*
        for (int i = 0; i <= nStars/2; i++){
            int numSpaces = i*2;
            int numStars = nStars - numSpaces;
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nStars - numSpaces; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < nStars - i - numStars; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = nStars/2 - 1; i >= 0; i--) {
            int numSpaces = i*2;
            int numStars = nStars - numSpaces;
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nStars - numSpaces; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < nStars - i - numStars; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        */
        //--------------------------------------------------------Do While Loops
        
        int i = 0;
        if (i <= nStars/2) {
            do {
                int numSpaces = i*2;
                int numStars = nStars - numSpaces;
                int j = 0;
                if (j < i) {
                    do {
                        System.out.print(" ");
                        j++;
                    } while (j < i);
                }
                j = 0;
                if (j < nStars - numSpaces) {
                    do {
                        System.out.print("*");
                        j++;
                    } while (j < nStars - numSpaces);
                }
                j = 0;
                if (j < nStars - i - numStars) {
                    do {
                        System.out.print(" ");
                        j++;
                    } while (j < nStars - i - numStars);
                }
                i++;
                System.out.println();
            } while (i <= nStars/2);
        }    
        i = nStars/2 - 1;
        if (i >= 0) {
            do {
                int numSpaces = i*2;
                int numStars = nStars - numSpaces;
                int j = 0;
                if (j < i) {
                    do {
                        System.out.print(" ");
                        j++;
                    } while (j < i);
                }
                j = 0;
                if (j < nStars - numSpaces) {
                    do {
                        System.out.print("*");
                        j++;
                    } while (j < nStars - numSpaces);
                }
                j = 0;
                if (j < nStars - i - numStars) {
                    do {
                        System.out.print(" ");
                        j++;
                    } while (j < nStars - i - numStars);
                }
                i--;
                System.out.println();
            } while (i >= 0);
        }
        System.out.print("Would you like to continue? If so, type Y or y: ");
        String input = "";
        if ((input = sc.next()).equals("Y") || input.equals("y")) {
        }
        else {
            System.exit(0);
        }
        
        }
        
        //----------------------------------------------------------------------
        
    }
}