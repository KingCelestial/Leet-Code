package Contests;

public class Matrix_Similarity_After_Cyclic_Shifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,1,2},{5,4,5,4},{6,3,6,3}};
		int k = 1;
		System.out.println(rotate(arr,k));
	}
	public static boolean rotate(int[][] arr, int k) {
		int[][] arr1 = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr1[i][j]=arr[i][j];
			}
		}
		for(int l=0;l<k;l++) {
				for(int i=0;i<arr.length;i++) {
					if(i%2==0) {
						int temp = arr[i][0];
						for(int j=1;j<arr[0].length;j++) {
							arr[i][j-1]=arr[i][j];
							
						}
						arr[i][arr.length] = temp;
					} else {
						int temp = arr[i][arr.length];
						for(int j=arr.length;j>0;j--) {
							arr[i][j]=arr[i][j-1];
						}
						arr[i][0] = temp;
					}
				}
					
				}
		for(int i=0; i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				if(arr[i][j] != arr1[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
