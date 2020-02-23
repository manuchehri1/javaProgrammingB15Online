package replIt;

public class Repl_204 {
    public static void main(String[] args) {


        System.out.println(isAnagram("listej", "silent"));
    }
    public static boolean isAnagram(String word1, String word2) {
        boolean isOrNot=true;
        if (word1.length()==word2.length()){
            for (int i = 0; i <word1.length() ; i++) {
                if (word2.contains(word1.substring(i,i+1))){
                    isOrNot=true;
                }else {
                    isOrNot=false;
                }
            }

        }else {
            isOrNot= false;
        }
        return  isOrNot;
    }
}
