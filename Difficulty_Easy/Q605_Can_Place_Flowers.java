package Difficulty_Easy;

public class Q605_Can_Place_Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,0,0,0,1};
		int n = 2;
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				boolean emptyBedLeft = (i==0) || (nums[i-1]==0);
				boolean emptyBedRight = (i==nums.length-1) || (nums[i+1]==0);
				
				if(emptyBedLeft && emptyBedRight) {
					nums[i] = 1;
					count++;
				}
			}
		}
		if(count>=n) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
