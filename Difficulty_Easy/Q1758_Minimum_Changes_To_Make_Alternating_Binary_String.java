package Difficulty_Easy;

public class Q1758_Minimum_Changes_To_Make_Alternating_Binary_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "00";
		int n = s.length(), count=0;
		if(n==1) System.out.println(0);
		for(int i=0; i<n; i++) {
			if(i %2 == 0 && s.charAt(i) == '1') count++;
			if(i % 2 == 1 && s.charAt(i) == '0') count++;
		}
		System.out.println(Math.min(count, n-count)); 
	}

}
