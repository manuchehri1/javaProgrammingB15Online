package replIt;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;

public class Repl_202 {
    public static void main(String[] args) {
//        Create a method that:
//        is called timesTwo
//        returns nothing
//        takes in a single parameter - an ArrayList of Integers called nums
//
//        This method should take the ArrayList parameter and multiply every
//        value by two.

        ArrayList<Integer> myNum=new ArrayList<>(Arrays.asList(1,2,3,4));
        timesTwo(myNum);
    }
    public static void timesTwo(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i,2*nums.get(i));
        }
        System.out.println(nums);
    }
}
