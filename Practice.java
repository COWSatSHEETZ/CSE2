import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        int[] a = new int[] {1,2,3,4};
        int[] b = new int[] {4,5,6,7,8,9};
        //a[] = ;
        //b[] =;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        a = b;
        a[0] = 20;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}