package Difficulty_Easy;

public class Q338_Counting_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 2;
		 	int[] arr = new int[n+1];
	        for(int i=0; i<=n; i++){
	        	int j =i;
	            int c = 0;
	            while (j != 0) {
				j = j & (j - 1);
				c++;
			    }
	            arr[i] = c;
	        }
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
	}

}
