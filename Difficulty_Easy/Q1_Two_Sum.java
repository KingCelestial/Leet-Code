package Difficulty_Easy;

public class Q1_Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {3,2,3};
		int n = 6;
		twosum(arr,n);
	}
	
	public static void twosum(int []arr, int n) {
		int i=0;
		
		int []newarr = new int[2];
		for(;i<arr.length;i++) {
			int j=0;
			for(;j<arr.length;j++) {
				if(i==j) {
					break;
				}
				if(arr[i]+arr[j]==n) {
					newarr[0]=i;
					newarr[1]=j;
					System.out.println(i + " " + j);
				}
			}
		}
//		return newarr;
	}

}
