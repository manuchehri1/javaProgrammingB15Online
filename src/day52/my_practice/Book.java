package day52.my_practice;
//-- abstract
////Book



//Book implements KnowledgeBank
//        AudioBook , Paperbook extends Book
//        Paperbook implements Readable
public abstract class Book implements KnowledgeBank{
    //        String name
//        String author
//        -- add constructors to set the fields
//        -- abstract void method
//        displayBookInfo()

    String name;
    String author;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public abstract void displayBookInfo();
//
//    public abstract void takeNote();
//    public default void showTableOfContent(){
//        System.out.println("Showing the table of content");
//    }


}
