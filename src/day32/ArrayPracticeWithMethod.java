package day32;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {
        int[] score={62,61,63,70};
        printMax(score);
        printMinIntArray(score);
        printSumOfIntArray(score);
        checkScoresAllMoreThan60(score);


    }

    public static void arrayPrinter(int[] nums){

        System.out.println("arrays has items: ");
    }
    public static void printMax(int[] nums2){
        int max=nums2[0];
        for (int i = 0; i <nums2.length ; i++) {
            if (nums2[i]>max){
                max=nums2[i];
            }
        }
        System.out.println("max value is "+max);
    }
    public static void printMinIntArray(int[] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("min value is "+min);
    }
    public static void printSumOfIntArray(int[] nums){
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        System.out.println("sum of all is  "+sum);
    }
    public static void checkScoresAllMoreThan60(int[] nums){
        String passed="NOT PASSED";
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>60){
                passed="all passed";
            }
        }
        System.out.println(passed);
    }









}
