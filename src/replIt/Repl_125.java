package replIt;

import java.util.Scanner;

public class Repl_125 {
    public static void main(String[] args) {
//        Write a program that will print the shortest word in the given array str.
//
//        input: java, cable, red, vivid, remedy, grace
//        output: red

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        int minCount=str[0].length();
        String minItem="";

        for (int i = 0; i <str.length ; i++) {
            if (str[i].length()<=minCount){
                minCount=str[i].length();
                minItem=str[i];
            }
        }
        System.out.println(minItem);





    }
}
