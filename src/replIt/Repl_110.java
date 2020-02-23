package replIt;

import java.util.Scanner;

public class Repl_110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below
        for(int i=0; i<words.length; i++){
            String firsletter=words[i].substring(0,1);
            String lastletter=words[i].substring(words[i].length()-1);
            System.out.println(firsletter+lastletter);
        }



    }
}
