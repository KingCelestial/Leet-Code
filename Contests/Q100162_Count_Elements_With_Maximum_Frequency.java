package Contests;
import java.util.*;
public class Q100162_Count_Elements_With_Maximum_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,12,11,9,6,19,11};
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		int max = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(max < entry.getValue()) {
				max = entry.getValue();
			}
		}
		int count=0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(max == entry.getValue()) {
				count++;
			}
		}
		if(count == nums.length) {
			System.out.println(nums.length);
		} else if(count == 1) {
			System.out.println(max);
		} else {
			System.out.println(count*max);
		}
	}

}
