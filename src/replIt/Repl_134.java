package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_134 {
    public static void main(String[] args) {
//        Given two arrays of ints sorted in increasing order, outer and inner,
//        print out true if all of the numbers in inner appear in outer.
//        Take advantage of the fact that both arrays are already in sorted order.
//                Example:
//        input (outer): 1, 2, 4, 6
//        input (inner): 2, 4
//        output: true
//
//        Example:
//        input (outer): 1, 2, 4
//        input (inner): 6, 5
//        output: false
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE

      //  System.out.println(Arrays.toString(outer));
        String innerItems=Arrays.toString(inner);

       // System.out.println(Arrays.toString(inner));
        String outerItems= Arrays.toString(outer);
        String str="true";
        for (int i=0; i<inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (inner[i]==outer[j]){
                    break;
                }

                //
                if( j == outer.length-1 &&  inner[i]!=outer[j]) {
                    str="false";
                }
            }

            if(str =="false"){
                break;
            }
        }
        System.out.println(str);






    }
}
