import java.util.Scanner;
public class Practice {
    public static int[] linearSearch(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                int[] result = {1, i};
                return result;
            }
        }
        int[] result = {0, list.length};
        return result;
    }
    public static void main(String[] args){
        int[] a = {6,7,5,4,9,5,6,2,4};
        int b = 8;
        int[] c = linearSearch(a,b);
        System.out.println(c[0] + " " + c[1]);
    }
}