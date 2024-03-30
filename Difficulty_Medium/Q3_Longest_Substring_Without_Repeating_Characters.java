package Difficulty_Medium;

import java.util.*;

public class Q3_Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkew";
		Map<Character, Integer> map = new HashMap<>();
		int start = 0, ans = 0;
		for (int end = 0; end < s.length(); end++) {
			map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);
			while (map.get(s.charAt(end)) > 1) {
				map.put(s.charAt(start), map.get(s.charAt(start))-1);
				start++;
			}
			ans = Math.max(ans, end - start+1);
		}
		System.out.println(ans);
	}

}
