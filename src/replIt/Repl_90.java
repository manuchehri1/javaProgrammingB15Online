package replIt;

import java.util.Scanner;

public class Repl_90 {
    public static void main(String[] args) {
//        Then user should select service quality that will correspond to tip percent.
//                Poor = 5%
//                Fair = 10%
//                Good = 15%
//                Great = 20%
//                Excellent = 25%
//                The program should display the following information based on the user input:
//        Split or No split
//        Number of people entered: &&&&
//        Service Quality:
//        Total to pay:
//        Total tip:
//        Total per person:
//        Tip per person:
//        https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8
//
//        Input:
//        Split:Yes
//        Number of people:4
//        Check amount:476.0
//        Service Quality:Excellent
//
//        Output:
//
//        Number of people entered: &&&&
//        Total to pay: 595.0
//        Total tip: 119.0
//        Total per person: 148.75
//        Tip per person: 29.75

        Scanner scan =new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.next();
        int numOfPeople;
        if (split.equalsIgnoreCase("yes")){
            System.out.println("Number of people:");
           numOfPeople =scan.nextInt();
        }else {
            numOfPeople=1;
            System.out.println("Number of people:"+numOfPeople);
        }
        System.out.println("Check amount:");
        double amount= scan.nextDouble();
        System.out.println("Service Quality:");
        String quality=scan.next();

        int percent = 0;
        if(quality.equalsIgnoreCase("POOR")){
            percent = 5;
        }else if (quality.equalsIgnoreCase("fair")){
            percent=10;
        }else if (quality.equalsIgnoreCase("good")){
            percent=15;
        }else if (quality.equalsIgnoreCase("great")){
            percent=20;
        }else if (quality.equalsIgnoreCase("exellent")){
            percent=25;
        }
        String numOfperson="";
        for (int i = 0; i <numOfPeople; i++) {
            numOfperson +="&";
        }
        System.out.println("Number of people entered: "+numOfperson);

        double totalPay=amount+(amount*percent/100);
        System.out.println("Total to pay: "+totalPay);
        double totalTip=amount*percent/100;
        System.out.println("Total tip: "+totalTip);
        double perPerson=totalPay/numOfPeople;
        System.out.println("Total per person: "+perPerson);
        double tipPerPerson= totalTip/numOfPeople;
        System.out.println("Tip per person: "+tipPerPerson);
        //        Total to pay: 595.0
//        Total tip: 119.0
//
//        Total per person: 148.75
//
//
//        Tip per person: 29.75




    }
}
