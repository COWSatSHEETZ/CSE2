//Trevor Hayes
//CSE002
//hw12-Holoporter

//This program generates a 3D matrix and assigns coded values to each member. 
//It then sloppily recreates that matrix and offers the capability to search it 
//for a specific code and calculate the percent difference between the two. 
//Finally it sorts the recreated array.

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Holoporter {
    //--------------------------------------------------------------------------
    public static String[][][] soRandom() { //This method generates a randomly sized 3D array. 
        Random rand = new Random(); //For random number generation
        String[][][] random = new String[rand.nextInt(10) + 1][][]; //First dimension of the generated array is an integer between 1 and 10
        for (int i = 0; i < random.length; i++) { //Each member of the first dimension of the array is assigned a random length between 1 and 10
            random[i] = new String[(rand.nextInt(10) + 1)][];
        }
        for (int i = 0; i < random.length; i++) { //Each member of the second dimension of the array is assigned a random length between 1 and 10
            for (int j = 0; j < random[i].length; j++) {
                random[i][j] = new String[(rand.nextInt(10) + 1)];
            }
        }
        return random; //Returns randomly generated array
    }
    //--------------------------------------------------------------------------
    public static String coder() { //Randomly generates a code to be stored in the matrices
        Random rand = new Random();
        String code = ""; //Start of the code
        int i; //Declare counter integer 'i'
        for (i = 0; i < 2; i++) { //Random uppercase character is assigned to the first two values of the code string
            code += (char) (rand.nextInt(26) + 'A');
        }
        for (i = i; i < 6; i++) { //Random integer between 0 and 9 is assigned to the last four values
            code += rand.nextInt(10);
        }
        return code; //Returns the generated code
    }
    //--------------------------------------------------------------------------
    public static void print(String[][][] printArray){ //Converts the 3D array to a string to be printed
        String array = ""; //Starts string
        for (int i = 0; i < printArray.length; i++) {
            if (i > 0) { //If it's not the first set in the outermost dimension, '---' is added to the string
                array += "---";
            }
            for (int j = 0; j < printArray[i].length; j++) {
                if (j > 0) { //If it's not the first set in the 2nd dimension, ' | ' is added to the string
                    array += " | ";
                }
                array += "["; //At the start of each inner most array, '[' is printed
                for (int k = 0; k < printArray[i][j].length; k++) {
                    if (k > 0) { //If it's not the first set in the innermost dimension, ' , ' is printed
                        array += " , ";
                    }
                    array += printArray[i][j][k]; //The value currently being referenced is printed
                }
                array += "]"; //Adds a ']' at the end of each innermost array
            }
        }
        System.out.println(array); //Prints the newly created string
        System.out.println(); //New line in terminal
    }
    //--------------------------------------------------------------------------
    public static String[][][] holoport(String[][][] firstArray, String[][][] copyArray) { //This method copies as much of the original array as it can to the new array
        //'$$$$$$' is put into each member of the new 3D array
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray[i].length; j++) {
                for (int k = 0; k < copyArray[i][j].length; k++) {
                    copyArray[i][j][k] = "$$$$$$";
                }
            }
        }
        //As long as the location being referenced in the 3D array is not past the end of the length of the new array or the original array, the value in the original array is copied to the new array
        int first = 0; //'first' is set to 0
        while (first < copyArray.length && first < firstArray.length) {
            int second = 0; //'second' is set to 0
            while (second < copyArray[first].length && second < firstArray[first].length) {
                int third = 0; //'third' is set to 0
                while (third < copyArray[first][second].length && third < firstArray[first][second].length) {
                    copyArray[first][second][third] = firstArray[first][second][third]; //Copy the value to the new array
                    third++; //Iterate 'third'
                }
                second++; //Iterate 'second'
            }
            first++; //Iterate 'first'
        }
        return copyArray; //Return the newly copied array
    }
    //--------------------------------------------------------------------------
    public static void sampling(String[][][] list3D) { //This method searches the input array for the desired code and indicates if it was found.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code you wish to search for: "); //Prompts user for code
        boolean check = true; //Boolean 'check' is set equal to true
        String input = sc.nextLine(); //User input is stored into 'input'
        while (check) { //Runs while 'check' is true
            if (input.length() != 6) { //If the user's input is not 6 characters long, an error message is displayed
                System.out.println("Invalid input, try again:");
                input = sc.nextLine(); //Next input is stored
                continue; //Continues to the end of the while loop
            }
            String num = input.substring(2); //Puts the last four characters in the input string into 'num'
            int number;
            if (!Character.isLetter(input.charAt(0)) || !Character.isLetter(input.charAt(1))) { //Checks that the first two characters in the input are letters
                System.out.println("Invalid input, try again:"); //If not, an error message is displayed
                input = sc.nextLine(); //Next input is stored
                continue; //Continues to the end of the while loop
            }
            try {
                number = Integer.parseInt(num); //Checks that all four of the last four characters in 'input' are integers
                check = false; //If the last four characters are numbers, the code is accepted and 'check' is changed to false
            }
            catch (Exception ex) { //If any character is not an integer (parseInt fails) an error is printed.
                System.out.println("Invalid input, try again:");
                input = sc.nextLine(); //Next input is stored
            }
        }
        for (int i = 0; i < list3D.length; i++) {
            for (int j = 0; j < list3D[i].length; j++) {
                for (int k = 0; k < list3D[i][j].length; k++) {
                    //Searches each member of the array for the input code
                    if(input.equals(list3D[i][j][k])) {
                        System.out.print("Code Found!\nLocation:\nx: " + i + "\ny: " + j + "\nz: " + k + "\n"); //If the code os found, it's location is displayed
                        System.out.println();
                        return; //Exits the method
                    }
                }
            }
        }
        System.out.println("Code not found."); //If code is not found, error message is displayed.
        System.out.println();
    }
    //--------------------------------------------------------------------------
    public static void percentage(String[][][] firstArray, String[][][] copyArray) { //This method calculates the percent difference between the original array and the copied array
        int firstCount = 0, copyCount = 0; //Declares the variables that will count the members in each array
        //Counts the number of members in the original array
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                for (int k = 0; k < firstArray[i][j].length; k++) {
                    firstCount++;
                }
            }
        }
        //Counts the number of members in the copied array
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray[i].length; j++) {
                for (int k = 0; k < copyArray[i][j].length; k++) {
                    copyCount++;
                }
            }
        }
        double difference = ((double) (copyCount - firstCount)/firstCount)*100; //Calculates the difference in the number of members in each array
        System.out.println("The difference between the two arrays is " + difference + "%"); //Displays the difference
        System.out.println();
    }
    //--------------------------------------------------------------------------
    public static String[][][] frankenstein(String[][][] array3D) {
        //Goes through every member of the second dimension array. Because all members in the third dimension array are in the same format, Arrays.sort can be used to sort them in ascending order
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                Arrays.sort(array3D[i][j]);
            }
        }
        //Insertion sort method to sort the second dimension array
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 1; j < array3D[i].length; j++) {
                //Searches all index values less than the index currently being focused on
                for (int k = j - 1; k >= 0; k--) {
                    if (array3D[i][k + 1].length < array3D[i][k].length) { //If the next member array is longer than the current member, they are swapped
                        String[] temp = array3D[i][k + 1];
                        array3D[i][k + 1] = array3D[i][k];
                        array3D[i][k] = temp;
                    }
                }
            }
        }
        return array3D; //Returns the sorted array
    }
    //--------------------------------------------------------------------------
    public static void main(String[] args) {
        String[][][] firstArray = soRandom(); //New array is initialized
        //Counts the number of members in the array
        int memberCount = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                for (int k = 0; k < firstArray[i][j].length; k++) {
                    memberCount++;
                }
            }
        }
        String[] codes = new String[memberCount]; //New string array that stores the codes used
        int counter = 0; //Tells how many values are stored in the codes array
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                for (int k = 0; k < firstArray[i][j].length; k++) {
                    String code = coder(); //A code is randomly generated
                    int n; //Dummy varaible 'n' is declared
                    for (n = 0; n < counter; n++) { //Searchs the code array up until the last value that is stored
                        //If the generated code is equal to an already generated code, a new code is generated and 'n' is reset
                        if (code.equals(codes[n])) {
                            code = coder();
                            n = -1;
                        }
                    }
                    firstArray[i][j][k] = code; //The code is stored in the 3D array
                    codes[counter] = code; //The code is stored in the code array
                    counter++; //'counter' is iterated
                }
            }
        }
        System.out.println("Created Array:");
        print(firstArray); //'firstArray' is fed to the method 'print'
        String[][][] copyArray = soRandom(); //Another array is created
        copyArray = holoport(firstArray,copyArray); //The first array is kind of copied to the new array
        System.out.println("Copied Array:");
        print(copyArray); //The new array is fed to the method 'print'
        sampling(firstArray); //Sends the original array into the method 'sampling'
        percentage(firstArray,copyArray); //The first and copied array are fed to the method 'percentage'
        firstArray = frankenstein(firstArray); //Feeds 'firstArray' to the method 'frankenstein'
        System.out.println("Frankenstien Array:");
        print(firstArray); //Prints out the frankenstein array
    }
}