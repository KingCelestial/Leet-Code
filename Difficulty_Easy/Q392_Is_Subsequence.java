package Difficulty_Easy;
import java.util.*;
public class Q392_Is_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "axc", t = "ahbgdc";
		int a =0;
		int b =0;
		while(a<s.length() && b<t.length()) {
			if(s.charAt(a)==t.charAt(b)) {
				a++;
			}
			b++;
		}
		if(a==s.length()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
