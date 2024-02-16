package Difficulty_Easy;

public class Q28_Find_the_Index_of_the_First_Occurrence_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "mississippi", needle = "issipi";
		int j=0;
		if(needle.length() > haystack.length()) {
			
		}
		for(int i=0; i<haystack.length();i++) {
			if(haystack.charAt(i)==needle.charAt(0)) {
				j=i;
				for (int l = 0; l < needle.length() && j < haystack.length(); l++) {
					if(haystack.charAt(j)!=needle.charAt(l)) {
						break;
					} else if (l == needle.length()-1) {
						System.out.println(i);
						break;
					}
					j++;
				}
			}
		}
		System.out.println(-1);
	}

}
