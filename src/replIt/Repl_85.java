package replIt;

public class Repl_85 {
    public static void main(String[] args) {

//        Write for and while loops so that they print
//        those numbers between 1 and 20 and divisible by 3.
//        Expected Output:  3 6 9 12 15 18

        for (int i=0; i <=20; i++){
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n");

        int x=0;
        while (x<=20){
            if (x%3==0){
                System.out.print(x+" ");
            }
            ++x;
        }


    }
}
