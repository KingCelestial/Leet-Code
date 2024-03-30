package Difficulty_Easy;
import java.util.*;
public class Q345_Reverse_Vowels_of_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		String vowels = "aeiouAEIOU";
		char[] ch = s.toCharArray();
		char[] vowelsArray = vowels.toCharArray();
		Set<Character> set = new HashSet<>();
		for(char v : vowelsArray) {
			set.add(v);
		}
		int i=0, j=ch.length-1;
		while(i<j) {
			if(set.contains(ch[i]) && set.contains(ch[j])) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
			else if(set.contains(ch[i])) {
				j--;
			}
			else if(set.contains(ch[j])) {
				i++;
			}
			else {
				i++;
				j--;
			}
		}
		String ans = new String(ch);
		System.out.println(ans);
	}

}
