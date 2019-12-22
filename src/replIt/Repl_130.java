package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_130 {
    public static void main(String[] args) {


                                                                        //3  5  2  6
                                                                       // 3  2  5  6
//        Modify an array that is "left shifted" by one -- so            {6, 2, 5, 3} becomes .
//        You may modify and print the given array, or print a new array.{2, 5, 3, 6}
//                Example:
//        input: 6, 2, 5, 3
//        output: [2, 5, 3, 6]
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("nums before "+Arrays.toString(nums));
//        int temp = nums[0];
//       nums[0]=nums[1];
//       nums[1]=nums[2];
//       nums[2]=nums[3];
//       nums[3]=temp;

        int temp= nums[0];
        for (int i = 0; i < size; i++) {
            if (i==size-1){
                nums[i]=temp;
            }else {
                nums[i] = nums[i + 1];
            }

        }
        System.out.println("nums = " + Arrays.toString(nums));


    }
}
