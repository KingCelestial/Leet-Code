package Contests;

import java.util.Iterator;

public class Q100212_Count_Prefix_and_Suffix_Pairs_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"a","aba","ababa","aa"};
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if(words[i].length()>words[j].length()) {
					continue;
				}
				if(check(words[i],words[j])) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private static boolean check(String str1, String str2) {
		// TODO Auto-generated method stub
		int ei = str2.length()-1;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		for (int i = str1.length()-1; i >=0; i--) {
			if(str1.charAt(i)!=str2.charAt(ei)) {
				return false;
			}
			ei--;
		}
		return true;
	}

}
