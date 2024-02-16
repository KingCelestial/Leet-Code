package Difficulty_Medium;
import java.util.*;
public class Q151_Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a good   example";
		s.trim();
//		int i = s.length()-1;
//		String ans = "";
//		while(i>=0) {
//			if(s.charAt(i) == ' ' || i == 0) {
//				int j = i+1;
//				if(i==0) {
//					j=i;
//				}
//				boolean x = false;
//				while( j < s.length() && s.charAt(j) != ' ') {
//					ans = ans+s.charAt(j);
//					j++;
//					x = true;
//				}
//				if(x && i!=1) {
//					ans += ' ';
//				}
//			}
//			i--;
//		}
		
//		List<String> wordlist = Arrays.asList(s.split("\\s+"));
//		Collections.reverse(wordlist);
//		System.out.println(String.join(" ", wordlist));
		
		String[] words = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i=words.length-1; i>=0; i--) {
            if (!words[i].isEmpty())
                result.append(words[i]).append(" ");
        }
        for (int i = 0; i < words.length; i++) {
        	System.out.print(words[i]);
		}
		
	}

}
