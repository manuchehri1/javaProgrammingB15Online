package day32;

public class CharacterActions {
    public static void main(String[] args) {
        printAtoZ('A','Z');
        printAtoZ('Z','A');


    }

    public static void printAtoZ(char start,char end){


        if (start<end){
            for ( char iChar = start;  iChar<=end ; iChar++) {
                System.out.print(iChar+" ");
            }
            System.out.println();
        } else if (start>end){
            for ( char iChar = start;  iChar>=end ; iChar--) {
                System.out.print(iChar+" ");
            }
            System.out.println();
        }
        }


}
