package Difficulty_Easy;
import java.util.*;
public class Q2942_Find_Words_Containing_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"abc","bcd","aaaa","cbc"};
		char x = 'a';
		List<Integer> al = new ArrayList<>();
		int j =0;
		for(String s : words) {
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)==x) {
					al.add(j);
					break;
				}
			}
			j++;
		}
		System.out.println(al);
	}

}
