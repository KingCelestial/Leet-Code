package Contests;

public class UnSol_Minimum_Sum_of_Mountain_Triplets_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6,5,4,3,4,5 };
		Check(arr);
	}
	public static int Check(int[] arr) {
		int max=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					for(int k=j+1;k<arr.length;k++) {
						if(arr[j]>arr[k]) {
							int sum = arr[i]+arr[j]+arr[k];
							if(sum<max) {
								max=sum;
							}
						}
						else if (arr[k]<arr[j]) {
							int sum = arr[i]+arr[j]+arr[k];
							if(sum<max) {
								max=sum;
							}
						}
					}
				}
			}
		}
		return max;
	}

}
