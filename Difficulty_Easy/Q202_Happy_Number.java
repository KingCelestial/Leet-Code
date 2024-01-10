package Difficulty_Easy;

public class Q202_Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		System.out.println(happynumber(n));
		}
	public static boolean happynumber(int n) {
		if(n==1 || n==7) {
			return true;
		}
		while(n>9) {
			int sum=0;
			while(n>0) {
				int rem = n%10;
				sum=sum+rem*rem;
				n=n/10;
			}
			n=sum;
			if(n==1 || n==7) {
				return true;
			}
		}
		return false;
		
	}
		
}

