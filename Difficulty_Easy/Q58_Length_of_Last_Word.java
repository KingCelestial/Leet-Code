package Difficulty_Easy;

public class Q58_Length_of_Last_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   fly me   to   the moon  ";
		int lastWord = s.length()-1;
		int count = 0;
		while(lastWord >= 0 && s.charAt(lastWord)==' ') {
			lastWord--;
		}
		
		while(lastWord>=0 && s.charAt(lastWord) != ' ') {
			lastWord--;
			count++;
		}
//		s = s.trim();
//		System.out.println(s.length() - s.lastIndexOf(" ") -1);
	}

}
