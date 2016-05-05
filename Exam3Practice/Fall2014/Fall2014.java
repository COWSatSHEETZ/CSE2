import java.util.Random;
public class Fall2014 {
    public static boolean search(int[] myArray, int target, int minRange, int maxRange) {
        boolean found = false;
        if (minRange <= maxRange && minRange >= 0 && maxRange <= myArray.length) {
            for (int i = minRange; i <= maxRange; i++) {
                if (myArray[i] == target) {
                    found = true;
                    return found;
                }
            }
        }
        return found;
    }
    public static int[] resize(int[] myArray, int newsize) {
        int[] newArray = new int[newsize];
        if (newsize <= myArray.length) {
            for (int i = 0; i < newsize; i++) {
                newArray[i] = myArray[i];
            }
        }
        else {
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i];
            }
            for (int i = myArray.length; i < newsize; i++) {
                newArray[i] = 0;
            }
        }
        return newArray;
    }
    public static int[] noReps(int[] myArray) {
        int[] result = new int[myArray.length];
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            boolean found = search(myArray, myArray[i], 0, (i - 1));
            if (!found) {
                result[j] = myArray[i];
                j++;
            }
        }
        result = resize(result,j);
        return result;
    }
    public static int[] randomArray() {
        Random rand = new Random();
        int[] random = new int[10];
        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(10);
        }
        return random;
    }
    public static void main(String[] args) {
        int[] random = randomArray();
        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i] + " ");
        }
        System.out.println();
        int[] result = noReps(random);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}