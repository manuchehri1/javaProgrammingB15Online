package replIt;

import java.util.Scanner;

public class Repl_108 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        String sum="";
        for(i=1; i<=n; i++){
            for ( j =1 ; j <=i ; j++) {

                System.out.println("*");
            }
            System.out.println();
        }




    }
}
