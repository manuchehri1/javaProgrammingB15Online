package day58_exception2;
import java.util.*;
public class OutOfMemoryDemo {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(999999999);

        for (int i = 0; i >0 ; i++) {
            nums.add(i);
        }

    }

}
