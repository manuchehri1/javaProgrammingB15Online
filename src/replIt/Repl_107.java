package replIt;

import java.util.Scanner;

public class Repl_107 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        num = scan.nextInt(); // 54321
        digit1=num/10000;// 5
        digit2=num%10000;
        digit2/=1000;   //4
        digit3=num%1000;
        digit3/=100;  //3
        digit4=num%100;
        digit4/=10;  //2
        digit5=num%10;
        digit5/=1;  //1
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);







    }
}
