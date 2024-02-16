package Contests;

import java.util.*;

public class Q100165_Find_Beautiful_Indices_in_the_Given_Array_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "isawsquirrelnearmysquirrelhouseohmy";
		String a = "my";
		String b = "squirrel";
		int k = 15;
		List<Integer> lla = new ArrayList<>();
		List<Integer> llb = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==a.charAt(0)) {
				if(i+a.length() <= s.length()) {
					if(check(s.substring(i,i+a.length()),a)) {
						lla.add(i);
					};
				}
			}
			if(s.charAt(i)==b.charAt(0)) {
				if(i+b.length() <= s.length()) {
					if(check(s.substring(i,i+b.length()),b)) {
						llb.add(i);
					};
				}
			}
		}
		System.out.println(lla);
		System.out.println(llb);
	}

	private static boolean check(String substring, String ques) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ques.length(); i++) {
			if(substring.charAt(i)!=ques.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
