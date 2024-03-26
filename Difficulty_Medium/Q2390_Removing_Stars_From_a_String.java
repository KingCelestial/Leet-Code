package Difficulty_Medium;

import java.util.*;

public class Q2390_Removing_Stars_From_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leet**cod*e";
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '*') {
				sb.deleteCharAt(sb.length() - 1);
				continue;
			}
			sb.append(ch[i]);
		}
		System.out.println(sb.toString());
	}

}
