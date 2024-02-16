package Difficulty_Medium;

public class Q50_Pow_x_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.00000;
		long n = 10;
		System.out.println(check(x,n,0,1));
	}

	private static double check(double x, long n, int idx,double ans) {
		// TODO Auto-generated method stub
		
		if(idx==n) {
			return ans;
		}
		ans = ans*x;
		return check(x,n,idx+1,ans);
	}

}
