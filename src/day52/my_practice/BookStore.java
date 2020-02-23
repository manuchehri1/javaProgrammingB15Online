package day52.my_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookStore {

    public static void main(String[] args) {
        Book b1 = new PaperBook("The Kite Runner","Khaled Hosseini",3);
        Book b2 = new PaperBook("Alchemist","Paulo Cohel",2);
        Book b3 = new AudioBook("The Java","Raha ", 2.5);
        KnowledgeBank b4 = new PaperBook(" The fault in our star", "John", 2);


        List<Book> bookLst= new ArrayList<>();
        bookLst.addAll(Arrays.asList(b1,b2,b3));
        int count=0;

        for (Book eachBook : bookLst) {
            eachBook.displayBookInfo();
            if (eachBook.getClass().getSimpleName().equals("PaperBook")){
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("===================");
        b1.displayBookInfo();
        b1.takeNote();
        b1.showTableOfContent();

    }



}
