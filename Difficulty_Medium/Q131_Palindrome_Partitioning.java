package Difficulty_Medium;

import java.util.*;

public class Q131_Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aab";
		List<List<String>> ll = new ArrayList<>();
		partitioning(s,new ArrayList<>(),ll);
		for(List<String> sublist : ll) {
			System.out.println(sublist);
		}
	}

	private static List<List<String>> partitioning(String ques, List<String> ans, List<List<String>> ll) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			ll.add(new ArrayList<>(ans));
			return null;
		}
		
		
		for(int i=1; i<=ques.length();i++) {
			String s = ques.substring(0,i);
			if(ispalindrome(s)) {
				ans.add(s);
				partitioning(ques.substring(i), ans, ll);
				ans.remove(ans.size() - 1);
			}
		}
		
		return ll;
	}

	private static boolean ispalindrome(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	

}
