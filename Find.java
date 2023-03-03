package java;
import java.util.*;
public class Find {
   public static void main(String[] args) {
        String str = "hello world";
        Set<Character> seenChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (seenChars.contains(c)) {
                duplicateChars.add(c);
            } else {
                seenChars.add(c);
            }
        }

        System.out.println("Duplicate Characters: " + duplicateChars);
    }
}