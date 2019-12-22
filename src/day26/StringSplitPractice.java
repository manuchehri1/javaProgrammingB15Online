package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {
        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan"   ;
        String readyStudent = students.trim();
        String newStudents= students.replace(" ","");
        String[] namesArray =newStudents.split(",");
        System.out.println(Arrays.toString(namesArray));
        String eachLetter="";
        for (int i = 0; i <namesArray.length ; i++) {
            for (int j = 0; j <namesArray[i].length() ; j++) {
                if (j==namesArray[i].length()-1){
                    System.out.print(namesArray[i].charAt(j));
                }else{
                    System.out.print(namesArray[i].charAt(j)+"-");
                }


            }

            System.out.println();
        }




    }
}
