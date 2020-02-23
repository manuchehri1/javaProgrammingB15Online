package replIt;

public class Repl_210_my {
//    Reverse a string without affecting special characters
//    Given a string, that contains special character together
//    with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
//    reverse the string in a way that special characters are not affected.
//
//
//    Input:   str = "a,b$c"
//    Output:  str = "c,b$a"
//    Note that $ and , are not moved anywhere.
//    Only subsequence "abc" is reversed.
//
//    Input:   str = "Ab,c,de!$"
//    Output:  str = "ed,c,bA!$"
//
//    Input:   str = "----qwe--r--tyf...gd.---"
//    Output:  str = "----dgf--y--tre...wq.---"



    public static void main(String[] args) {

        System.out.println(reverseLetters("----qwe--r--tyf...gd.---"));
    }

    public static String reverseLetters(String word){
        //TODO
        String real=word;
        String reverse="";

        String temp="";
        for (int i = real.length()-1; i >=0 ; i--) {
            if (real.charAt(i)>66 || real.charAt(i)<122  ){
                reverse+=real.charAt(i);
            }
        }
        int indexOfReverse = 0;
        for (int i = 0; i < real.length() ; i++) {

            if (real.charAt(i)>65 || real.charAt(i)<122){
                temp+=reverse.charAt(indexOfReverse);
            }else {
                temp+=real.charAt(i);
            }
        }

        return temp;
    }
}
