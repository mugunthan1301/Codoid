package java;

import java.util.HashMap;

	public class DuplicateChars {
	    public static void main(String[] args) {
	        String str = "Hello World";
	        HashMap<Character, Integer> charCountMap = new HashMap<>();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (charCountMap.containsKey(ch)) {
	                int count = charCountMap.get(ch);
	                charCountMap.put(ch, count + 1);
	            } else {
	                charCountMap.put(ch, 1);
	            }
	        }
	        System.out.println("Duplicate characters in the string: " + str);
	        for (Character ch : charCountMap.keySet()) {
	            if (charCountMap.get(ch) > 1) {
	                System.out.println(ch + " - " + charCountMap.get(ch) + " times");
	            }
	        }
	    }
	}
