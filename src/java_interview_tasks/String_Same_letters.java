package java_interview_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class String_Same_letters {
    public static void main(String[] args) {

        System.out.println(same2("abc", "cab"));

    }

    //    Write a return method that check if a string is build out of the same
//    letters as another string.
//
//    Ex:  same("abc",  "cab"); -> true
//
//    same("abc",  "abb"); -> false:
    public static boolean same(String str1, String str2) {
        for (int i = 0; i < str1.length() ; i++) {

            if (str1.length() == str2.length()) {
                if (str2.contains("" + str1.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean same2(String str1, String str2){

        char[] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String lst1="";
        String lst2="";

        for (int i = 0; i <arr1.length ; i++) {
            lst1=lst1+arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            lst2=lst2+arr2[i];
        }

        return lst1.equals(lst2);
    }

}