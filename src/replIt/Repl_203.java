package replIt;

public class Repl_203 {
    public static boolean isPalindrome(String check) {
        String newCheck=check.replace(" ","");
        String str="";
        for(int i=newCheck.length()-1; i>=0; i--){
            str=str+newCheck.charAt(i);
        }
        if(newCheck.equalsIgnoreCase(str)){
            return true;
        }
        return false;
    }
}
