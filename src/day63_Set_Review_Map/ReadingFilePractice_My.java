package day63_Set_Review_Map;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFilePractice_My {
    public static void main(String[] args) throws IOException {

        List<String> allData = Files.readAllLines(Paths.get("src/day63/employeeData.txt"));
    }
}
