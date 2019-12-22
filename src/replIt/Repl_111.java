package replIt;

public class Repl_111 {
    public static void main(String[] args) {
        int k = 1;
        int total = 0;


        do {
            total=total+(k*k);
            k++;
        }while(k<=50);

        System.out.println(total);


    }
}
