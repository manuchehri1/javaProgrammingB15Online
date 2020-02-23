package office_hour;

public class day26_Mr_Muhtar_Notes {
    public static void main(String[] args) {
        /**Practice: Array
         String
         Loop
         Array: one of the data structures in java
         we need data structures to manage data efficientlly, in organized manner
         we can store multiple data into a variable
         int a = {10,20}  ==>wrong
         decleration:
         Data-type[] VariableName ={data, data, ...}
         index:                  0     1    ...
         retrive data from array:
         VariableName[index]
         Ex: int[] arr ={1,2,3}
         arr[2]  ==> 3
         Array is immutable, and Array' size is fixed
         without initializing array's size we cannot use it
         initializing the size of the array:
         1. giving values
         int[] a ={1,2,3}
         it initialize the size and at the same time initializes the value
         2. giving the size of the array only:
         int[] a = new int[LengthNumber]
         Arrays: presented in java.util package
         Arrays.toString(VariableName): converts any data type of Array to String , returns String
         Arrays.sort(VariableName): sorts the elements within the array in ascending order, does not return anying
         String class' split method:
         str.split("StringValue"): splits the string by given value, and returns it as String array
         String[] arr = "ABCD".split(""); ==> {A, B, C, D}
         str.toCharArray(): Assign the String to char array. returns char array
         default values:
         byte, short, int, long ==> 0
         String => null
         double, float ==> 0.0
         boolean ==> false
         Tasks:
         1.  Write a program that can print out the unique values from an int Array
         Ex:
         if arr -> {1, 1, 2 , 3, 3}
         output: 2
         2. Write a program that can print out the unique values from  String Array
         Ex:
         if arr -> {"a" , "a ", "b", "c", "c"}
         output: b
         3. Write a program that can find the second max number from an int array
         Ex:
         if arr -> { 1,2,3,4,5}
         output: 4
         DO NOT use sort method

         4. Swap two variable' values without using a temporary variable
         Ex:
         if a =10, b= 20;
         output: print( a ) ==> 20
         print( b ) ==> 10
         *
         *
         */
    }
}
