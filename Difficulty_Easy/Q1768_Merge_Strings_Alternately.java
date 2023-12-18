package Difficulty_Easy;

public class Q1768_Merge_Strings_Alternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "pq";
		merge(s1, s2, "");
	}
	
	public static void merge(String s1, String s2, String ans) {
		int k=0;
		for(;k<s1.length() && k<s2.length();k++) {
			ans=ans+s1.charAt(k)+s2.charAt(k);
		}
		System.out.println(ans+s1.substring(k)+s2.substring(k));
	}

}
