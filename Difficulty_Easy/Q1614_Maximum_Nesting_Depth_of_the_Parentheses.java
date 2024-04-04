package Difficulty_Easy;

import java.util.*;

public class Q1614_Maximum_Nesting_Depth_of_the_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "8*((1*(5+6))*(8/6))";
		Stack<Character> st = new Stack<>();
		int count=0,ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				st.push(s.charAt(i));
				count++;
			}
			if (s.charAt(i) == ')') {
				st.pop();
				count--;

			}
			ans = Math.max(ans, count);
		}

		System.out.println(ans);
	}

}
