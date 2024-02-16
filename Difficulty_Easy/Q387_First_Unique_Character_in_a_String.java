package Difficulty_Easy;
import java.util.*;
public class Q387_First_Unique_Character_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabb";
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0; i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		for(int i=0; i<s.length();i++) {
			if(map.get(s.charAt(i))==1) {
				System.out.println(i);
				break;
			}
		}
	}

}
