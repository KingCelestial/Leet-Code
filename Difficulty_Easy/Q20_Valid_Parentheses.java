package Difficulty_Easy;
import java.util.*;
public class Q20_Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "({[)";
		Stack<Character> st = new Stack<>();
		for(int i=0; i<s.length();i++) {
			if(st.empty()) {
				st.push(s.charAt(i));
			} else if(st.peek() == '('  && s.charAt(i)==')') {
				st.pop();
			} else if(st.peek()=='{' &&  s.charAt(i)=='}') {
				st.pop();
			} else if(st.peek()=='[' &&  s.charAt(i)==']') {
				st.pop();
			} else {
				st.push(s.charAt(i));
			}
		}
		if(st.empty()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
