package java;

public class StringToChar {

    public static void main(String[] args) {
        String str = "hello";
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}