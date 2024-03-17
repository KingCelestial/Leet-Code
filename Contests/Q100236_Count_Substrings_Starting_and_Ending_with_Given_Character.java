package Contests;

public class Q100236_Count_Substrings_Starting_and_Ending_with_Given_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bbbbiz";
		char c = 'b';
		int count = 0;
		int i=0,j=0;
	    while (i < s.length()) {
	        if (s.charAt(i) == c) {
	            j = i + 1;
	            while (j < s.length()) {
	                if (s.charAt(j) == c) {
	                    count++;
	                }
	                j++;
	            }
	        }
	        i++;
	    }
		System.out.println(count);
	}

}
