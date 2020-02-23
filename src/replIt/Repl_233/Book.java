package replIt.Repl_233;

public class Book {
    String title, author,tableOfContents="";


    int nextPage=1;

    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public void addChapter(String title, int chapterPageNum){
        tableOfContents+="\n"+title+"..."+nextPage;
        nextPage+=chapterPageNum;
    }

    public int getPages(){
        return nextPage-1;
    }
    public String getTableOfContents(){
        return tableOfContents;
    }

    public String toString(){
        return title+"\n"+author;
    }
}
