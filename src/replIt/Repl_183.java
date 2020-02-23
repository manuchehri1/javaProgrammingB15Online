package replIt;

public class Repl_183 {
    public static void main(String[] args) {
//        This method gets a string and an int, it returns a string.
//
//        what it dose is limit the inputted string to a cretin number of characters.
//
//        for example:
//
//        limit("abcd",2)
//        returns "ab"
//
//        limit("bla bla",3)
//        returns "bla"
        System.out.println(limit("bla bla",3));


    }
    public static String limit(String text, int maxLength)
    {
        String result="";
        result=text.substring(0,maxLength);
        return result;

    }
}
