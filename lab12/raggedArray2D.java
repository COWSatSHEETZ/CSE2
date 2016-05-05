//Trevor Hayes
//CSE002
//lab12-2DRaggedArray

import java.util.Scanner;
import java.util.Random;
public class raggedArray2D {
    //--------------------------------------------------------------------------
    public static int typeCheck() {
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
    //--------------------------------------------------------------------------
    public static int[][] randomArray(int[][] list2D) {
        Random rand = new Random();
        for (int i = 0; i < list2D.length; i++) {
            list2D[i] = new int[rand.nextInt(list2D.length) + 1];
        }
        return list2D;
    }
    //--------------------------------------------------------------------------
    public static int[][] randomFill(int[][] raggedList2D) {
        Random rand = new Random();
        for (int i = 0; i < raggedList2D.length; i++) {
            for (int j = 0; j < raggedList2D[i].length; j++) {
                raggedList2D[i][j] = rand.nextInt(21);
            }
        }
        return raggedList2D;
    }
    //--------------------------------------------------------------------------
    public static int[][] insertionMainSort(int[][] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (list[j + 1].length < list[j].length) {
                    int [] temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
    //--------------------------------------------------------------------------
    public static int[][] insertionInnerSort(int[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list[i].length; j++) {
                for (int k = j - 1; k >= 0; k--) {
                    if (list[i][k + 1] < list[i][k]) {
                        int temp = list[i][k + 1];
                        list[i][k + 1] = list[i][k];
                        list[i][k] = temp;
                    }
                }
            }
        }
        return list;
    }
    //--------------------------------------------------------------------------
    public static String[] arrayToString(int[][] list) {
        String[] array = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            array[i] = "{";
            for (int j = 0; j < list[i].length; j++) {
                if (j > 0) {
                    array[i] += ", ";
                }
                if (list[i][j] < 10) {
                    array[i] += " ";
                }
                array[i] += list[i][j];
            }
            array[i] += "}";
        }
        return array;
    }
    //--------------------------------------------------------------------------
    public static int[] binarySearch(int list[][], int target) {
        for (int i = 0; i < list.length; i++) {
            int first = 0, last = list[i].length - 1, middle;
            middle = (list[i].length - 1)/2;
            int j = 1;
            while (first <= last) {
                if (list[i][middle] < target) {
                    first = middle + 1;
                }
                else if (list[i][middle] == target) {
                    int result[] = {1, middle, i, j};
                    return result;
                }
                else {
                    last = middle - 1;
                }
                middle = (first + last)/2;
                j++;
            }
        }
        int result[] = {0, 0, 0, 0};
        return result;
    }
    //--------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.print("Please enter the size of the main array: ");
        int size = typeCheck();
        int[][] raggedArray = new int[size][];
        raggedArray = randomArray(raggedArray);
        raggedArray = randomFill(raggedArray);
        String[] unsortedArray = arrayToString(raggedArray);
        raggedArray = insertionInnerSort(raggedArray);
        String[] sortedArray = arrayToString(raggedArray);
        raggedArray = insertionMainSort(raggedArray);
        String[] rearrangedArray = arrayToString(raggedArray);
        System.out.println("Here is your unsorted array:");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }
        System.out.printf("\nHere is your sorted array:\n");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
        System.out.printf("\nHere is your rearranged array:\n");
        for (int i = 0; i < rearrangedArray.length; i++) {
            System.out.println(rearrangedArray[i]);
        }
        int[] result = new int[4];
        System.out.print("What number would you like to search for? ");
        int search = typeCheck();
        result = binarySearch(raggedArray,search);
        if (result[0] == 1) {
            System.out.println("Column " + (result[1] + 1) + " Row " + (result[2] + 1));
        }
        else {
            System.out.println("Not in the array");
        }
    }
}