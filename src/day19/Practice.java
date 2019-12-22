package day19;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

//        int start=10;
//        int end =27;
//
//        for (int i=start;  start<= end; start++){
//            System.out.println(start);
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your starting and ending  speed: ");
        int star2=scan.nextInt();
        int end2=scan.nextInt();

        System.out.println();
        if (star2<end2){
            System.out.println("your start speed is=>");
        for (int i = star2; i<=end2 ; i++) {
            System.out.println(i+" ");
        }
        }else if (star2>end2){
            System.out.println("your start speed is=>");
            for (int x=star2; x >=end2 ; x--){
                System.out.println(x+" ");
            }
        }else {
            System.out.println("no action needed!!!");
        }



    }
}
