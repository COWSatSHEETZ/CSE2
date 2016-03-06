//Trevor Hayes
//CSE002
//lab06-Fibonacci

//This program recieves two integer values from the user as well as the number of times the Fibonacci sequence should be iterated

import java.util.Scanner; //Import Scanner to recieve input from user
public class Fibonacci {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //Declares the scanner
        int first, second, a, b, n; //Declares the integers 'first', 'second', 'a', 'b', and 'n'
        
        do {
            System.out.print("Enter the first number in the sequence: "); //Prompts the user to input the first integer
            while (!sc.hasNextInt()) { //Runs loop while the user's input is not an integer
                System.out.print("Enter a positive integer: "); //Prompts the user to input a positive integer
                sc.next(); //Next scanner input is prompted
            }
            first = sc.nextInt(); //Stores the user's input value into the variable 'first'
        } while (first < 0); //Continues the do loop while 'first' is less than 0
        
        do { //Repeats the same process as above for the variable 'second'
            System.out.print("Enter the second number in the sequence: ");
            while (!sc.hasNextInt()) {
                System.out.print("Enter a positive integer: ");
                sc.next();
            }
            second = sc.nextInt();
        } while (second < 0);
        
        do { //Repeats the same process as above for the variable 'n'
            System.out.print("How many custom Fibonacci numbers should be printed? ");
            while (!sc.hasNextInt()) {
                System.out.print("Enter a positive integer: ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n < 0);
        
        n -= 2; //Subracts 2 from 'n'
        a = first; //Sets 'a' equal to 'first'
        b = second; //Sets 'b' equal to 'second'
        System.out.print("" + a + " " + b + " "); //Prints out the values of 'a' and 'b'
        int counter = 0; //Declares the integer 'counter'
        while (counter < n) { //Runs loop as long as 'counter' is less than 'n'
            int c = a + b; //Integer 'c' is equal to 'a' + 'b'
            System.out.print(c + " "); //Prints the value of 'c' onto the same line as 'a' and 'b'
            a = b; //Sets 'a' equal to 'b'
            b = c; //Sets 'b' equal to 'c'
            counter++; //Iterates 'counter'
        }
        System.out.println(); //Starts a new line in the terminal
    }
}