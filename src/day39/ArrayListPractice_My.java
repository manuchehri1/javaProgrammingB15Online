package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice_My {
    public static void main(String[] args) {

        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18")
        );

        String itemDetails="iPhone 6s,449,18.71";
        System.out.println("item name = " + itemDetails.split(",") [0]);
        System.out.println("item price = " + itemDetails.split(",") [1]);
        System.out.println("item monthly = " + itemDetails.split(",") [2]);
        System.out.println("========================================================");

//         * Task 1 : print only items name
        for (String eachProduct : productLst) {
            String namePart = eachProduct.split(",")[0];
            System.out.println("eachProduct name = " + namePart);

        }
        System.out.println("=================================");
        for (int i = 0; i <productLst.size() ; i++) {
            System.out.println("eachProduct name = " + productLst.get(i).split(",")[0]);
        }
        System.out.println("=================================");
//         * Task 2 : print all the prices more than 500
        for (int i = 0; i <productLst.size() ; i++) {
            double price =Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price>500){
                System.out.println("price more than 500 = "+price);
            }
        }
        System.out.println("=================================");

//         * Task 3 : print average price
        double sum=0;
        double average=0;
        for (int i = 0; i <productLst.size() ; i++) {
            double price =Double.parseDouble(productLst.get(i).split(",")[1]);
          sum=sum+price;

        }
        average=sum/productLst.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("======================================");

//         * Task 4 : print all the items name that has less than 20$ monthly payment.
        for (int i = 0; i <productLst.size() ; i++) {
            String name = productLst.get(i).split(",")[0];
            double monthly =Double.parseDouble(productLst.get(i).split(",")[2]);
          if (monthly<20){
              System.out.println(name+" "+ monthly);
          }
        }
        System.out.println("==========================");
//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        for (int i = 0; i <productLst.size() ; i++) {
            String name = productLst.get(i).split(",")[0];
            double monthly =Double.parseDouble(productLst.get(i).split(",")[2]);
         if (productLst.get(i).contains("iPhone")){
             System.out.println(name+" "+monthly);
         }
        }

//         * Task 6 : Print all information about most expensive items.
        double maxPrice=0;
        for (int i = 0; i <productLst.size() ; i++) {
            String name = productLst.get(i).split(",")[0];
            double price =Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price>maxPrice){
                maxPrice=price;
            }

        }
        System.out.println("=============================");
        for (int i = 0; i <productLst.size() ; i++) {
            String name = productLst.get(i).split(",")[0];
            double price =Double.parseDouble(productLst.get(i).split(",")[1]);
           if (price==maxPrice){
               System.out.println("most expensive product = "+productLst.get(i));
           }
        }
        System.out.println("-----------Task 7-----------");

//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
        System.out.println(productLst);
        int idexOfDyson=0;
        for (int i = 0; i <productLst.size() ; i++) {
            String name = productLst.get(i).split(",")[0];
            double price =Double.parseDouble(productLst.get(i).split(",")[1]);
            double monthly =Double.parseDouble(productLst.get(i).split(",")[2]);
           if (name.contains("Dyson")){
               price=(price)-(price*0.8);
               monthly=price/24;
               idexOfDyson=i;
           }
           productLst.set(idexOfDyson,"Dyson Vacuum," + price + "," + monthly);
        }
        System.out.println(productLst.get(idexOfDyson));
//         * Task 8 : Count the items prices more than average price.
        int count =0;
        for (int i = 0; i <productLst.size() ; i++) {
            String name = productLst.get(i).split(",")[0];
            double price =Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price>average){
                count++;
            }
        }
        System.out.println("productLst = " + productLst.size());
        System.out.println("count of the items prices more than average price  = " + count);
//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.
        for (int i = 0; i <productLst.size() ; i++) {
            String name = productLst.get(i).split(",")[0];
            double price =Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price>average){
                productLst.remove(i);
                --i;
            }

        }
        System.out.println("productLst = " + productLst.size());
        System.out.println(productLst);
//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :


    }

}
