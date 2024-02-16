package Difficulty_Easy;

public class Q557_Reverse_Words_in_a_String_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Let's take LeetCode contest";
		int si =0;
		int ei =0;
		String ans = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' ' || i == s.length()-1) {
				if(i==s.length()-1) {
					ei=i;
				} else {
					ei=i-1;
				}
				while(ei>=si) {
					ans += s.charAt(ei);
					ei--;
				}
				if(i != s.length()-1) {
					ans += ' ';
				}
				si=i+1;
				ei=i+1;
			}
		}
		System.out.println(ans);
	}
}
