package Difficulty_Medium;
import java.util.*;
public class Q1249_Minimum_Remove_to_Make_Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "lee(t(c)o)de)";
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				count++;
			};
			if(s.charAt(i)==')') {
				count--;
			};
			if(count<0) {
				String temp = s.substring(0,i) + s.substring(i+1);
				s = temp;
				i=-1;
				count++;
			}

		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='(' && s.charAt(i)!=')') {
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
	}

}
