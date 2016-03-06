//Trevor Hayes
//CSE002
//hw06-RunFactorial

//This program takes an integer between 9 and 16 inclusive provided by the user and calculates the factorial of that number

import java.util.Scanner; //Import Scanner to receive user input
public class RunFactorial {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //Declare the scanner
        int source = 0; //Declare integer 'source'
        
        System.out.println("Please enter an integer that is between 9 and 16: "); //Prompts user to input an integer between 9 and 16
        if (!sc.hasNextInt() || (source = sc.nextInt()) < 9 || source > 16) { //Runs if the user input is not an integer or if it is not between 9 and 16. Also, user input is stored in variable 'source'
            sc.nextLine(); //Next scanner input is propmted
            do {
                System.out.println("Invalid input, enter again!"); //Tells user their input is invalid
                while (!sc.hasNextInt()) { //Runs if user's next input is not an integer
                    System.out.println("Invalid input, enter again!"); //Tells user that their input is invalid
                    sc.next(); //Next scanner input is prompted
                }
                source = sc.nextInt(); //Stores user's provided integer into 'source'
            } while (source < 9 || source > 16); //Continues the do loop while 'source' is not between 9 and 16
        }
        
        double a, b; //Declares double values 'a' and 'b'
        a = b = source; //Sets 'a' and 'b' equal to 'source'
        do {
            a = a * --b; //Subtracts 1 from the last value of 'b' and multiplies that value with the last value of 'a'
        } while (b > 1); //Continues do loop until 'b' is equal to 1
        System.out.printf("Input accepted:\n%d! = %,.0f\n" , source, a); //Prints out the value of the factorial of the users input
    }
}