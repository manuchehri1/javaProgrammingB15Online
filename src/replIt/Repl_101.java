package replIt;

import java.util.Scanner;

public class Repl_101 {
    public static void main(String[] args) {
        /*
        Given a string, print out true if the number of appearances of "java"
        anywhere in the string is equal to the number of appearances of "python"
        anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
         */
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int javaCount=0;
        int pythonCount=0;

        for (int i = 0; i < sentence.length()-3; i++) {
            if (sentence.substring(i,i+4).equals("java")){
                javaCount++;
            }
        }
        for (int x = 0; x < sentence.length()-5; x++) {
            if (sentence.substring(x,x+6).equals("python")){
                pythonCount++;
            }
        }
        if (javaCount==pythonCount){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        
        
        
    }
}
