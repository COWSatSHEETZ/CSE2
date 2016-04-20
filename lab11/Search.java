//Trevor Hayes
//CSE002
//lab11-Search

//

import java.util.Scanner;
import java.util.Random;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
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
        
        /*for (int i = 0; i < arrayLength; i++){
            System.out.println(arrayOne[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayLength; i++){
            System.out.println(arrayTwo[i]);
        }*/
    }
}