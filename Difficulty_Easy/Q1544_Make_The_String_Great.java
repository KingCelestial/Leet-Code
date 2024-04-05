package Difficulty_Easy;

public class Q1544_Make_The_String_Great {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Pp";
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)-s.charAt(i+1) == 32 || s.charAt(i)-s.charAt(i+1) == -32) {
				System.out.println(s.charAt(i)+" "+s.charAt(i+1));
				s=s.subSequence(0, i) + s.subSequence(i+2, s.length()).toString();
				i=-1;
			}
		}
		System.out.println(s);
	}

}
