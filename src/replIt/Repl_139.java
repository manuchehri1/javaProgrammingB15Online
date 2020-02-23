package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_139 {
    public static void main(String[] args) {
//        Given an int array of any length, print a new array of its first 2 elements.
//        If the array is smaller than length 2, use whatever elements are present.
//
//        Example:
//        input 1, 2, 3
//        output: [1, 2]
//
//        Example:
//        input 1,
//        output: [1]


        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }




        if (num.length<2) {
            int [] arr2=new int[num.length];
            arr2[0]=num[0];
            System.out.println(Arrays.toString(arr2));
        }else {
            int[] arr = {num[0],num[1]};
            System.out.println(Arrays.toString(arr));
        }





    }
}
