package Contests;
import java.util.*;
public class Q100224_Split_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6,1,3,1,1,8,9,2};
		Arrays.sort(nums);
		Set<Integer> l1 = new HashSet<>();
		Set<Integer> l2 = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			l1.add(nums[i]);
			i++;
			l2.add(nums[i]);
		}
		System.out.println(l1);
		System.out.println(l2);
		
		if(l1.size() == l2.size()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
