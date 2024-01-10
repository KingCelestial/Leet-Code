package Difficulty_Easy;

import java.util.*;

public class Q1897_Redistribute_Characters_to_Make_All_Strings_Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"abc","aabc","bc"};
		checks(arr);
	}

	private static void checks(String[] words) {
		// TODO Auto-generated method stub
		Map<Character, Integer> charCount = new HashMap<>();
		
		for(String word : words) {
			for(char c : word.toCharArray()) {
				charCount.put(c, charCount.getOrDefault(c, 0)+1);
			}
		}
		
		int n = words.length;
		
		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue() % n !=0) {
				System.out.println(false);
			}
		}
		System.out.println(true);
	}

}
