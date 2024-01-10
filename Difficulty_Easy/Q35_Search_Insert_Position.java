package Difficulty_Easy;

public class Q35_Search_Insert_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 7;
		int si = 0;
		int ei = nums.length-1;
		while(si<=ei) {
			int mid = (si+ei)/2;
			if(nums[mid] == target) {
				System.out.println(mid);
				break;
			} else if(nums[mid] > target){
				ei = mid-1;
			} else {
				si = mid +1;
			}
		}
		System.out.println(si);
	}

}
