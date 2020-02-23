package replIt;

public class Repl_178 {
    public static void main(String[] args) {
//        When gears merge and work together, one teeth from each one goes in order.
//                Write a method mergeStrings hat will return the strings merged, one
//        letter at a time, starting with one.   Please note one and two can be of different lengths.
//        Please look at below examples:
//
//        s1 ==> "12345"
//        s2 ==> "abcde"
//        mergeStrings(s1,s2) ==> "1a2b3c4d5e"
//
//
//        mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
//
//        mergeStrings("java", "selenium") ==> "jsaevlaenium"
        System.out.println(mergeStrings("123","abcde"));


    }
            public static String mergeStrings(String one, String two) {
        String result="";



        if (one.length()>two.length()){
            for (int i = 0; i <one.length() ; i++) {
                if (two.length()>i){
                    result=result+one.charAt(i)+two.charAt(i);

                }else {
                    result=result+one.charAt(i);

                }


            }
        }else {
            for (int i = 0; i <two.length() ; i++) {
                if (one.length()>i){
                    result=result+one.charAt(i)+two.charAt(i);

                }else {
                    result=result+two.charAt(i);
                }

            }
        }

                return result;
        }
    }
