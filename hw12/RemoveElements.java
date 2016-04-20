//Trevor Hayes
//CSE002
//hw12-RemoveElements

//This program utilizes several different methods to manipulate the contents of arrays in various ways

import java.util.Scanner;
import java.util.Random;
public class RemoveElements{
    public static String listArray(int num[]) {
    	String out="{";
    	for (int j = 0; j < num.length; j++) {
          	if (j > 0) {
    	    out += ", ";
            }
            out += num[j];
	    }
        out += "} ";
	    return out;
    }
    public static int[] randomInput() { //Method 'randomInput' returns an integer array
        Random rand = new Random(); //Declare new randmo number generator
        int[] randomArray = new int[10]; //Create integer array 'randomArray' of size 10
        //For loop that fills each member of 'randomArray' with a random number between 0 and 9
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(10);
        }
        return randomArray; //Returns the randomly generated array
    }
    public static int[] delete(int[] list, int pos) { //Method 'delete' that takes in an integer array and an int and returns an integer array
        int[] listDeleted = new int[list.length - 1]; //Create an integer array that is one less than the input array
        //Copies the values of the input array to the created array until the specified index is reached
        for (int i = 0; i < pos; i++) {
            listDeleted[i] = list[i];
        } 
        //Skips the specified index and continues copying the remainder of the input array's values into the created array
        for (int i = pos + 1; i < listDeleted.length; i++) {
            listDeleted[i - 1] = list[i];
        }
        return listDeleted; //Returns the newly created array
    }
    public static int[] remove(int[] list, int target) { //Method 'remove' that takes in an integer array and an int and returns an integer array
        int instances = 0; //Declares integer 'instances' to count the number of times the target number appears in the input array
        //Every time the target number is found in the input array, 'instances' is iterated by one
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                instances++;
            }
        }
        int[] listRemoved = new int[list.length - instances]; //New integer array 'listRemoved' is created whose length is the value of 'instances' subtracted from the length of the input array
        int j = 0; //Dummy variable 'j'
        //Copies values of the input integer array into the newly created array as long as the value being copied is not equal to the target value
        for (int i = 0; i < listRemoved.length; i++) {
            //If the value to be copied in the input integer array is equal to the target value, it is skipped
            if (list[j] == target) {
                do {
                    j++;
                } while (list[j] == target); //Extra do while loop protects against adjacent target numbers
            }
            listRemoved[i] = list[j];
            j++;
        }
        return listRemoved; //Returns the newly created integer array
    }
    public static void main(String [] arg){
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
    	String answer = "";
    	do{
          	System.out.println("Random input 10 ints [0-9]");
          	num = randomInput();
          	String out = "The original array is:";
          	out += listArray(num);
          	System.out.println(out);
         
          	System.out.print("Enter the index ");
          	index = scan.nextInt();
          	if (index < 0 || index > 9) {
          	    System.out.println("The index is not valid.");
          	    String out1 = "The output array is ";
          	    out1 += listArray(num); //return a string of the form "{2, 3, -9}"  
            	System.out.println(out1);
          	}
          	else {
                newArray1 = delete(num,index);
                String out1 = "The output array is ";
                out1 += listArray(newArray1); //return a string of the form "{2, 3, -9}"  
                System.out.println(out1);
          	}
          	
            System.out.print("Enter the target value ");
          	target = scan.nextInt();
          	newArray2 = remove(num,target);
          	String out2 = "The output array is ";
          	out2 += listArray(newArray2); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
          	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
          	answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }
}
