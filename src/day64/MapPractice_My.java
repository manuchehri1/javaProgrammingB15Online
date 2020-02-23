package day64;

import java.util.*;

public class MapPractice_My {
    public static void main(String[] args) {


        Map< String, List<String> > groups = new HashMap<>();
        
        groups.put("TheEagle",new ArrayList<>(Arrays.asList("Manuchehr","Aidar","Airslan")));
        
        groups.put("BugBuster",new ArrayList<>(Arrays.asList("Zhibekchech","Ibrahim","Rukshona")));

        groups.put("BugHunter",new ArrayList<>(Arrays.asList("Maiia","Anastasia","Zaki","Toyly")));

        System.out.println("groups = " + groups);

        groups.forEach((groupCode, allMembers)-> System.out.println("groupCode = "+groupCode+"\n\t members: "+allMembers));

        System.out.println(groups.get("TheEagle").get(2));

    }
}
