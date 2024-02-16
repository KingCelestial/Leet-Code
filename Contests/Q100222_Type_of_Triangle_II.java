package Contests;

public class Q100222_Type_of_Triangle_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,4,2};
		System.out.println(checkType(arr));
		}

		private static String checkType(int[] nums) {
			// TODO Auto-generated method stub
			if (nums.length != 3) {
	            return "none";
	        }

	        if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
	            if (nums[0] == nums[1] && nums[1] == nums[2]) {
	                return "equilateral";
	            } else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
	                return "isosceles";
	            } else {
	                return "scalene";
	            }
	        } else {
	            return "none";
	        }
	    }
}
