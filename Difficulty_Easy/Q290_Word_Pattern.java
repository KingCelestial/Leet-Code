package Difficulty_Easy;

import java.util.HashMap;
import java.util.Map;

public class Q290_Word_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba";
		String s = "dog cat cat dog";
		System.out.println(check(pattern,s));
	}

	private static boolean check(String p, String s) {
		// TODO Auto-generated method stub
		String[] str = s.split(" ");
		if(p.length() !=str.length) {
			return false;
		}
		Map<Character,String> charToWord = new HashMap<>();
		Map<String,Character> wordToChar = new HashMap<>();
		for (int i = 0; i < p.length(); i++) {
			char c = p.charAt(i);
			String word = str[i];
			if(!charToWord.containsKey(c)) {
				charToWord.put(c,word);
			}
			if(!wordToChar.containsKey(word)) {
				wordToChar.put(word,c);
			}
			
			if(!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
				return false;
			}
			
			
		}
		return true;
	}

}
