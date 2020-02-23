package day60.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionIntro {





    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hasan");
        myList.add("Abdullo");

        myList.addAll(myList);

        myList.removeAll( Arrays.asList("Hasan"));


      //  Collection<String> myList2 = new ArrayList<>();



    }
}
