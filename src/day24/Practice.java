package day24;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {



        // Arrays class a class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString  --->> Arrays.toString(yourArrayHere)
        // This method will give you string representation of any type of array
        // the result will look --->>   [item1 , item 2 , item 3 ...... lastItem]


      //  String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        //System.out.println( superHeros );
        //System.out.println("Arrays.toString(superHeros)    result :     ");
        //System.out.println(Arrays.toString(superHeros));
        // saving the string result into a variable and print
//        String superHerosAsString = Arrays.toString(superHeros);
//        System.out.println(" superHerosAsString    result :     ");
//        System.out.println(superHerosAsString);

        // how do we get first character of superHerosAsString variable
//        System.out.println(" superHerosAsString.charAt(0)   result :     ");
//        System.out.println(superHerosAsString.charAt(0));
//        System.out.println("-------------------------------");
//
//        int[] numbers = {10, 44, 55, 3, 78};
//        System.out.println(" Arrays.toString(numbers) RESULT : ");
//        System.out.println(Arrays.toString(numbers));


        // create an double(data type) array of 3 items called prices  ; and put 3 value
        // get a string representation out of this array and save it as pricesString
        // print each and every character in this String  in this format
        // for example : your first 2 line of output should look like this
        //  character at index 0 is :  yourCharacterHere
        //  character at index 1 is :  yourCharacterHere and so on all the way till last
//        double[] prices = new double[]{3.14, 5.5, 9.0};
//        System.out.println("Arrays.toString(prices) result " + Arrays.toString(prices));

        // since the method give you back a string representation of array object
        // in this format [ firstItem , secondItem , thirdiTEM ..... ... lastItem]
        // i can save it into String variable

//        String pricesString = Arrays.toString(prices);
//        System.out.println("pricesString = " + pricesString);
//
//        // we are looping over a String not an array so we keep looping until last character finishes
//        // to make it obvious that [ ] and , are part of the String we got from the method
//        for (int i = 0; i < pricesString.length(); i++) {
//            System.out.println("character at index " + i + " is : " + pricesString.charAt(i));
//        }

        // THE SOLE PURPOSE OF Arrays.toString(yourArray) is TO SEE WHAT IS INSIDE

        // for sorting an array in ascending order
        // sort    --->>  Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals  ---->> Arrays.equals(firstArray,secondArray)

//        String[] groceryItems= new String[]{"apple","banana","grape","strawberry","blueberry","kiwi"};
//
//        int itemCount= groceryItems.length;
//        int lastItemIndex=itemCount-1;
//        String lastFruit= groceryItems[lastItemIndex];
//
//        for (String eachFruit  : groceryItems ){
//            System.out.print(eachFruit);
//
//            if (!eachFruit.equals(lastFruit)) {
//                System.out.print(" ---> ");
//            }
//        }
//        System.out.println();
//        for (int i=0; i<groceryItems.length; i++){
//            System.out.print(groceryItems[i]);
//            if (i==groceryItems.length-1) {
//                break;
//            }
//            System.out.print("---->");
//        }

        int[] nums = {10,40,20};
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            int twotimes=nums[i];
            twotimes=100;
           // System.out.print(twotimes+", ");
        }
        for (int eachNum : nums) {
            eachNum=100;
            System.out.print(eachNum+", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(nums));








    }
}
