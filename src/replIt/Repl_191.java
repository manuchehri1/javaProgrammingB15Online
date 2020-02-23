package replIt;

public class Repl_191 {
    public static void main(String[] args) {

//        String name= "manuk";
//        String reverse="";
//        for (int i = name.length()-1; i >=0 ; i--) {
//            reverse=reverse+name.charAt(i);
//        }
//        System.out.println(reverse);
        System.out.println(reverse("apple"));
    }	public static String reverse(String input)
    {
        String reverseInput="";
        for(int i = input.length()-1; i>=0; i--){

            reverseInput=reverseInput+input.charAt(i);
        }
        return reverseInput;
    }
}
