package replIt;

import java.util.Scanner;

public class Repl_120 {
    public static void main(String[] args) {
//        Given the array words, it will print the word with the largest length.
//        Assume that there are no 2 words with longest length
//
//        Example:
//        words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//        prints jaaaaavvaaaaaaaaaa
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
        int largestElement=words[0].length();
        int elementNum=0;
        String largestItem=words[0];
        for (int i=0; i<words.length; i++){

            if (words[i].length()>largestElement){
                largestElement=words[i].length();
                largestItem=words[i];

            }
        }
        System.out.println(largestItem);
    }
}
