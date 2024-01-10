package Difficulty_Easy;
import java.util.*;
public class Q242_Valid_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram", t = "nagaram";
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for (int i = 0; i < t.length(); i++) {
			if(map.containsKey(t.charAt(i))) {
				map.put(t.charAt(i), map.get(t.charAt(i))-1);
				if(map.get(t.charAt(i))==0) {
					map.remove(t.charAt(i));
				}
			} else {
				System.out.println("Not an Anagram");
				break;
			}
		}
		System.out.println("Valid Anagram");
		System.out.println(map.size());
		System.out.println(map);
	}

}
