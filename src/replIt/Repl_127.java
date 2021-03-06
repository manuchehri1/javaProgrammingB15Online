package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_127 {
    public static void main(String[] args) {
//        An array inhabitants represents cities and their respective populations. For example,
//        the following arrays shows 8 cities and their respective populations:
//[3, 6, 0, 4, 3, 2, 7, 1]
//        Some cities have a population of 0 due to a pandemic zombie disease that is wiping
//        away the human lives. After each day, every city will lose half of its population.
//                write a program to loop though each city population and make it lose half
//                of its population until all cities have no humans left. Make updates to each
//                element in the array And print the array like below for each day:
//
//        Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
//        Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
//        Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
//        Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
//        ---- EXTINCT ----
//
//        Write the program in a way that it will handle any number of people in cities,
//        above was just an example numbers to follow.
//
//                Hint:
//        Below expression will print array in this format:
//
//       [3, 6, 0, 4, 3, 2, 7, 1]
//
//        Code:
//        System.out.println(Arrays.toString(inhabitants)));

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int maxDay = inhabitants[0];
        for(int i=1; i<inhabitants.length;i++){
            if(inhabitants[i]>maxDay){
                maxDay = inhabitants[i];
            }
        }

        // 7
        //z
        int loopForZero = 1;
        while(maxDay != 0){
            maxDay = maxDay/2;
            loopForZero++;
        }

        // [3,6,0,4,3,2,1,7]
        // loopforzero = 4
        for (int j = 0; j< loopForZero; j++){
            String temp = "[";
            if (j>0) {
                // temp = "[1, 2, 3]"
                for (int i = 0; i < inhabitants.length; i++) {
                    temp += inhabitants[i] / 2;

                    if(i != inhabitants.length -1){
                        temp += ",";
                    }

                    // Mush Mush Mush
                    // 3 = 1 // 0
                    // 6 = 3 // 1

//                    inhabitants[i] = inhabitants[i] / 2;
                }
            } else {
                for (int i = 0; i < inhabitants.length; i++) {
                    temp += inhabitants[i];
                    if(i != inhabitants.length -1){
                        temp += ",";
                    }
                }
            }

            System.out.println("Day " + j + " "+ temp + "]");
            temp = " ";
        }
        System.out.println("---- EXTINCT ----");
    }
}
