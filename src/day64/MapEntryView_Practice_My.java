package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryView_Practice_My {
    public static void main(String[] args) {

        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","Female");
        employeeMap.put("Winfred","Male");
        employeeMap.put("Jereme","Male");
        employeeMap.put("Glad","Female");
        employeeMap.put("Desirae","Female");
        employeeMap.put("Kakalina","Female");
        employeeMap.put("Bertrando","Male");
        employeeMap.put("Ajay","Female");
        employeeMap.put("Brigitte","Female");
        employeeMap.put("Derk","Male");
        employeeMap.put("Orlando","Male");
        employeeMap.put("Selle","Female");
        employeeMap.put("Marika","Female");
        employeeMap.put("Griffy","Male");
        employeeMap.put("Shanon","Female");
        employeeMap.put("Clerkclaude","Male");
        employeeMap.put("Rickard","Male");
        employeeMap.put("Job","Male");
        employeeMap.put("Aida","Female");
        employeeMap.put("Alonzo","Male");
        // get name of all the female

        Set<  Map.Entry<String,String >  > entryView = employeeMap.entrySet();

        for (Map.Entry<String, String> eachEntry : entryView) {
            if (eachEntry.getValue().equals("Female")) {

                System.out.println("Name of Female employee = " + eachEntry.getKey());
            }
        }
        System.out.println("------------------------------------------------");

        for (Map.Entry<String, String> eachEntry : entryView) {
            if (eachEntry.getValue().equals("Female")){
                eachEntry.setValue("Queen");
            }else if (eachEntry.getValue().equals("Male")){
                eachEntry.setValue("King");
            }
        }
        for (Map.Entry<String, String> stringStringEntry : entryView) {
            System.out.println("each employee = " + stringStringEntry);
            
        }




    }
}
