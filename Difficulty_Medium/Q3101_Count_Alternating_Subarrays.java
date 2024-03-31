package Difficulty_Medium;

public class Q3101_Count_Alternating_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,1,1};
		long count = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (right > 0 && nums[right] == nums[right - 1]) {
                left = right;
            }
            count += right - left + 1;
        }
        System.out.println(count);;
	}

}
