package Contests;
import java.util.*;
public class Q100211_Apply_Operations_to_Make_String_Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabcbbca";
		Map<Character, Integer> map = new HashMap<>();
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		System.out.println(s);
		
		for(char ch ='a'; ch<='z';ch++) {
			if(map.containsKey(ch)) {
				int index = s.indexOf(ch);
				if(index!=-1) {
					s = s.substring(0,index) + s.substring(index+1);
				}
			}
		}
		System.out.println(s);
	}

}
