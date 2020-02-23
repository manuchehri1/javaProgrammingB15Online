package day64;

import java.util.*;
import java.util.Map;

public class RepresentingTableData {
    public static void main(String[] args) {


        // for single row
        // i want to get the value by it's column name
        // so i choose Map

        Map<String,String> row1 = new HashMap<>();
        row1.put("first_name", "Regan" );
        row1.put("email", "rboichat0@1688.com" );
        row1.put("gender", "Male" );

        Map<String,String> row2 = new HashMap<>();
        row2.put("first_name", "Carleen" );
        row2.put("email", "cmorillas1@blog.com" );
        row2.put("gender", "Female" );

        // for one row I used one map
        // but I have many rows !
        // may of Some type -->> List<SomeType>
        
        List < Map<String,String> > rowMapList = new ArrayList<>();
        
        rowMapList.add(row1);
        rowMapList.add(row2);

        System.out.println("rowMapList = " + rowMapList);

        System.out.println("rowMapList.get(1).get(\"email\") = "
                            + rowMapList.get(1).get("email"));
        
        rowMapList.get(0).replace("first_name","Hulk");
        System.out.println("rowMapList = " + rowMapList);
        
        rowMapList.get(0).put("first_name","Jane");
        System.out.println("rowMapList = " + rowMapList);
        

    }
}
