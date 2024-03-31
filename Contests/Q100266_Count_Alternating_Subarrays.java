package Contests;

public class Q100266_Count_Alternating_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,2,7,5};
        int count = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            count += right - left + 1;
        }
        System.out.println(count);
	}

}
