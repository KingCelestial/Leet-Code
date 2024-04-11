package Difficulty_Medium;

import java.util.*;

public class Q402_Remove_K_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "1432219";
		int k = 3;
		LinkedList<Character> stack = new LinkedList<Character>();
		for (char digit : num.toCharArray()) {

			while (stack.size() > 0 && k > 0 && stack.peekLast() > digit) {
				stack.removeLast();
				k -= 1;
			}
			stack.addLast(digit);
		}

		for (int i = 0; i < k; ++i) {
			stack.removeLast();
		}

		StringBuilder res = new StringBuilder();
		boolean zeros = true;
		for(char digit : stack) {
			if(zeros && digit == '0') continue;
			zeros=false;
			res.append(digit);
		}
		
		if(res.length()==0) System.out.println("0");
		System.out.println(res.toString());

	}

}
