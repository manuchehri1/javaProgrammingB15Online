package day31;

import java.util.Scanner;

public class MethodPractice3 {
    // Create a class called MethodPractice4
// no need for object when being called                : static
// it should be accessible anywhere in your project    : public
// it does not return any value                        : void
// does not need any external data when being called   : (nothing inside)
// Create a method called countDownFrom20tillOne
// Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
// Create a method to spell your name :  Seda -->> S-e-d-a
    public static void countDownFrom20tillOne(){
        for (int i = 20; i >=1 ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printOddNumbersFrom1to100 (){

        for (int i = 0; i <=100; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void spellYourName(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= scan.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if (i==name.length()-1){
                System.out.print(name.charAt(i));
            }else {
                System.out.print(name.charAt(i)+"-");
            }

        }
    }

    public static void main(String[] args) {
        countDownFrom20tillOne();
        System.out.println("============");
        printOddNumbersFrom1to100();
        System.out.println("============");
        spellYourName();
    }














}
