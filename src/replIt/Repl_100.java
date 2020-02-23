package replIt;

import java.util.Scanner;

public class Repl_100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int count = 0;
        int tempIndex=0;
        int tempIndex2=0;
        for (int i = 0; i <str.length()-4 ; i++) {
            if (str.substring(i,i+5).equals("bread")){
                count++;
                if (count==1) {
                    tempIndex = i+5;
                }
                if (count==2){
                    tempIndex2=i;
                }
            }
        }
        if (tempIndex2>tempIndex) {
            System.out.println(str.substring(tempIndex, tempIndex2));
        }else {
            System.out.println("nothing");
        }


//
//        int firstIndexBread=str.indexOf("bread");
//        int lastIndexBread=str.lastIndexOf("bread");
//        System.out.println(firstIndexBread);
//        System.out.println(lastIndexBread);
//
//        if (firstIndexBread!=lastIndexBread){
//
//            System.out.println(str.substring(firstIndexBread+5,lastIndexBread));
//        }else{
//            System.out.println("nothing");
//        }

//        int first = str.indexOf("bread");
//        int last = str.lastIndexOf("bread");
//        if (first != last) {
//            System.out.println(str.substring(first+5, last));
//        }
//        else {
//            System.out.println("nothing");
//        }


    }
}
