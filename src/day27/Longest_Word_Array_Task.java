package day27;

public class Longest_Word_Array_Task {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan" ,"Tolkun","Abide" };
        String[] testersTeam = {"Zhibekchach" , "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa","Ershad", "Naila"};
        String[][] scrumTeam = { developersTeam , testersTeam, businessAnalysitsTeam };
        int maxLength = scrumTeam[0][0].length();
        String longestString ="";   // to store the longest string
        for(String[]  each1DArray  :  scrumTeam ){
            for( String eachElement :  each1DArray ){
                if(maxLength < eachElement.length() ){  // to compare which string has the largest length
                    maxLength = eachElement.length();
                    //  to assign maximum string length

                    longestString = eachElement;
                    // if the string has the largest length, we assign that string to longestString
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);



        for(String[]  each1DArray  :  scrumTeam ){
            for( String eachElement :  each1DArray ){
                if(maxLength == eachElement.length() ){
                    System.out.println(eachElement);
                }
            }
        }
        System.out.println("===================================================");
        int secondMaxLength = scrumTeam[0][0].length();
        String secondLongestName ="";

        for (String[] eachTeam : scrumTeam) {
            for (String eachName : eachTeam) {
                if (eachName.length()==maxLength){
                    continue;
                }
                if (eachName.length()>secondMaxLength){
                    secondMaxLength=eachName.length();
                    secondLongestName=eachName;

                }

            }
        }
        System.out.println("secod longest name is: "+secondLongestName+" it has "+secondMaxLength+" char");








    }
}
