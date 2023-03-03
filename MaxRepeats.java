package java;
import java.util.*;
public class MaxRepeats {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        int maxCount = 0;
        for (int count : charCounts.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("Maximum Repeated Character Count: " + maxCount);
    }
}