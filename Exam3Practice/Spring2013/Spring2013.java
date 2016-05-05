public class Question1 {
    public static int[] makeZeros(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = 0;
        }
        return array;
    }
    public static int findLongest(int[][] list) {
        int longest = list[0].length;
        for (int i = 1; i < list.length; i ++) {
            if (list[i].length > longest) {
                longest = list[i].length;
            }
        }
        return longest;
    }
    public static void computeAvgs(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        int evenCount = 0, oddCount = 0, evenSum = 0, oddSum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]%2 == 0) {
                evenCount++;
                evenSum += list[i];
            }
            else {
                oddCount++;
                oddSum += list[i];
            }
        }
        double evenAvg = ((double) evenSum)/evenCount;
        double oddAvg = ((double) oddSum)/oddCount;
        System.out.print("Even average: " + evenAvg + "\nOdd average: " + oddAvg + "\n");
    }
    public static double getSum(double[] list) {
        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        return sum;
    }
    public static void main (String[] args) {
        int[] zeroArray = makeZeros(5);
        double[] list = new double[6];
        list[0] = 3;
        list[1] = 9;
        list[2] = 5;
        list[3] = 2;
        list[4] = 10;
        list[5] = 8;
        double sum = getSum(list);
        System.out.println(sum);
    }
}