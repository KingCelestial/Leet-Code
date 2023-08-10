package Difficulty_Easy;

public class Q202_Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 101;
		System.out.println(happynumber(n));
		}
	public static boolean happynumber(int n) {
		while(n>1) {
			int sum=0;
			while(n>0) {
				int rem = n%10;
				sum=sum+rem*rem;
				n=n/10;
				if(sum==1) {
					break;
				}
			}
			n=sum;
		}
			return n==1;	
	}
		
	}

