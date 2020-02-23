package CodeBat;

import java.util.Scanner;

public class Warm_Up1 {
    public static void main(String[] args) {

//        Given a string, return a new string where "not " has been added to the front.
//        However, if the string already begins with "not", return the string unchanged.
//        Note: use .equals() to compare 2 strings.
//         notString("candy") → "not candy"
//        notString("x") → "not x"
//        notString("not bad") → "not bad"

        Scanner scan = new Scanner(System.in);
//        String notWord = scan.next();
//
//         if (notWord.startsWith("not")){
//            System.out.println(notWord);
//        }else {
//            String not = "not ";
//            System.out.println(not+notWord);
//        }


//        Given two int values, return their sum. Unless the two values are the same,
//        then return double their sum.
//
//
//        sumDouble(1, 2) → 3
//        sumDouble(3, 2) → 5
//        sumDouble(2, 2) → 8
//        int num1 = scan.nextInt();
//         int num2=scan.nextInt();
//
//         if (num1!=num2){
//             System.out.println(num1+num2);
//         }else {
//             System.out.println((num1+num2)*2);
//         }


//        Given a string, we'll say that the front is the first 3 chars of the string.
//        If the string length is less than 3, the front is whatever is there.
//        Return a new string which is 3 copies of the front.
//
//
//        front3("Java") → "JavJavJav"
//        front3("Chocolate") → "ChoChoCho"
//        front3("abc") → "abcabcabc"

        String word = scan.next();
        String first3Letter= word.substring(0,3);
        System.out.println(first3Letter+first3Letter+first3Letter);






    }
}