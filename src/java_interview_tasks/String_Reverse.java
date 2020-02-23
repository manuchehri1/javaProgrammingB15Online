package java_interview_tasks;

public class String_Reverse {
    public static void main(String[] args) {
        System.out.println(Reverse("ABCD"));

    }
//    Write a return method that can reverse  String
//
//    Ex: Reverse("ABCD"); ==> DCBA

    public static String Reverse(String str){
        String reverse="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }
}
