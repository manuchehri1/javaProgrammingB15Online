package replIt;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_213 {
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1,1,2,3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,1));


    }
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n)
    {
        for (int i = 0; i < r.size(); i++) {

            if (r.get(i)==n){
                r.remove(i);
                --i;
            }
        }
        return r;
    }
}
