package java_interview_tasks;

public class String_find_the_unique {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));

    }
//    Write a return  method that can find the unique characters from the String
//
//    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    public static String unique(String str){

        String result="";
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){
                    ++count;
                }

            }
            if (count==1){
                result=result+str.charAt(i);
            }

        }
        return result;

    }


}

