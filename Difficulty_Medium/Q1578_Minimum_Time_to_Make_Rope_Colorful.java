package Difficulty_Medium;

public class Q1578_Minimum_Time_to_Make_Rope_Colorful {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colors = "aaabba";
		int[] neededTime = {7,5,6,4,5,3};
		check(colors, neededTime);
	}
	
	public static void check(String c, int[] t) {
		int time=0;
		for(int i=1; i<c.length();i++) {
			if(c.charAt(i) == c.charAt(i-1)) {
				time += Math.min(t[i], t[i-1]);
				 t[i] = Math.max(t[i], t[i - 1]);
			}
		}
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i]+" ");
		}
		System.out.println(time);
	}

}
