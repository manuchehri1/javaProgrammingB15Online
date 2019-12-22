package replIt;

import java.util.Scanner;

public class Repl_99 {
    public static void main(String[] args) {
//        Given a string, consider the prefix string made of the first n chars of the string.
//        Does that prefix string appear somewhere else in the string?
//                Assume that the string is not empty and that n is in the range from 1 till str.
//              length().
//                Example:
//        input: abXYabc
//        input: 1
//        output: true
//        a appears twice
//        Example:
//        input: abXYabc
//        input: 2
//        output: true
//        ab appears twice

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int count=0;
        //    0123456
        //    hikachi
        String substre = str.substring(0,n);
        for (int i = 0; i < str.length()-n+1; i++) {
            if (str.substring(i,i+n).equalsIgnoreCase(substre)){
                ++count;
            }
        }
        if(count > 1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }






    }
}
