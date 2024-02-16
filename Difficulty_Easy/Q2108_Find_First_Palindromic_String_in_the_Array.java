package Difficulty_Easy;

public class Q2108_Find_First_Palindromic_String_in_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "def","ghi" };
		boolean tracker = true;
		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			if(Check(s)) {
				System.out.println(s);
				tracker = false;
				break;
			}
		}
		if(tracker) System.out.println("");
	}

	private static boolean Check(String s) {
		// TODO Auto-generated method stub
		int si=0;
		int ei = s.length()-1;
		while(si<ei) {
			if(s.charAt(si) != s.charAt(ei)) {
				return false;
			}
			si++;
			ei--;
		}
		return true;
	}

}
