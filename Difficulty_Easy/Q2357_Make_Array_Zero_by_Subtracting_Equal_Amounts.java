package Difficulty_Easy;
import java.util.*;
public class Q2357_Make_Array_Zero_by_Subtracting_Equal_Amounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0};
		int item = 0;
		int sum=1;
		int count = -1;
		while(sum!=0) {
			count ++;
			int temp =0;
			Queue<Integer> pq = new PriorityQueue<>();
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]!=0) {
					pq.add(nums[i]);
					temp+=nums[i];
				}
			}
			sum=temp;
			if(pq.size()!=0) {
				item = pq.remove();
				for (int i = 0; i < nums.length; i++) {
					if(nums[i]==0) {
						continue;
					}else {
						nums[i] -= item;
					}
				}
			}
		}
		System.out.println(count);
	}

}
