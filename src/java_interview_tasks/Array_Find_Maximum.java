package java_interview_tasks;

import java.util.Arrays;

public class Array_Find_Maximum {
    public static void main(String[] args) {



    }

    public static int maxValue(int [] arr){
        int max=arr[0];
        for (int each : arr) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static int maxValue2(int []arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
