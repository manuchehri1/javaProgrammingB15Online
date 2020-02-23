package replIt;

import java.util.Arrays;

public class Repli_129 {
    public static void main(String[] args) {
//        Given a String array arr with the following elements
//                ["zero", "one", "two","three","four"]
//
//        Create another array fewValues and copy words that have letter "e" in them
//
//        You need to know how many element contain "e" and create array accordingly
//
//        Values in fewValues array need to be["zero", "one","three"]
//
//        Examples:
//        arr -> ["aa", "be", "lol", "lel", "oreo"]
//        fewValues -> ["be",  "lel", "oreo"]
//
//        arr -> ["e", "hey", "bye", "furey", "spoon"]
//        fewValues ->["e", "hey", "bye", "furey"]

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two", "three", "four","eye","apple"};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(getWithE(numbers)));


    }
        public static String[] getWithE(String[] arr) {

            //TODO : YOUR CODE GOES HERE ----------------------
            int countOfE=0;
            String wordsWithE="";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].contains("e")){
                    wordsWithE=wordsWithE+arr[i]+",";
                    countOfE++;
                }
            }
            wordsWithE=wordsWithE.substring(0,wordsWithE.length()-1);
            String[] fewValues=new String[countOfE];
            fewValues=wordsWithE.split(",");


            //YOUR CODE ENDS HERE -----------------------

            return fewValues;
        }




}
