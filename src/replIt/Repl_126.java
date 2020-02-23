package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_126 {
    public static void main(String[] args) {
//        Write a program that will find out shortest words in the given string str.
//        If there are few words that are evenly short, print them all. Use split method in
//        order to split str string variable and create an array of strings.  Print array with Arrays.
//        toString() method. Sort array before printing.
//        Split values by comma: split(", ");
//        input: [olive, fish, pursuit, old, warning, python, java, coffee, cat, ray]
//        output: [cat, old, ray]
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strArray =str.split(", ");
       //[olive,  fish, pursuit, old, warning, python, java, coffee, cat, ray]
        // Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
        int shortest = strArray[0].length();
        String shortestWords="";
        for (int i = 1; i < strArray.length; i++) {
            if (strArray[i].length() < shortest){
                shortest=strArray[i].length();
            }
        }

        for (int j= 0; j< strArray.length; j++){
            if(strArray[j].length()== shortest){
                shortestWords += strArray[j] + ",";
            }
        }
        // cat,ray,top,--->>

        String shortWords=shortestWords.substring(0,shortestWords.length()-1);
        shortestWords.trim();
        //System.out.println("shortWords = " + shortWords);
        String[] shortdWord=shortWords.split(",");
        Arrays.sort(shortdWord);
        System.out.println(Arrays.toString(shortdWord));


    }
}
