//Trevor Hayes
//CSE002
//lab11-Search

//

import java.util.Scanner;
import java.util.Random;
public class Search {
    //--------------------------------------------------------------------------Check that input is positive
    public static int intCheck() {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (true) {
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                if (input >= 0) {
                    return input;
                }
                else {
                    System.out.println("Input is not positive. Try again.");
                    sc.nextLine();
                }
            }
            else {
                System.out.println("Input is not an integer. Try again.");
                sc.next();
            }
        }
    }
    //--------------------------------------------------------------------------Find min and max of array
    public static int[] minMax(int[] list) {
        int[] minMax = new int[2];
        minMax[0] = list[0];
        minMax[1] = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < minMax[0]) {
                minMax[0] = list[i];
            }
            else if (list[i] > minMax[1]) {
                minMax[1] = list[i];
            }
        }
        return minMax;
    }
    //--------------------------------------------------------------------------Binary search
    public static void binarySearch(int list[], int target) {
        int first = 0, last = (list.length - 1), middle;
        middle = (list.length - 1)/2;
        if (target < list[0]) {
            System.out.println(target + " was not found in the list");
            System.out.println("The number above " + target + " was " + list[0]);
        }
        else if (target > list[list.length - 1]) {
            System.out.println(target + " was not found in the list");
            System.out.println("The number below " + target + " was " + list[list.length - 1]);
        }
        else {
            while (first <= last) {
                if (list[middle] < target) {
                    first = middle + 1;
                }
                else if (list[middle] == target) {
                    System.out.println(target + " was found in the list at index " + middle);
                    break;
                }
                else {
                    last = middle - 1;
                }
                middle = (first + last)/2;
            }
            if (first > last) {
                System.out.println(target + " was not found in the list");
                System.out.println("The number above " + target + " was " + list[middle + 1]);
                System.out.println("The number below " + target + " was " + list[middle]);
            }
        }
    }
    //--------------------------------------------------------------------------Main method
    public static void main(String[] args) {
        Random rand = new Random();
        //----------------------------------------------------------------------Create arrayOne and arrayTwo
        int[] arrayOne = new int[50];
        int[] arrayTwo = new int[50];
        int arrayLength = arrayOne.length;
        for (int i = 0; i < arrayLength; i++) {
            arrayOne[i] = rand.nextInt(101);
        }
        arrayTwo[0] = rand.nextInt(101);
        for (int i = 1; i < arrayLength; i++) {
            arrayTwo[i] = arrayTwo[i - 1] + rand.nextInt(101);
        }
        //----------------------------------------------------------------------Min and Max of arrayOne and arrayTwo
        int minMaxOne[];
        int minMaxTwo[];
        minMaxOne = minMax(arrayOne);
        minMaxTwo = minMax(arrayTwo);
        System.out.println("The maximum of array1 is: " + minMaxOne[1]);
        System.out.println("The minimum of array1 is: " + minMaxOne[0]);
        System.out.println("The maximum of array2 is: " + minMaxTwo[1]);
        System.out.println("The minimum of array2 is: " + minMaxTwo[0]);
        //----------------------------------------------------------------------Binary search
        System.out.print("Enter an int: ");
        int input = intCheck();
        binarySearch(arrayTwo,input);
    }
}