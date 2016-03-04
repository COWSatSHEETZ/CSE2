//Trevor Hayes
//Symmetry Checker

//This program prompts the user for a five digit number and identifies if the number is symmetric

import java.util.Scanner;
public class Symmetry {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter a five digit number: ");
        int num = 0;
        if (!myScanner.hasNextInt()) {
            System.out.println("Please enter an integer.");
            System.exit(0);
        }
        else {
            num = myScanner.nextInt();
        }
        if ((num/10000)<1) {
            System.out.println("Please format your input as a five digit number.");
            System.exit(0);
        }
        int firstDigit = num%10;
        int secondDigit = (num/10)%10;
        int thirdDigit = (num/100)%10;
        int fourthDigit = (num/1000)%10;
        int fifthDigit = (num/10000)%10;
        
        if (firstDigit == fifthDigit && secondDigit == fourthDigit) {
            System.out.println("Congratulations! " + num + " is symmetric!");
        }
        else {
            System.out.println("Sorry, " + num + " in not symmetric.");
        }
    }
}