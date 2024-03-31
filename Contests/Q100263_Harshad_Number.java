package Contests;

public class Q100263_Harshad_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 23;
		int temp = x;
		int sum=0;
		while(x>0) {
			int rem = x%10;
			sum += rem;
			x /= 10;
		}
		if(temp%sum ==0) {
			System.out.println(sum);
		} else {
			System.out.println(-1);
		}
	}

}
