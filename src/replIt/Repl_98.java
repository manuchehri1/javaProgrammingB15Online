package replIt;

import java.util.Scanner;

public class Repl_98 {
    public static void main(String[] args) {

//        Print out the number of times that the string "hi" appears anywhere in the given string.
//        Example:
//        input: abc hi how hi
//        output: 2

//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
        //012345678901
       // hi asncka hi
        //            012345678<
        String str = "hsvdlskhi";

        int count=0;
        String hello="";

        for (int i = 0; i < str.length()-"hi".length()+1; i++) {
            if (str.substring(i,i+2).equalsIgnoreCase("hi")){
                ++count;
            }
        }
        System.out.println(count);



    }
}
