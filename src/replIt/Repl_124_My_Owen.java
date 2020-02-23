package replIt;

import java.util.Arrays;

public class Repl_124_My_Owen {
    public static void main(String[] args) {
//        Given an array nums with 7 integers already assigned, write code to reverse it.
//        Do not use any additional arrays or Strings.
//
//        Example:
//
//        nums -> [4, 3, 2, 44, 1, 100, 55]
//        change it to:
//        nums -> [55, 100, 1, 44, 2, 3, 4]
//
//        PseudoCode:
//
//        1. Take values at index 0 and last index and swap them
//        2. Take values at index 0+1 and last index-1 and swap them
//        3. Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)
//
//        How to swap values:
//        Example:
//
//        int temp = nums[0];
//        nums[0] = nums[4];
//        nums[4] = temp;
                     //0,1,2,3,4,5
        int[] array = {1,2,3,4,5,6,7};
       // System.out.println();
        int [] reverse=new int[array.length];

        for (int i = array.length-1; i >=0 ; i++) {
            reverse[i]=reverse[i];
        }
        System.out.println(Arrays.toString(reverse));



//        for (int i = 0; i < (array.length-1)/2 ; i++) {
//            int temp = array[i]; // 1, 2
//            array[i] = array [(array.length-1)-i]; // 7, 6
//            array[(array.length-1)-i] =  temp; // 1,2
//
//        }
//
//        for (int reverse:array) {
//            System.out.print(reverse);
//        }

    }
}
