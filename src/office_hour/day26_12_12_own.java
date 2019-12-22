package office_hour;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class day26_12_12_own {
    public static void main(String[] args) {
//        Task:
//        1.  Write a program that can print out the unique values from an int Array
//        Ex:
//        if arr -> {1,1,2,3,3}
//        Scanner input = new Scanner(System.in);
//        int[] nums = new int[10];
//        for(int i = 0 ; i<=9 ; i ++){
//            nums[i] = input.nextInt();
//        }
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter the size of your array:");
//        int arraySize=scan.nextInt();
//        int[] num = new int[arraySize];
//        System.out.println("enter each item number");
//
//        for (int i = 0; i < arraySize; i++) {
//            num[i]=scan.nextInt();
//        }
        int [] num ={1,2,2,3,3};

        int count =0;

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num.length; j++) {

                if (num[i]==num[j]){
                    count++;
                }
            }
            if (count<2){
                System.out.println(num[i]);
            }
            count=0;

        }




//        output: 2
//        2. Write a program that can print out the unique values from  String Array
//        Ex:
//        if arr -> {"a" , "a ", "b", "c", "c"}
//        output: b

        String[] lettrs = {"a","a","b","c","c"};

        int count1=0;
//        for (int i=0; i<lettrs.length; i++){
//            for (int j =0; j<lettrs.length;  j++){
//                if (lettrs[i].equals(lettrs[j])){
//                    count1++;
//                }
//            }
//            if (count1<2){
//                System.out.println(lettrs[i]);
//
//            }
//            count1=0;
//        }
        for (String eachlettr1 : lettrs) {
            for (String eachlettr2 : lettrs) {
                if (eachlettr1==eachlettr2) {
                    count1++;
                }

                }
            if (count1<2){
                System.out.println(eachlettr1);
            }
            count1=0;
        }



//        3. Write a program that can find the second max number from an int array
//        Ex:
//        if arr -> { 1,2,3,4,5}
//        output: 4
        int[] numbers= { 1,2,3,4,5};
        int max1=numbers[0];
        int max2=numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]>max1){
                max1=numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max2 && max2<max1){
                max2=numbers[i];
            }
            System.out.println(max2);
        }


//        DO NOT use sort method
//        4. Swap two variable' values without using a temporary variable
//        Ex:
//        if a =10, b= 20;
//        output: print( a ) ==> 20
//        print( b ) ==> 10


    }
}
