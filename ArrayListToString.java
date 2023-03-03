package java;
import java.util.ArrayList;

public class ArrayListToString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        String str = list.toString();
        System.out.println(str);
    }
}