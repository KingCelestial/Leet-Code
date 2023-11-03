package Contests;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,8,7,10,2};
		Check(arr,0,1,2);
	}
	public static void Check(int[] arr, int i, int j, int k) {
		if(arr[i]<arr[j] && arr[j]<arr[k] || arr[i]<arr[j] && arr[k]<arr[j]) {
			System.out.println(arr[i]+arr[j]+arr[k]);
		}
		if(arr[i]>arr[j]) {
			return;
		}
		if(k==arr.length-1) {
			System.out.println(-1);
			return;
		}
		Check(arr,i+1,j,k);
		Check(arr,i,j+1,k);
		Check(arr,i,j,k+1);
	}

}
