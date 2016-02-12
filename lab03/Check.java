//Trevor Hayes
//CSE002
//lab03-Check

//This program uses the scanner class to obtain the values for the cost of the check, the tip percentage, and 
//the number of ways the check will be split from the user and determines how much each person in the group 
//needs to pay.

import java.util.Scanner; //Imports the scanner to be used by the program
public class Check {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in); //Identifies the scanner to be used later
        //Ask for the inputs
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //Prompts the user for the cost of the check
            double checkCost = myScanner.nextDouble(); //Stores the given value as a double
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); //Prompts the user for the value of the tip percentage
            double tipPercent = myScanner.nextDouble(); //Stores the given value as a double
        tipPercent /= 100; //Converts the given tip percentage to a decimal
        System.out.print("Enter the number of people who went out to dinner: "); //Prompts the user for the amount of people who went to dinner
            int numPeople = myScanner.nextInt(); //Stores the given value as an integer
        //Calculate outputs
        double totalCost = checkCost * (1 + tipPercent); //Uses the cost of the check and the tip precentage to calculate the total cost of the meal
        double costPerPerson = totalCost / numPeople; //Divides the total cost of the meal by the number of people to get the cost per person
        int dollars=(int)costPerPerson; //Drops the decimal points on the cost per person value leaving only the value of the whole dollars paid
        int dimes=(int)(costPerPerson * 10) % 10; //Multiplies the cost per person by 10 and stores it as an integer so that the dime value is then in the single digit 
                                                  //position. The % operator then returns the remainder which would be the number of dimes
        int pennies=(int)(costPerPerson * 100) % 10; //Multiplies the cost per person by 100 and stores it as an integer so that the penny value is then in the single digit 
                                                     //position. The % operator then returns the remainder which would be the number of pennies
        //Output the calculated data
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies); //Lets the user know how much each individual has to pay
    }
}