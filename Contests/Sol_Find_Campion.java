package Contests;

public class Sol_Find_Campion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0,1,1},
					   {0,0,0},
					   {0,1,0}};
		int max =0;
		int tsum=0;
		for(int i=0; i<arr.length;i++) {
			int sum=0;
			for(int j=0; j<arr[0].length;j++) {
				sum=sum+arr[i][j];
				}
			if(tsum<sum) {
				tsum=sum;
				max=i;
			}
		}
		System.out.println(max);
	}

}
