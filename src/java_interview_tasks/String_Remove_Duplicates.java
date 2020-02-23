package java_interview_tasks;

public class String_Remove_Duplicates {
    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));

    }
//    Write a return method that can remove the duplicated values from String
//
//    Ex:  removeDup("AAABBBCCC")  ==> ABC

    public static String removeDup(String str){
        String nonDub="";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDub.contains(""+str.charAt(i))){
                nonDub=nonDub+str.charAt(i);
            }
        }
        return nonDub;
    }



}
