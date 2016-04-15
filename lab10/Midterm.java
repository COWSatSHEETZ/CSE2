//Trevor Hayes
//CSE002
//lab10-Midterm

//This program creates an array of names and randomly assigns them a grade from 0 to 100

import java.util.Scanner;
import java.util.Random;
public class Midterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declare scanner
        Random rand = new Random(); //Declare random
        String[] students = new String[(rand.nextInt(6) + 5)]; //String array is a random number between 5 and 10
        System.out.println("Enter " + students.length + " student names:"); //Asks user to input the names
        for (int i = 0; i < students.length; i++) { //Runs while 'i' is less than the length of the string array. 'i' is initially 0 and iterated by 1 each loop
            students[i] = sc.nextLine(); //'i'th index in the array is equal to the input
        }
        int[] midterm = new int[students.length]; //Array of integers to hold midterm scores
        for (int i = 0; i < students.length; i++) { //Runs while 'i' is less than the length of the string array
            midterm[i] = rand.nextInt(101); //'i'th index in the array is equal to a random number between 0 and 100
        }
        System.out.println(); //New line in terminal
        System.out.println("Here are the midterm grades of the " + students.length + " students above:"); //Prints header for the list
        for (int i = 0; i < students.length; i++) { //Runs whil 'i' is less than the length of the string array
            System.out.println(students[i] + " : " + midterm[i]); //Prints out the corresponding name and midterm score
        }
    }
}