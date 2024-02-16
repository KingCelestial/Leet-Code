package Difficulty_Easy;

public class Q344_Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h','e','l','l','o'};
		int si =0;
		int ei = s.length-1;
		while(si<ei) {
			char temp = s[ei];
			s[ei] = s[si];
			s[si] = temp;
			si++;
			ei--;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] +" ");
		}
	}

}
