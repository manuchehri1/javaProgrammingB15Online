package java_interview_tasks;

public class String_Frequency_of_Characters {

    public static void main(String[] args) {
        System.out.println(FrequencyOfChars3("AAABBCDD"));
    }
//    Write a return method that can find the frequency of characters
//
//    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2



    public static String FrequencyOfChars(String str){
        String rslt="";


        for (int i = 0; i < str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){
                    ++count;
                }
            }
            if (!rslt.contains(""+str.charAt(i))){
                rslt=rslt+str.charAt(i)+count;
            }


        }


        return rslt;
    }
    public static String FrequencyOfChars2(String str) {

        String nonDup = "";

        for(int i=0; i < str.length(); i++)

            if(!nonDup.contains(""+str.charAt(i)))

                nonDup+= ""+str.charAt(i);



        String expectedResult = "";

        for( int j=0;j < nonDup.length(); j++) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == nonDup.charAt(j))

                    count++;

            }

            expectedResult +=nonDup.charAt(j)+"" + count;

        }

        return expectedResult;

    }
    public  static  String  FrequencyOfChars3(String str) {

        String expectedResult = "";

        int j=0;

        while( j < str.length()) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == str.charAt(j)) {

                    count++;

                }

            }

            expectedResult +=str.charAt(j)+"" + count;

            str = str.replace(""+str.charAt(j) ,  "" );

        }

        return expectedResult;

    }
}
