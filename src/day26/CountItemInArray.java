package day26;

import java.util.Arrays;

public class CountItemInArray {
    public static void main(String[] args) {

        String[] marvelHeros = {"Iron Man", "Capitan America", "Spiderman",
                "Balck Panther", "Hulk", "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America", "Spiderman",
                "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeros));

        int sizeOfArray = marvelHeros.length;
        System.out.println("Hero count = " + sizeOfArray);
        String itemToSearch="Iron Man";
        int countOfItem = 0;
        for (String eachHero: marvelHeros){
            if (eachHero.equals("Iron Man")){
                countOfItem++;
            }
        }
        System.out.println("countOfItem = " + countOfItem);

        int countOfBLACK=0;
        String wordToSearch= "black";
        for (String eachHero : marvelHeros) {
            if (eachHero.toLowerCase().contains(wordToSearch)){
                countOfBLACK++;
            }
        }

        System.out.println("count of word black = " + countOfBLACK);

        int longestword=marvelHeros[0].length();

        for (String eachHero : marvelHeros) {
            if (eachHero.length()>longestword){

            }
        }








    }
}
