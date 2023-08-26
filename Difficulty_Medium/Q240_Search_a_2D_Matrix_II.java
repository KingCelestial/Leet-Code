package Difficulty_Medium;

public class Q240_Search_a_2D_Matrix_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		System.out.println(Search(arr,5));
	}
	public static boolean Search(int[][] arr,int T) {
		int r = arr.length-1;
		int c = 0;
		while(r>=0 && c<arr[0].length-1) {
			if(arr[r][c]==T) {
				return true;
			}
			else if(arr[r][c]>T) {
				r--;
			}
			else {
				c++;
			}
		}
		return false;
	}

}
