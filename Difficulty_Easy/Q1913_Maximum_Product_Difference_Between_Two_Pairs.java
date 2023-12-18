package Difficulty_Easy;

public class Q1913_Maximum_Product_Difference_Between_Two_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,2,7,4};
		maximumPair(arr,0,0,Integer.MAX_VALUE,Integer.MAX_VALUE);
	}
	
	public static void maximumPair(int[] arr, int fb, int sb, int fs, int ss) {
		for(int n : arr) {
			if(n<fs) {
				ss = fs;
				fs = n;
			} else if (n<ss) {
				ss = n;
			}
			
			if(n>fb) {
				sb=fb;
				fb=n;
			} else if(n>sb) {
				sb=n;
			}
		}
		
		System.out.println(fb*sb - fs*ss);
	}

}
