package Difficulty_Easy;
import java.util.*;
public class Q205_Isomorphic_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "egg";
		String t = "add";
		check(s,t);
	}

	private static Boolean check(String s, String t) {
		// TODO Auto-generated method stub
		int map1[] = new int[256];
		int map2[] = new int[256];
		
		if(s.length() != t.length()) {
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if(map1[s.charAt(i)] != map2[t.charAt(i)]) {
				return false;
			}
			
			map1[s.charAt(i)] = i+1;
			map2[t.charAt(i)] = i+1;
		}
		
		return true;
	}

}
