//Trevor Hayes
//CSE002
//hw12-CSE2Linear

//This program creates a storage space for a list of grades and indicates to the user if the grade they seek is present

import java.util.Scanner;
import java.util.Random;
public class CSE2Linear {
    //--------------------------------------------------------------------------
    public static int intCheck() { //Method 'intCheck' ensures that the user inputs an integer that is between 0 and 100
        Scanner sc = new Scanner(System.in); //New scanner
        int input = 0; //Integer 'input' is set to 0
        while (true) { //Runs until the user inputs an appropriate value
            if (sc.hasNextInt()) { //Checks if input is an integer
                input = sc.nextInt(); //Stores user's input
                if (input >= 0 && input < 101) { //Checks that 'input' is between 0 and 100
                    return input; //Returns value and breaks loop
                }
                else { //Otherwise, error message is printed
                    System.out.println("The entered grade is not between 0 and 100. Try again.");
                    sc.nextLine();
                }
            }
            else { //Otherwise, error message is printed
                System.out.println("The entered grade was not an integer between 0 and 100. Try again.");
                sc.next();
            }
        }
    }
    //--------------------------------------------------------------------------
    public static int intGreaterThanCheck(int last) { //Method 'intGreaterThanCheck' ensures that the user inputs an integer that is between 0 and 100 and is greater than the previously input value
        Scanner sc = new Scanner(System.in); //New scanner
        int input = 0; //Integer 'input' is set to 0
        while (true) { //Runs until the user inputs an appropriate value
            if (sc.hasNextInt()) { //Checks if input is an integer
                input = sc.nextInt(); //Stores user's input
                if (input >= 0 && input < 101) { //Checks that 'input' is between 0 and 100
                    if (input >= last) { //Checks that 'input' is greater than the previous value
                        return input; //Returns value and breaks loop
                    }
                    else { //Otherwise, error message is printed
                        System.out.println("The grade must be larger than or equal to the previous input. Try again.");
                        sc.nextLine();
                    }
                }
                else { //Otherwise, error message is printed
                    System.out.println("The entered grade is not between 0 and 100. Try again.");
                    sc.nextLine();
                }
            }
            else { //Otherwise, error message is printed
                System.out.println("You must enter an integer between 0 and 100 that is larger than or equal to the previous entry. Try again.");
                sc.next();
            }
        }
    }
    //--------------------------------------------------------------------------
    //Returns [true/false value, index where target value is located, iterations it took to find the target value]
    public static int[] binarySearch(int list[], int target) { //Method utilizes binary search to search a sorted array for a target value
        int first = 0, last = list.length - 1, middle; //Integers 'first' and 'last' are set equal to the first and last indicies in the array respectively
        middle = (list.length - 1)/2; //'middle' is equal to the last index divided by 2
        int i = 1; //Dummy variable 'i' is set equal to 0
        if (target < list[0]) { //Runs if the target value is less than the smallest value in the list
            int[] result = {0, 0, 1}; //Returns false, location of next highest index, and iterations utilized
            return result;
        }
        else if (target > list[list.length - 1]) { //Runs if the target value is larger than the largest value in the list
            int[] result = {0, last, 1}; //Returns false, location of next lowest index, and iterations utilized
            return result;
        }
        else { //Otherwise, searches the array
            while (first <= last) { //Runs as long as 'first' is less than or equal to 'last'
                if (list[middle] < target) { //Runs if the value at the index that's equal to 'middle' is less than the target value
                    first = middle + 1; //'first' is set equal to 'middle' plus 1
                }
                else if (list[middle] == target) { //Runs if the value at the index that's equal to 'middle' is equal to the target value
                     int result[] = {1, middle, i}; //Returns true, location of the targets value's index, and the number of iterations utilized
                    return result;
                }
                else { //Otherwise, 'last' is set equal to 'middle' minus 1
                    last = middle - 1;
                }
                middle = (first + last)/2; //The new middle value is set equal to the average of 'first' and 'last'
                i++; //The number of iterations is incremented
            }
        }
        int result[] = {0, middle, i}; //If value is not found in the array, returns false, the index of the next smallest value, and the iterations utilized
        return result;
    }
    //--------------------------------------------------------------------------
    public static int[] arrayScrambler(int[] list) { //Method 'arrayScrambler' scrambles the input array and returns the new array
        for (int i = 0; i < list.length; i++) { //For each value in the array
            int target = (int) (list.length*Math.random()); //Target value is randomly choosen from the array values
            int temp = list[target]; //Target value is temporariliy stored in 'temp' variable
            list[target] = list[i]; //Target value is set equal to the current value in the loop
            list[i] = temp; //Current value in the loop is set equal to the temporary value
        }
        return list; //Returns the scrambled array
    }
    //--------------------------------------------------------------------------
    //Returns [true/false value, index where target value is located, iterations it took to find the target value]
    public static int[] linearSearch(int[] list, int target) { //Method 'linearSearch' searches each value of the input array one by one for the target value
        for (int i = 0; i < list.length; i++) { //Runs through the entire array
            if (list[i] == target) { //Runs if a value of the array is found to be equal to the target value
                int[] result = {1, i, i + 1}; //Returns true, the index of the member containing the target value, and the number of iterations utilized
                return result;
            }
        }
        int[] result = {0, list.length - 1, list.length}; //If target value is not found, returns false, the last index in the array, and the number of iterations utilized
        return result;
    }
    //--------------------------------------------------------------------------
    public static void main(String[] args) {
        int[] grades = new int[15]; //New array of size 15
        System.out.println("Enter " + grades.length + " ints in increasing order for final grades in CSE2:"); //Prompts user to input grade values
        grades[0] = intCheck(); //first value in 'grades' array is set by 'intCheck' method
        for (int i = 1; i < grades.length; i++) { //Runs for the second value in the 'grades' array to the last
            grades[i] = intGreaterThanCheck(grades[i - 1]); //Values are assigned to 'grades' array by 'intGreaterThanCheck' method
        }
        System.out.printf("\nInput array:\n"); //Array header
        for (int i = 0; i < grades.length; i++) { //Prints every value of the 'grades' array in one line
            System.out.print(grades[i] + " ");
        }
        System.out.printf("\n\n");
        //----------------------------------------------------------------------Binary Search
        System.out.print("Enter a grade to search for: "); //Prompts user to enter a grade to search for
        int binaryGradeSearch = intCheck(); //User input is obtained from 'intCheck' method
        int[] binarySearchResult = binarySearch(grades,binaryGradeSearch); //Binary search results are obtained from 'binarySearch' method
        if (binarySearchResult[0] == 1) { //Runs if the first value of 'binarySearchResult' is 1 (true)
            System.out.println(binaryGradeSearch + " was found in the list with " + binarySearchResult[2] + " iterations."); //Tells the user that the target value was found and the number of iterations it took
        }
        else { //Runs if the target value was not found
            System.out.println(binaryGradeSearch + " was not found in the list with " + binarySearchResult[2] + " iterations."); //Tells the user that the target value was not found and the number of iterations it took
        }
        //----------------------------------------------------------------------Scramble the array
        int[] scrambledGrades = arrayScrambler(grades); //Scrambled array is obtained from method 'arrayScrambler'
        System.out.printf("\nScrambled array:\n"); //Array header
        for (int i = 0; i < scrambledGrades.length; i++) { //Prints each value of the scrambled array
            System.out.print(scrambledGrades[i] + " ");
        }
        System.out.printf("\n\n");
        //----------------------------------------------------------------------Linear Search
        System.out.print("Enter a grade to search for: "); //Prompts the user for a grade to search for
        int linearGradeSearch = intCheck(); //Obtains target value from 'intCheck' method
        int[] linearSearchResult = linearSearch(scrambledGrades,linearGradeSearch); //Linear search results are obtained from 'linearSearch' method
        if (linearSearchResult[0] == 1) { //Runs if the first value in 'linearSearchResult' is 1 (true)
            System.out.println(linearGradeSearch + " was found in the list with " + linearSearchResult[2] + " iterations."); //Tells the user that the target value was found anf the number of iterations it took
        }
        else { //Runs if the target value was not found
            System.out.println(linearGradeSearch + " was not found in the list with " + linearSearchResult[2] + " iterations."); //Tells the user that the target value was not found and the number of iterations it took
        }
    }
}