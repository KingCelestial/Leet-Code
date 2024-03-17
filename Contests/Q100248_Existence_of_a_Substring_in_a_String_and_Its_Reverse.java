package Contests;
import java.util.*;
public class Q100248_Existence_of_a_Substring_in_a_String_and_Its_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		Set<String> set = new HashSet<>();
		String str = "";
			int len = 2;
			for(int j=len; j<=s.length();j++) {
				int i = j-len;
				set.add(s.substring(i,j));
			}
			for(int i = s.length()-1; i>=0;i--) {
				str += s.charAt(i);
			}
			for(int j=len; j<=str.length();j++) {
				int i = j-len;
				if(s.contains(str.substring(i,j))){
					System.out.println(true);
					break;
				};
			}
			
	}

}
