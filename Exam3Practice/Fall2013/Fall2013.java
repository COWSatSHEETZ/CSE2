import java.util.Random;
public class Fall2013 {
    public static double dot(double[] u, double[] v) {
        double dotSum = 0;
        if (u.length == v.length) {
            for (int i = 0; i < u.length; i++) {
                dotSum += u[i]*v[i];
            }
        }
        else {
            System.out.println("u and v are not equal length.");
        }
        return dotSum;
    }
    public static int findMinInRange(int[] A, int min, int max) {
        int smallest = A[min];
        int index = min;
        if (min <= max) {
            for (int i = min + 1; i <= max; i++) {
                if (A[i] < smallest) {
                    smallest = A[i];
                    index = i;
                }
            }
        }
        else {
            System.out.println("unacceptable input");
            index = -1;
        }
        return index;
    }
    public static int[] swapMember(int[] A, int first, int second) {
        if (first >= 0 && second >=0){
            int temp = A[first];
            A[first] = A[second];
            A[second] = temp;
        }
        else {
            System.out.println("unacceptable input");
        }
        return A;
    }
    public static void sort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int index = findMinInRange(A,i,(A.length - 1));
            A = swapMember(A,i,index);
        }
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    public static int[] randomArray() {
        Random rand = new Random();
        int[] random = new int[10];
        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(101);
        }
        return random;
    }
    public static void main(String[] args) {
        int[] A = randomArray();
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        sort(A);
    }
}