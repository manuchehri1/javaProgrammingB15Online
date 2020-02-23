package replIt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Repl_215 {
    public static void main(String[] args) {
//        Create a method that:
//
//        is called twoTimes
//        returns a new ArrayList of Integers
//        takes in a single parameter - an ArrayList of Integers
//
//        This method should create a new ArrayList of Integers that
//        contains every value of the ArrayList parameter repeated twice.
//
//        For example, if the parameter is
//                (1,5,3,7)
//        The method should return a new ArrayList of Integers with
//                (1,1,5,5,3,3,7,7)
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
//        ArrayList< Integer> newNum = new ArrayList<>();
//        nums.add(1,nums.get(0)); // 1,5,3,7 ---> 1,1,5,3,7-->>1,1,5,5,3,7
//        nums.add(3,nums.get(2));
//        nums.add(5,nums.get(4));
        System.out.println(twoTimes(nums));


    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums ){
        ArrayList<Integer> newNums= new ArrayList<>();
        int j=1;
        for (int i = 0; i < nums.size(); i+=2) {
            nums.add(j,nums.get(i));
            j+=2;
        }
        newNums.addAll(nums);
        return  newNums;
    }
}
