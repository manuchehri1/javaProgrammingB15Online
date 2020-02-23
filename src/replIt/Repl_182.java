package replIt;

public class Repl_182 {
    public static void main(String[] args) {
//        This method gets two strings (text and badWord)  and returns a string.
//
//        basicly what it dose is take out all the occurrences of badWord in text.
//
//        for example:
//
//        clean ("one two three","two")
//        returns "one three"
//
//        clean ("foo bar","foo")
//        returns "bar"
//
//        clean ("he said bla bla bla","bla")
//        returns "he said "
//
//        hint:
//
//        https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replace(char,%20char)
        System.out.println(clean("he said bla bla bla","bla"));

    }
    public static String clean (String text ,String badWord) {
        String result="";

        if (text.contains(badWord)){
            result=text.replace(badWord,"");
        }else {
            result=text;
        }
        return result;
    }
}
