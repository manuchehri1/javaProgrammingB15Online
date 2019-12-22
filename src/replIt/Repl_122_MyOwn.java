package replIt;

import java.util.Scanner;

public class Repl_122_MyOwn {
    public static void main(String[] args) {
//        Given an array nums with 7 integers every element is repeated twice - except one.
//            Find that element and print it to console.
//
//        Example:
//
//        nums -> [1, 1, 2, 3, 4, 3, 4]
//        2
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int count = 0;
        int tempNumber = 0;
       for (int i= 0 ; i< nums.length;i++){
           for (int j=(0); j< nums.length; j++){
               if(nums[i] == nums[j]){
                   count++;
               }
           }
           if(count <2) {
               tempNumber = nums[i];
           }
           count =0;
       }

        System.out.println(tempNumber);




    }
}
