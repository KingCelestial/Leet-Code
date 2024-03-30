package Difficulty_Hard;
import java.util.*;
public class Q239_Sliding_Window_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a );
		List<Integer> ans = new ArrayList<>();
		int k = 3;
		for(int i=0; i<k; i++) {
			pq.add(nums[i]);
		}
		for(int i=k;i<nums.length;i++) {
			ans.add(pq.peek());
			//grow
			pq.add(nums[i]);
			//shrink
			pq.remove(nums[i-k]);
		}
		ans.add(pq.peek());
		int[] res = new int[ans.size()];
		int i =0;
		for(int v: ans) {
			res[i] = v;
			i++;
		}
		System.out.println(ans);
	}

}
