package Difficulty_Easy;

public class Q7_Reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1534236469;
		if(n<Integer.MIN_VALUE || n>Integer.MAX_VALUE) {
			System.out.println(0);
		}
		int sum=0;
		int mul = 10;
		for(int i=1;n!=0;i++) {
			int rem = n%10;
			sum=rem+sum*mul;
			n=n/10;
		}
		if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE) {
			System.out.println(0);
		}
		else {
			System.out.println(sum);
		}
		

	}

}
