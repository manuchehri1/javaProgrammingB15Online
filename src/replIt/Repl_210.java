package replIt;

public class Repl_210 {
    public static void main(String[] args) {
        String  str = "----qwe--r--tyf...gd.---";


        String reverse = "";
        String temp = "";
        for (int i = str.length()-1; i >= 0; i-- ){

            if (str.charAt(i) >= 65 && str.charAt(i) <= 129){
                reverse += str.charAt(i);
            }
        }
            // "----qwe--r--tyf...gd.---"
        //reverse=dgfyt
        //temp= ----d
        int j = 0;
        for (int i =0 ; i<str.length(); i++){
                if (str.charAt(i) >= 65 && str.charAt(i) <= 129){
                    temp+= reverse.charAt(j);
                    j++;
              } else {
                  temp += str.charAt(i);
              }
        }
        System.out.println(temp);
    }
}
