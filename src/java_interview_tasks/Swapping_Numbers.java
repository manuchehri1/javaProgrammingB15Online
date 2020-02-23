package java_interview_tasks;

public class Swapping_Numbers {
    public static void main(String[] args) {


       swapWithoutTemp(10,20);

    }
    public static void swapWithoutTemp(int num1, int num2){
        int a =num1;  // 10
        int b= num2;  //20
        System.out.println("before swapping "+"num1= "+a+" num2= "+b);
        a=a+b;   //a=10+20=30
        b=a-b;   // b=30-20=10 ---> b=10

        a= a-b;  // a= 30-10=20 ---> a=20;
        System.out.println("after swapping "+"num1= "+a+" num2= "+b);
    }
}
