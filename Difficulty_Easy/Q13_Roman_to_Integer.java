package Difficulty_Easy;
import java.util.*;
public class Q13_Roman_to_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String s = "MCMXCIV";
		Map<Character,Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		check(map,s);
	}

	private static void check(Map<Character, Integer> map, String s) {
		// TODO Auto-generated method stub
		int sum =0;
//		for (int i = 0; i < s.length(); i++) {
//			if((i!=s.length()-1) && (s.charAt(i)=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X'))) {
//				sum += (map.get(s.charAt(i+1)) - map.get('I'));
//				i++;
//			}
//			
//			else if((i!=s.length()-1) && (s.charAt(i)=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C'))) {
//				sum += (map.get(s.charAt(i+1)) - map.get('X'));
//				i++;
//			}
//			
//			else if((i!=s.length()-1) && (s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M'))) {
//				sum += (map.get(s.charAt(i+1)) - map.get('C'));
//				i++;
//			}
//			
//			else {
//				sum += map.get(s.charAt(i));
//			}
//		}
		
		for (int i = 0; i < s.length(); i++) {
			if(i<s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
				sum-=map.get(s.charAt(i));
			} else {
				sum += map.get(s.charAt(i));
			}
		}
		System.out.println(sum);
	}

}
