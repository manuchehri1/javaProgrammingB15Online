package day58_exception2;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileNotFoundDemo {

    public static void main(String[] args) throws Exception {

                Files.readAllLines(Paths.get("file.txt"));
    }
}
