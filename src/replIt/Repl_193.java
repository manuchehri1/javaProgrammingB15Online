package replIt;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Repl_193 {
    public static void main(String[] args) {
//        combine two String arrays into one arraylist and return it as a string.
//
//        for example:
//
//        combineRs(["f","o","o"],[" b","a","r"])
//        returns "foo bar"
//
//
//        combineRs(["1","2","3"],[" 4"])
//        returns "1234"
        String [] lst1={"f","o","o"};
        String [] lst2={" b","a","r"};
//
        System.out.println(combineRs(lst1,lst2));
    }
    public static String combineRs(String[] r1,String[] r2)
    {
        String merged="";
        ArrayList<String> lst= new ArrayList<>(Arrays.asList(r1));
        lst.addAll(Arrays.asList(r2));
        //System.out.println(lst.size());
        for (int i = 0; i < lst.size(); i++) {
            merged=merged+lst.get(i);
        }
        return merged;
    }
}
