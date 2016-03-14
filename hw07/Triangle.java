//Trevor Hayes
//CSE002
//hw06-Triangle

//This program uses different loops to print a pyramid of numbers who size is decided by the user

import java.util.Scanner;
public class Triangle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //Declares the scanner
        boolean check = true; //Declares boolean 'check' and sets it equal to true
        int source = 0; //Declares integer 'source' and sets it equal to zero
        System.out.print("Enter a number between 5 and 30: "); //Prompts the user to enter a number
        while (check) { //Runs while 'check' is equal to true
            if (sc.hasNextInt()) { //Runs if the user input is an integer
                source = sc.nextInt(); //Stores integer into 'source'
                if (source > 4 && source < 31) { //Runs if 'source' is between 5 and 30
                    check = false; //Changes 'check' to flase
                }
                else { //If user input is not between 5 and 30
                    System.out.printf("  Error. Please input an integer between 5 and 30\nEnter a number between 5 and 30: "); //Prompts user to enter a new input
                    sc.nextLine(); //Prepares next user input
                }
            }
            else { //If user input is not an integer
                System.out.printf("  Error. Please input an integer between 5 and 30\nEnter a number between 5 and 30: "); //Prompts user to enter a new input
                sc.nextLine(); //Prepares next user input
            }
        }
        //--------------------------------------------------------------For Loop
        
        System.out.println("FOR LOOP:"); //Prints FOR LOOP:
        for (int i = 1; i <= source; i++) { //Runs while 'i' is less than 'source'
            for (int j = 0; j < i; j++) { //Runs while 'j' is less than 'i'
                System.out.print(i); //Prints the value of 'i'
            }
            System.out.println(); //Starts new line in the terminal
        }
        for (int i = source - 1; i > 0; i--) { //Runs while 'i' is greater than 0
            for (int j = 0; j < i; j++) { //Runs while 'j' is less than 'i'
                System.out.print(i); //Prints the value of 'i'
            }
            System.out.println(); //Starts a new line in the terminal
        }
        
        //------------------------------------------------------------While Loop
        
        System.out.printf("\nWHILE LOOP:\n"); //Prints WHILE LOOP:
        int i = 1; //Declares integer 'i' and sets it equal to 0
        while (i <= source) { //Runs while 'i' is less than or equal to 'source'
            int j = 0; //Declares integer 'j' and sets it equal to 0
            while (j < i) { //Runs while 'j' is less than 'i'
                System.out.print(i); //Prints the value of 'i'
                j++; //Iterates 'j'
            }
            i++; //Iterates 'i'
            System.out.println(); //Starts a new line in the terminal
        }
        i = source - 1; //'i' is set equal to 'source' minus 1
        while (i > 0) { //Runs while 'i' is greater than 0
            int j = 0; //Declares integer 'j' and sets it equal to 0
            while (j < i) { //Runs while 'j' is less than 'i'
                System.out.print(i); //Prints the value of 'i'
                j++; //Iterates 'j'
            }
            i--; //Decriments 'i'
            System.out.println(); //Starts a new line in the terminal
        }
        
        //---------------------------------------------------------Do-While Loop
        
        System.out.printf("\nDO-WHILE LOOP:\n"); //Prints DO-WHILE LOOP
        i = 1; //'i' is set equal to 1
        do {
            int j = 0; //Declares integer 'j' and sets it equal to 0
            do {
                System.out.print(i); //Prints the value of 'i'
                j++; //Iterates 'j'
            } while (j < i); //Runs do loop while 'j' is less than 'i'
            i++; //Iterates 'i'
            System.out.println(); //Starts a new line in the terminal
        } while (i <= source); //Runs do loop while 'i' is less than or equal to 'source'
        i = source - 1; //'i' is set equal to 'source' minus 1
        do {
            int j = 0; //Declares integer 'j' and sets it equal to 0
            do {
                System.out.print(i); //Prints the value of 'i'
                j++; //Iterates 'j'
            } while (j < i); //Runs do loop while 'j' is less than 'i'
            i--; //Decriments 'i'
            System.out.println(); //Starts a new line in the terminal
        } while (i > 0); //Runs do loop while 'i' is greater than 0
    }
}