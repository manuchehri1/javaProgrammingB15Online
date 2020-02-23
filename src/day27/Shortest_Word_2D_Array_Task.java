package day27;

public class Shortest_Word_2D_Array_Task {
    public static void main(String[] args) {



        String[] developersTeam = {"Vladislav", "Hasan" ,"Tolkun","Abide" };
        String[] testersTeam = {"Zhibekchach" , "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa","Ershad", "Naila"};
        String[][] scrumTeam = { developersTeam , testersTeam, businessAnalysitsTeam };
        int minLength = scrumTeam[0][0].length();
        String shortestName="";


        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {
                if (scrumTeam[i][j].length()<minLength){
                    minLength=scrumTeam[i][j].length();
                    shortestName=scrumTeam[i][j];
                }
            }
        }
        System.out.println("shortest name is: "+shortestName+" it has "+minLength+" characters");








    }
}
