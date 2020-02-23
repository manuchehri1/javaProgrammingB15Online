package replIt;

import java.util.Scanner;

public class Repl_88 {
    public static void main(String[] args) {
       /* Task 88
        catgggdogcathhdog
                gggdogcathhdog
        hhdog
        01234567891234567
        1.Count amount of "cat" in the string
        1.1 while we have "cat" inside string
        1.2 find "cat" location and cut in that point.
        1.3 countCats=countCats+1

        2.Seperetly count amount of "dog" in the string
        2.1 while we have "dog" inside string
        2.2 find "cat" location and cut in that point.
        2.3 countDogs=countDogs+1
        3.Compare amount of "dog" and amount of "cat"
        if its equal -> tru  if not -> false*/


        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        for (int i = 0; i <word.length()-2 ; i++) {
            if (word.substring(i,i+3).equalsIgnoreCase("dog")){
                countOfDogs++;
            }else if (word.substring(i,i+3).equalsIgnoreCase("cat")){
                countOfCats++;
            }
        }
        if (countOfDogs==countOfCats){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    /*
    01234567890123456
    catgggdogcathhdog
    */


//        while(word.contains("cat")){
//            word=word.substring(word.indexOf("cat")+3);
//            countOfCats++;
//        }
//        while(wordForDogs.contains("dog")){
//            wordForDogs=wordForDogs.substring(wordForDogs.indexOf("dog")+3);
//            countOfDogs++;
//        }
//        if(countOfDogs==countOfCats){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

    }
}
