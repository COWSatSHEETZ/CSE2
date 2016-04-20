//Trevor Hayes
//CSE002
//hw12-CSE2Linear

//This program creates a storage space for a list of grades and indicates to the user if the grade they seek is present

import java.util.Scanner;
import java.util.Random;
public class CSE2Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //New scanner
        //------------------------------------------------------------------------------------------------------------------Fill the array
        int[] grades = new int[15]; //Create an integer array that has a length of 15
        boolean check0 = true; //Declare boolean 'check0' and set it equal to true
        System.out.println("Enter " + grades.length + " ints in increasing order for final grades in CSE2:"); //Asks the user to input grades to fill the array
        while (check0) { //Runs while 'check0' is true
            if (sc.hasNextInt()) { //Checks that the user input is an integer
                grades[0] = sc.nextInt(); //input is stored as the first value in the array
                if (grades[0] >= 0 && grades[0] < 101) { //Checks if the value is between 0 and 100
                    check0 = false; //'check0' is changed to false
                }
                else { //If the input is not between 0 and 100, an error is prompted
                    System.out.println("The entered grade is not between 0 and 100. Try again."); 
                    sc.nextLine();
                }
            }
            else { //If the value is not an integer, an error message is displayed
                System.out.println("You must enter an integer between 0 and 100. Try again.");
                sc.next();
            }
        }
        //Enters values into the array. Ensures that each value is greater than or equal to the previous value entered and between 0 and 100
        for (int i = 1; i < grades.length; i++) {
            boolean checki = true; //Boolean 'checki' is equal to true
            while (checki) { //Runs while 'checki' is true
                if (sc.hasNextInt()) { //input must be an integer
                    grades[i] = sc.nextInt(); //Value stored in the array
                    if (grades[i] >= 0 && grades[i] < 101) { //Value must be between 0 and 100
                        if (grades[i] >= grades[i - 1]) { //Value must be greater than or equal to the previous value
                            checki = false; //'checki' is changed to false
                        }
                        else { //Otherwise, an error is presented
                            System.out.println("The grade must be larger than or equal to the previous input. Try again.");
                            sc.nextLine();
                        }
                    }
                    else { //Otherwise, an error is presented
                        System.out.println("The entered grade is not between 0 and 100. Try again.");
                        sc.nextLine();
                    }
                }
                else { //Otherwise, an error is presented
                    System.out.println("You must enter an integer between 0 and 100 that is larger than or equal to the previous entry. Try again.");
                    sc.next();
                }
            }
        }
        //Array is printed out
        System.out.printf("\nInput array:\n");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.printf("\n\n");
        //------------------------------------------------------------------------------------------------------------------Linear Search
        boolean checkGrade = true; //'checkGrade' is set equal to true
        int gradeSearch = 0; //Integer 'gradeSearch' is set equal to 0
        while (checkGrade) { //Runs while 'checkGrade' is true
            if (sc.hasNextInt()) { //Input must be an integer
                gradeSearch = sc.nextInt(); //Input is stored as 'gradeSearch'
                if (gradeSearch >= 0 && gradeSearch < 101) { //Input must be between 0 and 100
                    checkGrade = false; //'checkGrade' set equal to false
                }
                else { //Otherwise error message is displayed
                    System.out.println("You must enter an integer between 0 and 100. Try again.");
                    sc.nextLine();
                }
            }
            else { //Otherwise error message is displayed
                System.out.println("You must enter an integer between 0 and 100. Try again.");
                sc.next();
            }
        }
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == gradeSearch) { //Searches array for target number
                System.out.println(gradeSearch + " was found in the list with " + (i + 1) + " iterations."); //Prints if target is found
                break;
            }
            else if (grades[i] > gradeSearch) {
                System.out.println(gradeSearch + " was not found in the list with " + (i + 1) + " iterations."); //Prints if values in sorted array become larger than target
                break;
            }
            else if (i == (grades.length - 1)) {
                System.out.println(gradeSearch + " was not found in the list with " + (i + 1) + " iterations."); //Prints if loop reaches the end of the array without finding target
            }
        }
        //------------------------------------------------------------------------------------------------------------------Scramble the array
        int[] scrambledGrades = new int[grades.length]; //New array for scrambling original array
        //Copies original array to new array
        for (int i = 0; i < grades.length; i++) {
            scrambledGrades[i] = grades[i];
        }
        for (int i = 0; i < scrambledGrades.length; i++) {
            int target = (int) (scrambledGrades.length*Math.random()); //Chooses a random location in array
            //Swaps array values around
            int temp = scrambledGrades[target];
            scrambledGrades[target] = scrambledGrades[i];
            scrambledGrades[i] = temp;
        }
        //Prints scrambled array
        System.out.printf("\nScrambled array:\n");
        for (int i = 0; i < scrambledGrades.length; i++) {
            System.out.print(scrambledGrades[i] + " ");
        }
        System.out.printf("\n\n");
        //------------------------------------------------------------------------------------------------------------------Linear Search
        System.out.print("Enter a grade to search for: "); //Prompts user for search parameter
        boolean linCheckGrade = true; //Boolean 'linCheckGrade' is set equal to true
        int linearSearch = 0; //Integer 'linearSearch' is set equal to 0
        while (linCheckGrade) { //Runs while 'linCheckGrade' is true
            if (sc.hasNextInt()) { //Input must be an integer
                linearSearch = sc.nextInt(); //Integer is stored in 'linearSearch'
                if (linearSearch >= 0 && linearSearch < 101) { //Input must be between 0 and 100
                    linCheckGrade = false; //'linCheckGrade' to false
                }
                else { //Otherwise error message is displayed
                    System.out.println("You must enter an integer between 0 and 100. Try again.");
                    sc.nextLine();
                }
            }
            else { //Otherwise error message is displayed
                System.out.println("You must enter an integer between 0 and 100. Try again.");
                sc.next();
            }
        }
        //Searches every member of array for value
        for (int i = 0; i < scrambledGrades.length; i++) {
            if (scrambledGrades[i] == linearSearch) {
                System.out.println(linearSearch + " was found in the list with " + (i + 1) + " iterations."); //Says target was found if array member equals target number
                break; //Breaks free of loop
            }
            else if (i == (scrambledGrades.length - 1)) {
                System.out.println(linearSearch + " was not found in the list with " + (i + 1) + " iterations."); //Says target was not found if search goes through every member of the array
            }
        }
    }
}