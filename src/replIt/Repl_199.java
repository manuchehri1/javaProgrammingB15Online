package replIt;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_199 {
//    Create a static method that:
//    is called removeAll
//    returns nothing
//    takes two parameters: an ArrayList of Strings called wordList,
//    and a String called targetWord
//
//    This method should go through every element of wordList and
//    remove every instance of targetWord from the ArrayList.
//
//    Example:
//
//    ArrayList<String> wordList =
//    new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
//
//    removeAll(wordList,"hi");
//
//    now wordList is ["hey","yo"]
public static void main(String[] args) {
        ArrayList<String> list =
    new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
        String word="hi";
        removeAll(list,word);

        String list2 = "apple";
    System.out.println( list2.startsWith("apple"));


}
public static void removeAll(ArrayList<String> wordList,String targetWord){

    for (int i = 0; i < wordList.size(); i++) {
        if (wordList.get(i).equals(targetWord)){
            wordList.remove(i);
            --i;
    }
    }
    System.out.println(wordList);
}

}
