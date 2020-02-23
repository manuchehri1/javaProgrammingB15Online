package replIt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Repl_201 {
    public static void main(String[] args) {
//        Create a static method that:
//
//        is called appendPosSum
//        returns an ArrayList of Integers
//        takes one parameter: an ArrayList of Integers
//
//        This method should:
//        Create a new ArrayList of Integers
//        Add only the positive Integers to the new ArrayList
//        Sum the positive Integers in the new ArrayList and add the Sum as the last element
//
//        For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
//        the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
//        The original ArrayList should remain unchanged.
        ArrayList<Integer> myNum=new ArrayList<>();
        myNum.addAll(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(myNum));
    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
        ArrayList<Integer> nums2=new ArrayList<>();
        int sum=0;
        for (int i = 0; i <nums.size() ; i++) {

            if (nums.get(i)>0){
                nums2.add(nums.get(i));
                sum=sum+nums.get(i);
            }
        }
        nums2.add(sum);
        return nums2;
    }
}
