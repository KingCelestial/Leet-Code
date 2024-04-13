package Contests;

public class Q100270_Score_of_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "zaz";
			int sum=0;
			for(int i=0; i<s.length()-1; i++) {
				sum += Math.abs(s.charAt(i) - s.charAt(i+1));
			}
			System.out.println(sum);
	}

}
