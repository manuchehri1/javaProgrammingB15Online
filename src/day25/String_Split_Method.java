package day25;

public class String_Split_Method {
    public static void main(String[] args) {


        String sentence ="split this sentence by is and print out your result";

        String[] split_by_is = sentence.split("is");

        for (String eachPieces : split_by_is) {

            System.out.println("eachPiece = <"+eachPieces+">");
        }


    }
}
