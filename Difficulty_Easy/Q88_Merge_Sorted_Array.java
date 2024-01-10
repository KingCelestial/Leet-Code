package Difficulty_Easy;

public class Q88_Merge_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,5,6,0,0,0};
		int[] nums2 = {1,2,3};
		int m = 3;
		int n = 3;
		int r1=m-1;
		int r2=n-1;
		for(int w = m+n-1;w>=0;w--) {
			if(r1 >= 0 && r2>=0) {
				nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
			} else if(r1>=0) {
				nums1[w] = nums1[r1--];
			} else {
				nums1[w] = nums2[r2--];
			}
		}
		for (int j2 = 0; j2 < nums1.length; j2++) {
			System.out.print(nums1[j2]+" ");
		}
	}

}
