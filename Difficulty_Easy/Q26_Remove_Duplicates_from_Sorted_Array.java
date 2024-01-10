package Difficulty_Easy;

public class Q26_Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int idx=1;
        int i=1;
        if(nums.length!=0) {
        	while(i<nums.length) {
            	if(nums[i] != nums[i - 1]) {
            		nums[idx] = nums[i];
            		i++;
            		idx++;
            	} else {
            		i++;
            	}
            }
        	System.out.println(idx);
    	} else {
    		System.out.println(0);
    	}
	}

}
