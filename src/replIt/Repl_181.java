package replIt;

import java.lang.reflect.Array;

public class Repl_181 {
    public static void main(String[] args) {

//        wordCount("foo bar")
//        returns 2
//
//        wordCount("one two three")
//        returns 3
//
//        wordCount("bla")
//        returns 1
//
//        hint:
//
//        https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)



    }
    public static int wordCount(String words) {
        int count=0;
        String[] arr= words.split(" ");
        count=arr.length;
        return count;

    }
}
