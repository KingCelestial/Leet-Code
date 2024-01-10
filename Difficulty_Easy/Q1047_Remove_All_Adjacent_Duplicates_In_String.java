package Difficulty_Easy;
import java.util.*;
public class Q1047_Remove_All_Adjacent_Duplicates_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbaca";
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			if(!st.isEmpty() && s.charAt(i) == st.peek()) {
					st.pop();
				} else {
					st.push(s.charAt(i));
				}
			}
		String ans = "";
		for(char n: st) {
			ans+=n;
		}
		System.out.println(ans);
	}

}
