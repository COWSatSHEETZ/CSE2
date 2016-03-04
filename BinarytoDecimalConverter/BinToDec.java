//Trevor Hayes
//Binary to Decimal Converter

//This program recieves specific binary numbers from user input, converts them to decimal and returns them back to the user

import java.util.Scanner;
public class BinToDec {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter one of the following integers: 0, 1, 10, 11, 100, 101, 110, or 111.");
        int num = 0;
        if (!myScanner.hasNextInt()) {
            System.out.println("Please enter an integer");
            System.exit(0);
        }
        else {
            num = myScanner.nextInt();
            if (!(num == 0 || num == 1 || num == 10 || num == 11 || num == 100 || num == 101 || num == 110 || num == 111)) {
                System.out.println("Please enter one of the specified integers.");
                System.exit(0);
            }
        }
        int firstDigit = num%10;
        int secondDigit = (num/10)%10;
        int thirdDigit = (num/100)%10;
        
        firstDigit = (firstDigit == 1) ? 1 : 0;
        secondDigit = (secondDigit == 1) ? 2 : 0;
        thirdDigit = (thirdDigit == 1) ? 4 : 0;
        
        int decimal = firstDigit+secondDigit+thirdDigit;
        System.out.println(num + " in decimal format is equal to " + decimal);
    }
}