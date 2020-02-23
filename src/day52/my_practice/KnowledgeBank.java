package day52.my_practice;

public interface KnowledgeBank {
    //        create an interface KnowledgeBank
//        abstract method takeNote();
//        default method showTableOfContent(){
//        }
    public abstract void takeNote();

    public default void showTableOfContent(){
        System.out.println("Showing the table of content");
    }

}
