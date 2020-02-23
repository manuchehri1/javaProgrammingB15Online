package java_interview_tasks;

public class Array_Find_Minimum {
    public static void main(String[] args) {
        int []  arr = {1,2,3,4,4,56,8,9};
        System.out.println(secondMin(arr));

        int[] elements  = {-4 , 2 , 10 , -2, -3 };
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < elements.length; i++)
        {
            if (smallest>elements[i])
                smallest=elements[i];

        }

        for (int i = 0; i < elements.length; i++)
        {
            if (secondSmallest>elements[i] && elements[i]>smallest)
                secondSmallest=elements[i];

        }

        System.out.println("The smallest element is: " + smallest + "\n"+  "The second smallest element is: " + secondSmallest);
    }
    public static int minValue(int [] arr){
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int secondMin(int[] arr){
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;


       // int []  arr = {1,2,3,4,4,56,8,9};
        for (int j=0; j<arr.length; j++){
            if (arr[j]<min1) {
                min2=min1;
                min1=arr[j];
            }else if (arr[j]<min2){
                min2=arr[j];
            }
        }
        return min2;
    }
//    int smallest = elements[0];
//    int secondSmallest = elements[0];
//    for (int i = 1; i < elements.length; i++) {
//        if (elements[i] < smallest) {
//            secondSmallest = smallest;
//            smallest = elements[i];
//        }
//        else if (elements[i] < secondSmallest) {
//            secondSmallest = elements[i];
//        }
//    }
//    return secondSmallest;
}
