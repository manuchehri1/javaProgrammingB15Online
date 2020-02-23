package replIt;

public class Repl_209 {
    public static void main(String[] args) {
//        extractNum
//
//        description:
//        a method that cleans any non number string from a string it gets
//        and returns the clean string
//        input:
//        -s (string)- a string the method gets
//        return: string: a string of numbers only
//
//        example use:
//
//        extractNum("aa2aa3") ==> 23
//
//        extractNum("aa2") ==> 2
//
//        extractNum("aa10aa") ==> 10
//
//        extractNum("aa!!%$#.10aa") ==> 10



    }
    public static String nums(String str){
        String onlyNum="";
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                onlyNum=onlyNum+str.charAt(i);
            }
        }
        return onlyNum;
    }
}
